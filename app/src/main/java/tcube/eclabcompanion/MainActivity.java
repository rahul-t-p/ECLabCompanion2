package tcube.eclabcompanion;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import java.io.File;
import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {
    Bundle bundle;
    int screenflag;
    CircleButton course_icon,add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bundle=new Bundle();
        file_checkto();
    }

    @Override
    protected void onStart() {
        super.onStart();
        file_checkto();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        file_checkto();
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        file_checkto();
    }

    @Override
    protected void onResume() {
        file_checkto();
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {      // It is the Exit button Question
        if (screenflag == 1) {
            setContentView(R.layout.activity_main);
            bundle=new Bundle();
            file_checkto();
            screenflag = 0;
        } else {

            new AlertDialog.Builder(this)
                    .setMessage("Do you really want to exit ?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }

    public void course_popup(View view) {
        Intent Course_intent=new Intent(MainActivity.this,Course_list.class);
        Course_intent.putExtras(bundle);
        startActivity(Course_intent);


    }

    public void s1bec_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s1bec");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_bec.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s3ecc_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s3ecc");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_ecc.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s3eda_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s3eda");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_eda.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s4aic_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s4aic");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_aic.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s4lcd_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s4lcd");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_lcd.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s5dsp_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s5dsp");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_dsp.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s5pow_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s5pow");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_pow.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s6mpmc_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s6mpmc");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_mpmc.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s6come_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s6come");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_come.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void s7coms_go(View view){
        File Obb = getFilesDir();
        File file = new File(Obb, "s7coms");
        if( file.exists()) {
            Intent intent = new Intent(this, Experiment_coms.class);
            startActivity(intent); //Starts next activity for the particular course.
        }
        else {

            Toast.makeText(getBaseContext(), "Please add this course first", Toast.LENGTH_SHORT).show();
        }
    }

    public void doanddont(View view) {
        WebView webview;
        screenflag = 1;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl("file:///android_asset/genprec.html");
    }

    public void file_checkto() { //This function dynamically sets the course images based on the presence of corresponding folder.
        course_icon =  findViewById(R.id.s1bec);
        add_button= findViewById(R.id.button);

        File Obb = getFilesDir();

        File fileCheck = new File (Obb,"s1bec"); // Checking for downloaded files
        if (fileCheck.isDirectory()) { //If Course is present ..
            //Make the button visible and adjust its layout params.
            course_icon.setColor(Color.parseColor("#EC407A"));
        }
        else { //If course is not present ..
            course_icon.setColor(getResources().getColor(R.color.colorBG));
            // Make the button invisible.
        }
        course_icon = findViewById(R.id.s3eda); //Same process is repeated for all courses.

        fileCheck = new File (Obb,"s3eda");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#7E57C2"));
        }
        else {

            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
        course_icon =findViewById(R.id.s3ecc);

        fileCheck = new File (Obb,"s3ecc");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#AB47BC"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = findViewById(R.id.s4aic);

        fileCheck = new File (Obb,"s4aic");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#5C6BC0"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon =findViewById(R.id.s4lcd);

        fileCheck = new File (Obb,"s4lcd");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#42A5F5"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = findViewById(R.id.s5dsp);

        fileCheck = new File (Obb,"s5dsp");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#29B6F6"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = findViewById(R.id.s5pow);

        fileCheck = new File (Obb,"s5pow");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#26C6DA"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon =findViewById(R.id.s6mic);

        fileCheck = new File (Obb,"s6mpmc");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#26A69A"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = findViewById(R.id.s6come);

        fileCheck = new File (Obb,"s6come");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#66BB6A"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = findViewById(R.id.s7coms);

        fileCheck = new File (Obb,"s7coms");
        if (fileCheck.isDirectory()) {
            course_icon.setColor(Color.parseColor("#9CCC65"));
        }
        else {
            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
    }

}
