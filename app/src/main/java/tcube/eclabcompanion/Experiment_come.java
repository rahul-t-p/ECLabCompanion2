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

public class Experiment_come extends AppCompatActivity {
    int screen_flag;
    Toolbar s6come_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s6come);
        setTitle("Communication Engineering Lab");
        s6come_toolbar= (Toolbar) findViewById(R.id.s6come_toolbar);
        setSupportActionBar(s6come_toolbar);
        getSupportActionBar().setTitle("Communication Engineering Lab");
        s6come_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s6come);
            setTitle("Communication Engineering Lab");
            s6come_toolbar= (Toolbar) findViewById(R.id.s6come_toolbar);
            setSupportActionBar(s6come_toolbar);
            getSupportActionBar().setTitle("Communication Engineering Lab");
            s6come_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s6come_choose(View view) {
        File Obb = getObbDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true); //Enable zoom
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s6comeexp1:
                file = new File(Obb, "s6come/s6comeexp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp2:
                file = new File(Obb, "s6come/s6comeexp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp3:
                file = new File(Obb, "s6come/s6comeexp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp4:
                file = new File(Obb, "s6come/s6comeexp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp5:
                file = new File(Obb, "s6come/s6comeexp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp6:
                file = new File(Obb, "s6come/s6comeexp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp7:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6come/s6comeexp7.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp8:
                file = new File(Obb, "s6come/s6comeexp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp9:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6come/s6comeexp9.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp10:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6come/s6comeexp10.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp11:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6come/s6comeexp11.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp12:
                file = new File(Obb, "s6come/s6comeexp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp13:
                file = new File(Obb, "s6come/s6comeexp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp14:
                file = new File(Obb, "s6come/s6comeexp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp15:
                file = new File(Obb, "s6come/s6comeexp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp16:
                file = new File(Obb, "s6come/s6comeexp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp17:
                file = new File(Obb, "s6come/s6comeexp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp18:
                file = new File(Obb, "s6come/s6comeexp18.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp19:
                file = new File(Obb, "s6come/s6comeexp19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp20:
                file = new File(Obb, "s6come/s6comeexp20.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp21:
                file = new File(Obb, "s6come/s6comeexp21.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6comeexp22:
                file = new File(Obb, "s6come/s6comeexp22.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_come.class);
        startActivity(intent);

    }
}