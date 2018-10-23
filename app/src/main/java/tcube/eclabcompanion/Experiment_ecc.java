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

public class Experiment_ecc extends AppCompatActivity {
    int screen_flag;
    Toolbar s3ecc_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s3ecc);
        setTitle("Electronic Circuits Lab");
        s3ecc_toolbar= (Toolbar) findViewById(R.id.s3ecc_toolbar);
        setSupportActionBar(s3ecc_toolbar);
        getSupportActionBar().setTitle("Electronic Circuits Lab");
        s3ecc_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s3ecc);
            setTitle("Electronic Circuits Lab");
            s3ecc_toolbar= (Toolbar) findViewById(R.id.s3ecc_toolbar);
            setSupportActionBar(s3ecc_toolbar);
            getSupportActionBar().setTitle("Electronic Circuits Lab");
            s3ecc_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
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

    public void s3ecc_choose(View view) {
        File Obb = getFilesDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true); //Enable zoom
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            case R.id.s3eccexp1:
                file = new File(Obb, "s3ecc/EXPT01/EXPT01.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp2:
                file = new File(Obb, "s3ecc/EXPT02/EXPT02.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp3:
                file = new File(Obb, "s3ecc/EXPT03/EXPT03.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp4:
                file = new File(Obb, "s3ecc/EXPT04/EXPT04.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp5:
                file = new File(Obb, "s3ecc/EXPT05/EXPT05.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp6:
                file = new File(Obb, "s3ecc/EXPT06/EXPT06.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp7:
                file = new File(Obb, "s3ecc/EXPT07/EXPT07.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp8:
                file = new File(Obb, "s3ecc/EXPT08/EXPT08.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp9:
                file = new File(Obb, "s3ecc/EXPT09/EXPT09.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp10:
                file = new File(Obb, "s3ecc/EXPT10/EXPT10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp11:
                file = new File(Obb, "s3ecc/EXPT11/EXPT11.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp12:
                Toast.makeText(getBaseContext(), "Experiment not included yet !", Toast.LENGTH_SHORT).show();
                //file = new File(Obb, "s3ecc/EXPT12/EXPT12.html");
                //webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp13:
                file = new File(Obb, "s3ecc/EXPT13/EXPT13.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp14:
                file = new File(Obb, "s3ecc/EXPT14/EXPT14.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp15:
                file = new File(Obb, "s3ecc/EXPT15/EXPT15.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp16:
                file = new File(Obb, "s3ecc/EXPT16/EXPT16.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp17:
                file = new File(Obb, "s3ecc/EXPT17/EXPT17.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp18:
                file = new File(Obb, "s3ecc/EXPT18/EXPT18.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp19:
                file = new File(Obb, "s3ecc/EXPT19/EXPT19.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3eccexp20:
                file = new File(Obb, "s3ecc/EXPT20/EXPT20.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_ecc.class);
        startActivity(intent);

    }
}