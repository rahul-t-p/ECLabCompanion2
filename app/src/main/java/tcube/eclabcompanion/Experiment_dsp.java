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

public class Experiment_dsp extends AppCompatActivity {
    int screen_flag;
    Toolbar s5dsp_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s5dsp);
        setTitle("Digital Signal Processing");
        s5dsp_toolbar= (Toolbar) findViewById(R.id.s5dsp_toolbar);
        setSupportActionBar(s5dsp_toolbar);
        getSupportActionBar().setTitle("Digital Signal Processing");
        s5dsp_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s5dsp);
            setTitle("Digital Signal Processing");
            s5dsp_toolbar= (Toolbar) findViewById(R.id.s5dsp_toolbar);
            setSupportActionBar(s5dsp_toolbar);
            getSupportActionBar().setTitle("Digital Signal Processing");
            s5dsp_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s5dsp_choose(View view) {
        File Obb = getFilesDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true);
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s5dspexp1:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/A/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp2:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/A/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp3:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/A/exp3/exp3.html.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp4:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/A/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp5:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/A/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp6:
                file = new File(Obb, "s5dsp/B/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp7:
                file = new File(Obb, "s5dsp/B/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp8:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/B/exp3/exp3.html.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp9:
                file = new File(Obb, "s5dsp/B/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp10:
                file = new File(Obb, "s5dsp/B/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp11:
                file = new File(Obb, "s5dsp/B/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp12:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/B/exp7/exp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp13:
                file = new File(Obb, "s5dsp/B/exp8/exp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp14:
                file = new File(Obb, "s5dsp/B/exp9/exp9.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp15:
                file = new File(Obb, "s5dsp/B/exp10/exp10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp16:
                file = new File(Obb, "s5dsp/B/exp11/exp11.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp17:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/B/exp12/exp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp18:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/B/exp13/exp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp19:
                file = new File(Obb, "s5dsp/B/exp14/exp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp20:
                file = new File(Obb, "s5dsp/B/exp15/exp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp21:
                file = new File(Obb, "s5dsp/B/exp16/exp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5dspexp22:
                //Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                file = new File(Obb, "s5dsp/B/exp17/exp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_dsp.class);
        startActivity(intent);

    }
}