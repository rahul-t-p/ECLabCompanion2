package tcube.eclabcompanion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

import java.io.File;

public class Experiment_bec extends AppCompatActivity {
    int screen_flag;
    Toolbar s1bec_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1bec);
        setTitle("Basic Electronics Workshop");
        s1bec_toolbar= (Toolbar) findViewById(R.id.s1bec_toolbar);
        setSupportActionBar(s1bec_toolbar);
        getSupportActionBar().setTitle("Basic Electronics Workshop");
        s1bec_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s1bec);
            setTitle("Basic Electronics Workshop");
            s1bec_toolbar= (Toolbar) findViewById(R.id.s1bec_toolbar);
            setSupportActionBar(s1bec_toolbar);
            getSupportActionBar().setTitle("Basic Electronics Workshop");
            s1bec_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s1bec_choose(View view) {
        File Obb = getFilesDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true);
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s1becexp1:
                file = new File(Obb, "s1bec/s1becexp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp2:
                file = new File(Obb, "s1bec/s1becexp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp3:
                file = new File(Obb, "s1bec/s1becexp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp4:
                file = new File(Obb, "s1bec/s1becexp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp5:
                file = new File(Obb, "s1bec/s1becexp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp6:
                file = new File(Obb, "s1bec/s1becexp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp7:
                file = new File(Obb, "s1bec/s1becexp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp8:
                file = new File(Obb, "s1bec/s1becexp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp9:
                file = new File(Obb, "s1bec/s1becexp9.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp10:
                file = new File(Obb, "s1bec/s1becexp10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp11:
                file = new File(Obb, "s1bec/s1becexp11.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp12:
                file = new File(Obb, "s1bec/s1becexp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp13:
                file = new File(Obb, "s1bec/s1becexp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp14:
                file = new File(Obb, "s1bec/s1becexp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp15:
                file = new File(Obb, "s1bec/s1becexp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp16:
                file = new File(Obb, "s1bec/s1becexp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp17:
                file = new File(Obb, "s1bec/s1becexp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp18:
                file = new File(Obb, "s1bec/s1becexp18.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s1becexp19:
                file = new File(Obb, "s1bec/s1becexp19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_bec.class);
        startActivity(intent);

    }
}

