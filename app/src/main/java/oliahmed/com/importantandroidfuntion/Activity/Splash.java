package oliahmed.com.importantandroidfuntion.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.github.javiersantos.bottomdialogs.BottomDialog;

import java.util.Timer;
import java.util.TimerTask;

import oliahmed.com.importantandroidfuntion.R;
import oliahmed.com.importantandroidfuntion.Util.NetworkCheck;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

    }


    @Override
    protected void onResume() {
        super.onResume();
        startProcess();

    }

    private void startProcess() {
        if (!NetworkCheck.isConnect(this)) {
            dialogNoInternet();
        } else {
            startActivityMainDelaymain();
        }
    }

    private void startActivityMainDelaymain() {
        // Show splash screen for 2 seconds
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };
        new Timer().schedule(task, 3000);
    }

    public void dialogNoInternet() {

        new BottomDialog.Builder(Splash.this)
                .setTitle("NO INTERNET !")
                .setContent("Please Reconnect With Working Internet")
                .setPositiveText("OK")
                .setPositiveBackgroundColorResource(R.color.colorPrimary)
                //.setPositiveBackgroundColor(ContextCompat.getColor(Splash.this, R.color.colorPrimary)
                .setPositiveTextColorResource(android.R.color.white)
                //.setPositiveTextColor(ContextCompat.getColor(Splash.this, R.color.colorAccent)
                .onPositive(new BottomDialog.ButtonCallback() {
                    @Override
                    public void onClick(BottomDialog dialog) {
                        finish();
                    }
                }).show();
    }

}
