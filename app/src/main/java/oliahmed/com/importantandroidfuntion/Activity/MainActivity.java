package oliahmed.com.importantandroidfuntion.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import oliahmed.com.importantandroidfuntion.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

 TextView uiexample,libraryfunction,streamingplayer,buttonsample,dialouge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActionBar();
        initUI();
    }





    /**
     * @initActionBar
     *Action Bar Initialization Method
     */
        private void initActionBar(){
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_top);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }



    /**
     * @initUI
     * User Interface Initialization Method
     */
    private void initUI(){
        uiexample=findViewById(R.id.uiexample);
        libraryfunction=findViewById(R.id.libraryfunction);
        streamingplayer=findViewById(R.id.streamingplayer);
        buttonsample=findViewById(R.id.buttonsample);
        dialouge=findViewById(R.id.dialouge);

        uiexample.setOnClickListener(this);
        libraryfunction.setOnClickListener(this);
        streamingplayer.setOnClickListener(this);
        buttonsample.setOnClickListener(this);
        dialouge.setOnClickListener(this);
    }


    /**
     * @param view
     * Click Action For Dashboard TextView
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.uiexample:
                break;
            case R.id.libraryfunction:
                break;
            case R.id.streamingplayer:
                break;
            case R.id.buttonsample:
                break;
            case R.id.dialouge:
                break;
            default:
                break;
        }
    }
}
