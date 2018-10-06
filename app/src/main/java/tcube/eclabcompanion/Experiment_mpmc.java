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

public class Experiment_mpmc extends AppCompatActivity {
    int screen_flag;
    Toolbar s6mpmc_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s6mpmc);
        setTitle("Microcontroller Lab");
        s6mpmc_toolbar= (Toolbar) findViewById(R.id.s6mpmc_toolbar);
        setSupportActionBar(s6mpmc_toolbar);
        getSupportActionBar().setTitle("Microcontroller Lab");
        s6mpmc_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s6mpmc);
            setTitle("List of Experiments");
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

    public void s6mpmc_choose(View view) {
        File Obb = getObbDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setSupportZoom(true); //Enable Zoom.
        webview.getSettings().setBuiltInZoomControls(true); //Enable Zoom Controls.
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s6mpmcexp1:
                file = new File(Obb, "s6mpmc/s6mpmcexp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp2:
                file = new File(Obb, "s6mpmc/s6mpmcexp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp3:
                file = new File(Obb, "s6mpmc/s6mpmcexp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp4:
                file = new File(Obb, "s6mpmc/s6mpmcexp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp5:
                file = new File(Obb, "s6mpmc/s6mpmcexp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp6:
                file = new File(Obb, "s6mpmc/s6mpmcexp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp7:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6mpmc/s6mpmcexp7.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp8:
                file = new File(Obb, "s6mpmc/s6mpmcexp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp9:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6mpmc/s6mpmcexp9.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp10:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6mpmc/s6mpmcexp10.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp11:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s6mpmc/s6mpmcexp11.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp12:
                file = new File(Obb, "s6mpmc/s6mpmcexp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp13:
                file = new File(Obb, "s6mpmc/s6mpmcexp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp14:
                file = new File(Obb, "s6mpmc/s6mpmcexp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp15:
                file = new File(Obb, "s6mpmc/s6mpmcexp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp16:
                file = new File(Obb, "s6mpmc/s6mpmcexp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp17:
                file = new File(Obb, "s6mpmc/s6mpmcexp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp18:
                file = new File(Obb, "s6mpmc/s6mpmcexp18.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp19:
                file = new File(Obb, "s6mpmc/s6mpmcexp19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp20:
                file = new File(Obb, "s6mpmc/s6mpmcexp20.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp21:
                file = new File(Obb, "s6mpmc/s6mpmcexp21.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp22:
                file = new File(Obb, "s6mpmc/s6mpmcexp22.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s6mpmcexp23:
                file = new File(Obb, "s6mpmc/s6mpmcexp23.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_mpmc.class);
        startActivity(intent);

    }
}