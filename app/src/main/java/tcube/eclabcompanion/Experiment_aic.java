package tcube.eclabcompanion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.File;

public class Experiment_aic extends AppCompatActivity {
    int screen_flag;
    Toolbar s4aic_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s4aic);
        setTitle("Analog Integrated Circuits");
        s4aic_toolbar= findViewById(R.id.s4aic_toolbar);
        setSupportActionBar(s4aic_toolbar);
        getSupportActionBar().setTitle("Analog Integrated Circuits");
        s4aic_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s4aic);
            setTitle("Analog Integrated Circuits");
            s4aic_toolbar= findViewById(R.id.s4aic_toolbar);
            setSupportActionBar(s4aic_toolbar);
            getSupportActionBar().setTitle("Analog Integrated Circuits");
            s4aic_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
            screen_flag = 0;
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
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
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void s4aic_choose(View view) {
        File Obb = getObbDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true);
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s4aicexp0:
                file = new File(Obb, "s4aic/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp1:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4aic/s4aicexp01.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp2:
                file = new File(Obb, "s4aic/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp3:
                file = new File(Obb, "s4aic/exp3/exp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp4:
                file = new File(Obb, "s4aic/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp5:
                file = new File(Obb, "s4aic/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp6:
                file = new File(Obb, "s4aic/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp7:
                file = new File(Obb, "s4aic/exp7/exp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp8:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s4aic/exp8/exp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp9:
                file = new File(Obb, "s4aic/exp9/exp9.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp10:
                file = new File(Obb, "s4aic/exp10/exp10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp11:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s4aic/exp11/exp11.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp12:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4aic/s4aicexp12.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp13:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4aic/s4aicexp13.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp14:
                file = new File(Obb, "s4aic/exp12/exp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4aicexp15:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4aic/s4aicexp15.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_bec.class);
        startActivity(intent);

    }
}