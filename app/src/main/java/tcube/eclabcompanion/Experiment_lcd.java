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

public class Experiment_lcd extends AppCompatActivity {
    int screen_flag;
    Toolbar s4lcd_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s4lcd);
        setTitle("Logic Circuit Design");
        s4lcd_toolbar= (Toolbar) findViewById(R.id.s4lcd_toolbar);
        setSupportActionBar(s4lcd_toolbar);
        getSupportActionBar().setTitle("Logic Circuit Design");
        s4lcd_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s4lcd);
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

    public void s4lcd_choose(View view) {
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
            case R.id.s4lcdexp0:
                file = new File(Obb, "s4lcd/s4lcdexp0.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp1:
                file = new File(Obb, "s4lcd/s4lcdexp01.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp2:
                file = new File(Obb, "s4lcd/s4lcdexp02.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp3:
                file = new File(Obb, "s4lcd/s4lcdexp03.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp4:
                file = new File(Obb, "s4lcd/s4lcdexp04.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp5:
                file = new File(Obb, "s4lcd/s4lcdexp05.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp6:
                file = new File(Obb, "s4lcd/s4lcdexp06.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp7:
                file = new File(Obb, "s4lcd/s4lcdexp07.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp8:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4lcd/s4lcdexp08.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp9:
                file = new File(Obb, "s4lcd/s4lcdexp09.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp10:
                file = new File(Obb, "s4lcd/s4lcdexp10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp11:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4lcd/s4lcdexp11.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp12:
                file = new File(Obb, "s4lcd/s4lcdexp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp13:
                file = new File(Obb, "s4lcd/s4lcdexp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp14:
                file = new File(Obb, "s4lcd/s4lcdexp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp15:
                file = new File(Obb, "s4lcd/s4lcdexp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp16:
                file = new File(Obb, "s4lcd/s4lcdexp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp17:
                file = new File(Obb, "s4lcd/s4lcdexp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp18:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4lcd/s4lcdexp18.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp19:
                file = new File(Obb, "s4lcd/s4lcdexp19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s4lcdexp20:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s4lcd/s4lcdexp20.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_bec.class);
        startActivity(intent);

    }
}