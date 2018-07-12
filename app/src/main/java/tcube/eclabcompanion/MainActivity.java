package tcube.eclabcompanion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.io.File;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {
    Bundle bundle;
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
        // on starting what to do
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



    public void course_popup(View view) {
        Intent Course_intent=new Intent(MainActivity.this,Course_list.class);
        Course_intent.putExtras(bundle);
        startActivity(Course_intent);


    }




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
    public void file_checkto() { //This function dynamically sets the course images based on the presence of corresponding folder.
        course_icon = (CircleButton) findViewById(R.id.s1bec);
        add_button= (CircleButton) findViewById(R.id.button);

        File Obb = getObbDir();
        File fileCheck = new File (Obb,"s1bec"); // Checking for downloaded files
        if (fileCheck.isDirectory()) { //If Course is present ..
            //Make the button visible and adjust its layout params.
            course_icon.setColor(Color.parseColor("#AD1457"));
        }
        else { //If course is not present ..
            course_icon.setColor(getResources().getColor(R.color.colorBG));
            // Make the button invisible.
        }
        course_icon = (CircleButton) findViewById(R.id.s3eda); //Same process is repeated for all courses.
        fileCheck = new File (Obb,"s3eda");
        if (fileCheck.isDirectory()) {

        }
        else {

            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
        course_icon = (CircleButton) findViewById(R.id.s3ecc);
        fileCheck = new File (Obb,"s3ecc");
        if (fileCheck.isDirectory()) {

        }
        else {

            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s4aic);
        fileCheck = new File (Obb,"s4aic");
        if (fileCheck.isDirectory()) {

        }
        else {


             course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
        course_icon = (CircleButton) findViewById(R.id.s4lcd);
        fileCheck = new File (Obb,"s4lcd");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s5dsp);
        fileCheck = new File (Obb,"s5dsp");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s5pow);
        fileCheck = new File (Obb,"s5pow");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s6mic);
        fileCheck = new File (Obb,"s6mic");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s6come);
        fileCheck = new File (Obb,"s6come");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));
        }
        course_icon = (CircleButton) findViewById(R.id.s7coms);
        fileCheck = new File (Obb,"s7coms");
        if (fileCheck.isDirectory()) {

        }
        else {


            course_icon.setColor(getResources().getColor(R.color.colorBG));

        }
    }






}
