package tcube.eclabcompanion;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {
    DownloadFileAsync download =  new DownloadFileAsync(); //Object of the AsyncTask Class.
    ImageButton course; //Single Button Which dynamically changes.
    CircleButton course_icon,add_button;
    int screen_flag; //Flag to move back and forth screens
    RelativeLayout.LayoutParams lp; //Used to dynamically set the courses.
    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    private ProgressDialog mProgressDialog;
    String source,destin; //Strings to set our zip and extracted folder.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen_flag = 1; //We are at root view, Back button will prompt exit qstn
        file_check(); //Check the downloaded files.


    }
    @Override
    public void onBackPressed() { // It is the Exit button Question
        if (screen_flag == 1) { //If at root view ,
            new AlertDialog.Builder(this)
                    .setMessage("Do you really want to exit ?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.finish(); //Close the App
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        } else {
            setContentView(R.layout.activity_main); //Set root view.
            setTitle("EC Lab Companion");
            screen_flag = 1; //If not at root view , brings to root view.
            file_check(); //Check downloaded files to set which courses to show.
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        file_check();
        // on starting what to do
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        file_check();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void course_popup(View view) {
        Toast.makeText(getBaseContext(), "Checking Downloaded Courses", Toast.LENGTH_SHORT).show();
        list_courses();     //Go to Courses View . which is the download / delete area.
    }

    public void list_courses() {
        setContentView(R.layout.course_list);               //Replaced dialog with an entire screen
        setTitle("Courses");
        screen_flag = 0; //We are not at root view .
        course = (ImageButton) findViewById(R.id.course_1_available);
        File Obb = getObbDir();   //In beta we are storing data in Obb folder , which is publicly visible.
        File fileCheck = new File (Obb,"s1bec");  // Checking for downloaded files
        if (fileCheck.isDirectory()) { //If file is present ..
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s1bec(); //..Deletes the course
                }
            });
        } else { //If not ..
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s1bec(); //..Download the course.
                }
            });
        }
        fileCheck = new File(Obb,"s3ecc"); //The above process is repeated for all courses.
        course = (ImageButton) findViewById(R.id.course_2_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s3ecc();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s3ecc();
                }
            });
        }
        fileCheck = new File(Obb,"s3eda");
        course = (ImageButton) findViewById(R.id.course_3_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s3eda();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s3eda();
                }
            });
        }
        fileCheck = new File(Obb,"s4aic");
        course = (ImageButton) findViewById(R.id.course_4_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s4aic();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s4aic();
                }
            });
        }
        fileCheck = new File(Obb,"s4lcd");
        course = (ImageButton) findViewById(R.id.course_5_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s4lcd();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s4lcd();
                }
            });
        }
        fileCheck = new File(Obb,"s5dsp");
        course = (ImageButton) findViewById(R.id.course_6_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s5dsp();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s5dsp();
                }
            });
        }
        fileCheck = new File(Obb,"s5pow");
        course = (ImageButton) findViewById(R.id.course_7_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s5pow();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s5pow();
                }
            });
        }
        fileCheck = new File(Obb,"s6mic");
        course = (ImageButton) findViewById(R.id.course_8_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s6mic();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s6mic();
                }
            });
        }
        fileCheck = new File(Obb,"s6come");
        course = (ImageButton) findViewById(R.id.course_9_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s6come();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s6come();
                }
            });
        }
        fileCheck = new File(Obb,"s7coms");
        course = (ImageButton) findViewById(R.id.course_10_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s7coms();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s7coms();
                }
            });
        }
    }

    public void file_check() { //This function dynamically sets the course images based on the presence of corresponding folder.
        course_icon = (CircleButton) findViewById(R.id.s1bec);
        add_button = (CircleButton) findViewById(R.id.button);
        File Obb = getObbDir();
        File fileCheck = new File (Obb,"s1bec"); // Checking for downloaded files
        if (fileCheck.isDirectory()) { //If Course is present ..
             //Make the button visible and adjust its layout params.
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else { //If course is not present ..
            course_icon.setColor(getResources().getColor(R.color.colorBG));
               // Make the button invisible.
        }
        course_icon = (CircleButton) findViewById(R.id.s3eda); //Same process is repeated for all courses.
        fileCheck = new File (Obb,"s3eda");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {

            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
        course_icon = (CircleButton) findViewById(R.id.s3ecc);
        fileCheck = new File (Obb,"s3ecc");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {

            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s4aic);
        fileCheck = new File (Obb,"s4aic");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
        course_icon = (CircleButton) findViewById(R.id.s4lcd);
        fileCheck = new File (Obb,"s4lcd");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s5dsp);
        fileCheck = new File (Obb,"s5dsp");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s5pow);
        fileCheck = new File (Obb,"s5pow");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s6mic);
        fileCheck = new File (Obb,"s6mic");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s6come);
        fileCheck = new File (Obb,"s6come");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
                    }
        course_icon = (CircleButton) findViewById(R.id.s7coms);
        fileCheck = new File (Obb,"s7coms");
        if (fileCheck.isDirectory()) {
            lp = (RelativeLayout.LayoutParams)course_icon.getLayoutParams();
            lp.addRule(RelativeLayout.CENTER_HORIZONTAL); //Problem
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            course_icon.setLayoutParams(lp);
        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void fetch_s1bec() { //Network Thread Creator to fetch the course.
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s1bec.zip";
            destin = "s1bec";
            String url = "https://www.dropbox.com/s/y2t7pqbryiqjv80/s1bec.zip?dl=1";
            download.execute(url); //Pass The Url
        }
    }

    public void fetch_s3ecc() { //The above process is repeated for all courses.
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s3eda() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s4aic() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s4lcd() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s5dsp() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s5pow() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s6mic() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s6come() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s7coms() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void delete_s1bec() { //Delete the downloaded folder .. make sure zip is deleted before that
        File Obb = getObbDir();
        File file = new File(Obb, "s1bec");
        if( file.exists() ) {
            File[] files = file.listFiles();
            for(int i=0; i<files.length; i++) {
                files[i].delete();
            }
        }
        file.delete();
        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        setTitle("EC Lab Companion");
        file_check();
        screen_flag = 1; //Get back to the root view
    }

    public void delete_s3ecc() {
        //To be added Later
    }

    public void delete_s3eda() {
        //To be added Later
    }

    public void delete_s4aic() {
        //To be added Later
    }

    public void delete_s4lcd() {
        //To be added Later
    }

    public void delete_s5dsp() {
        //To be added Later
    }

    public void delete_s5pow() {
        //To be added Later
    }

    public void delete_s6mic() {
        //To be added Later
    }

    public void delete_s6come() {
        //To be added Later
    }

    public void delete_s7coms() {
        //To be added Later
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void unzip(String zipFile,String location) throws IOException {
        int BUFFER_SIZE = 1024;
        byte[] buffer = new byte[BUFFER_SIZE];
        try {
            if (!location.endsWith("/")) {
                location += "/";
            }
            File f = new File(location);
            if (!f.isDirectory()) {
                f.mkdirs();
            }
            ZipInputStream zin = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFile), BUFFER_SIZE));
            try {
                ZipEntry ze = null;
                while ((ze = zin.getNextEntry()) != null) {
                    String path = location + ze.getName();
                    File unzipFile = new File(path);

                    if (ze.isDirectory()) {
                        if (!unzipFile.isDirectory()) {
                            unzipFile.mkdirs();
                        }
                    } else {
                        // check for and create parent directories if they don't exist
                        File parentDir = unzipFile.getParentFile();
                        if (null != parentDir) {
                            if (!parentDir.isDirectory()) {
                                parentDir.mkdirs();
                            }
                        }
                        // unzip the file
                        FileOutputStream out = new FileOutputStream(unzipFile, false);
                        BufferedOutputStream fout = new BufferedOutputStream(out, BUFFER_SIZE);
                        try {
                            int size;
                            while ((size = zin.read(buffer, 0, BUFFER_SIZE)) != -1) {
                                fout.write(buffer, 0, size);
                            }

                            zin.closeEntry();
                        } finally {
                            fout.flush();
                            fout.close();
                        }
                    }
                }
            } finally {
                zin.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void s1bec_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s1bec");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s3ecc_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s3ecc");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s3eda_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s3eda");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s4aic_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s4aic");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s4lcd_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s4lcd");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s5dsp_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s5dsp");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s5pow_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s5pow");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s6mic_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s6mic");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s6come_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s6come");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }

    public void s7coms_go(View view){
        File Obb = getObbDir();
        File file = new File(Obb, "s7coms");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please download course", Toast.LENGTH_SHORT).show();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_DOWNLOAD_PROGRESS:
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setMessage("Downloading Course ..");
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                mProgressDialog.setCancelable(true);
                mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override //This function is problematic because even if the download fails, it shows successful.
                    public void onCancel(DialogInterface dialog) {
                        Toast.makeText(getBaseContext(), "Download Failed", Toast.LENGTH_SHORT).show();
                        setContentView(R.layout.activity_main);
                        screen_flag=1; //Back to root view.
                        setTitle("EC Lab Companion");
                        file_check();
                        download.cancel(true);
                    }
                });
                mProgressDialog.show();
                return mProgressDialog;
            default:
                return null;
        }
    }

    private class DownloadFileAsync extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getBaseContext(), "Preparing for Download", Toast.LENGTH_SHORT).show();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);
                final File storage_root = getObbDir();
                final File extracted = new File(storage_root, destin);
                final File file = new File(storage_root, source);
                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream(file);

                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress(""+(int)((total*100)/lenghtOfFile));
                    output.write(data, 0, count);
                }

                output.flush();
                output.close();
                input.close();
                unzip(file.getAbsolutePath(),extracted.getAbsolutePath());
            } catch (Exception e) {}
            return null;

        }
        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC",progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
            setContentView(R.layout.activity_main);
            screen_flag = 1;
            file_check();
            Toast.makeText(getBaseContext(), "Download Completed", Toast.LENGTH_SHORT).show();
        }
    }


}
