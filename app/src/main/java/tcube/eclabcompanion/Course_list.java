package tcube.eclabcompanion;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Course_list extends AppCompatActivity {
    Toolbar Course_toolbar;
    int screen_flag; //Flag to move back and forth screens
    //RelativeLayout.LayoutParams lp; //Used to dynamically set the courses.
    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    private ProgressDialog mProgressDialog;
    String source,destin;
    DownloadFileAsync download =  new DownloadFileAsync(); //Object of the AsyncTask Class.
    ImageButton course; //Single Button Which dynamically changes.
    MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_list);
        file_check();
        mainActivity=new MainActivity();
        Course_toolbar= (Toolbar) findViewById(R.id.course_toolbar);
        setSupportActionBar(Course_toolbar);
        getSupportActionBar().setTitle("Courses");
        Course_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        }

    public void file_check() {
        course = (ImageButton) findViewById(R.id.course_1_available);
        File Obb = getObbDir();


        File fileCheck = new File(Obb, "s1bec");  // Checking for downloaded files
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
        fileCheck = new File(Obb, "s3ecc"); //The above process is repeated for all courses.
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
        fileCheck = new File(Obb, "s3eda");
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
        fileCheck = new File(Obb, "s4aic");
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
        fileCheck = new File(Obb, "s4lcd");
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
        fileCheck = new File(Obb, "s5dsp");
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
        fileCheck = new File(Obb, "s5pow");
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
        fileCheck = new File(Obb, "s6mpmc");
        course = (ImageButton) findViewById(R.id.course_8_available);
        if (fileCheck.isDirectory()) {
            course.setBackgroundResource(R.mipmap.delete);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete_s6mpmc();
                }
            });
        } else {
            course.setBackgroundResource(R.mipmap.download);
            course.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetch_s6mpmc();
                }
            });
        }
        fileCheck = new File(Obb, "s6come");
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
        fileCheck = new File(Obb, "s7coms");
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
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s3ecc.zip";
            destin = "s3ecc";
            String url = "https://www.dropbox.com/s/2jpkp3r0uj8dcui/s3ecc.zip?dl=1";
            download.execute(url); //Pass The Url
        }
    }

    public void fetch_s3eda() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s4aic() {
        //Network Thread Creator to fetch the course.
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s4aic.zip";
            destin = "s4aic";
            String url = "https://www.dropbox.com/s/rbf832zlqdycxa2/s4aic.zip?dl=1";
            download.execute(url); //Pass The Url
        }
        //Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s4lcd() {
        //Network Thread Creator to fetch the course.
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s4lcd.zip";
            destin = "s4lcd";
            String url = "https://www.dropbox.com/s/z911u37efkm0cfz/s4lcd.zip?dl=1";
            download.execute(url); //Pass The Url
        }
        //Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s5dsp() {
        //Network Thread Creator to fetch the course.
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s5dsp.zip";
            destin = "s5dsp";
            String url = "https://www.dropbox.com/s/5zsrzqnqlzmf50j/s5dsp.zip?dl=1";
            download.execute(url); //Pass The Url
        }
        //Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s5pow() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s6mpmc() {
        //Network Thread Creator to fetch the course.
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
        if (!(activeNetwork != null && activeNetwork.isConnected())) { // notify user you are offline
            Toast.makeText(getBaseContext(), "Connection Error. Are You Online ?", Toast.LENGTH_SHORT).show();
        } else {
            source = "s6mpmc.zip";
            destin = "s6mpmc";
            String url = "https://www.dropbox.com/s/jnmdkjlg77irjbq/s6mpmc.zip?dl=1";
            download.execute(url); //Pass The Url
        }
        //Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s6come() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }

    public void fetch_s7coms() {
        Toast.makeText(getBaseContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void delete_s1bec() { //Delete the downloaded folder .. make sure zip is deleted before that
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s1bec");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s3ecc() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s3ecc");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s3eda() {
        //To be added Later
    }

    public void delete_s4aic() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s4aic");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s4lcd() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s4lcd");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s5dsp() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s5dsp");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s5pow() {
        //To be added Later
    }

    public void delete_s6mpmc() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to delete this Course ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        File Obb = getObbDir();
                        boolean log;
                        File file = new File(Obb, "s6mpmc");
                        if( file.exists() ) {
                            File[] files = file.listFiles();
                            for(int j=0; j<files.length; j++) {
                                if(files[j].isDirectory()) {
                                    File[] files2 = files[j].listFiles();
                                    for (int k=0;k < files2.length;k++){
                                        log = files2[k].delete();
                                    }
                                }
                                log = files[j].delete();
                            }
                        }
                        log = file.delete();
                        file_check();
                        Toast.makeText(getBaseContext(), "Course Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void delete_s6come() {
        //To be added Later
    }

    public void delete_s7coms() {
        //To be added Later
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void unzip(String zipFile,String location) {
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
                ZipEntry ze;
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
                File file = new File(zipFile);
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_DOWNLOAD_PROGRESS:
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setMessage("Downloading Course ..");
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                mProgressDialog.setCancelable(false);
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
            Toast.makeText(getBaseContext(), "Checking files for download", Toast.LENGTH_SHORT).show();
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
            //setContentView(R.layout.activity_main);
            screen_flag = 1;
            course.setBackgroundResource(R.mipmap.delete);
            file_check();
            //file_checkto();
            Toast.makeText(getBaseContext(), "Download Completed", Toast.LENGTH_SHORT).show();

        }
    }

}
