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

public class Experiment_pow extends AppCompatActivity {
    int screen_flag;
    Toolbar s5pow_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s5pow);
        setTitle("Power Electronics & Instrumentation");
        s5pow_toolbar= (Toolbar) findViewById(R.id.s5pow_toolbar);
        setSupportActionBar(s5pow_toolbar);
        getSupportActionBar().setTitle("Power Electronics & Instrumentation");
        s5pow_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s5pow);
            setTitle("Power Electronics & Instrumentation");
            s5pow_toolbar= (Toolbar) findViewById(R.id.s5pow_toolbar);
            setSupportActionBar(s5pow_toolbar);
            getSupportActionBar().setTitle("Power Electronics & Instrumentation");
            s5pow_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s5pow_choose(View view) {
        File Obb = getFilesDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true); //Enable zoom
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            /*case R.id.s5powexp1:
                file = new File(Obb, "s5pow/A/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;
            case R.id.s5powexp2:
                file = new File(Obb, "s5pow/A/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;*/
            case R.id.s5powexp3:
                file = new File(Obb, "s5pow/A/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s5powexp4:
                file = new File(Obb, "s5pow/A/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;
            case R.id.s5powexp5:
                file = new File(Obb, "s5pow/A/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;
            case R.id.s5powexp6:
                file = new File(Obb, "s5pow/A/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;*/
            case R.id.s5powexp7:
                file = new File(Obb, "s5pow/B/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s5powexp8:
                file = new File(Obb, "s5pow/B/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;
            case R.id.s5powexp9:
                file = new File(Obb, "s5pow/B/exp3/exp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;
            case R.id.s5powexp10:
                file = new File(Obb, "s5pow/B/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;*/
            case R.id.s5powexp11a:
                file = new File(Obb, "s5pow/B/exp5a/exp5a.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s5powexp11b:
                file = new File(Obb, "s5pow/B/exp5b/exp5b.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s5powexp12:
                file = new File(Obb, "s5pow/B/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s5pow_choose"
                break;*/
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_pow.class);
        startActivity(intent);
    }
}