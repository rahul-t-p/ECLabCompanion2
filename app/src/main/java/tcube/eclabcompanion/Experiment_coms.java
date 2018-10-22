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

public class Experiment_coms extends AppCompatActivity {
    int screen_flag;
    Toolbar s7coms_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s7coms);
        setTitle("Communication Systems Lab");
        s7coms_toolbar= (Toolbar) findViewById(R.id.s7coms_toolbar);
        setSupportActionBar(s7coms_toolbar);
        getSupportActionBar().setTitle("Communication Systems Lab");
        s7coms_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {
        if (screen_flag == 1) {
            setContentView(R.layout.s7coms);
            setTitle("Communication Systems Lab");
            s7coms_toolbar= (Toolbar) findViewById(R.id.s7coms_toolbar);
            setSupportActionBar(s7coms_toolbar);
            getSupportActionBar().setTitle("Communication Systems Lab");
            s7coms_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s7coms_choose(View view) {
        File Obb = getObbDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true); //Enable zoom
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s7comsexp1:
                file = new File(Obb, "s7coms/s7comsexp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp2:
                file = new File(Obb, "s7coms/s7comsexp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp3:
                file = new File(Obb, "s7coms/s7comsexp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp4:
                file = new File(Obb, "s7coms/s7comsexp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp5:
                file = new File(Obb, "s7coms/s7comsexp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp6:
                file = new File(Obb, "s7coms/s7comsexp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp7:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s7coms/s7comsexp7.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp8:
                file = new File(Obb, "s7coms/s7comsexp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp9:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s7coms/s7comsexp9.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp10:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s7coms/s7comsexp10.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp11:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s7coms/s7comsexp11.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp12:
                file = new File(Obb, "s7coms/s7comsexp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp13:
                file = new File(Obb, "s7coms/s7comsexp13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp14:
                file = new File(Obb, "s7coms/s7comsexp14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp15:
                file = new File(Obb, "s7coms/s7comsexp15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp16:
                file = new File(Obb, "s7coms/s7comsexp16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp17:
                file = new File(Obb, "s7coms/s7comsexp17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp18:
                file = new File(Obb, "s7coms/s7comsexp18.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp19:
                file = new File(Obb, "s7coms/s7comsexp19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp20:
                file = new File(Obb, "s7coms/s7comsexp20.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s7comsexp21:
                file = new File(Obb, "s7coms/s7comsexp21.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_coms.class);
        startActivity(intent);

    }
}