package com.example.videoplayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartActivity extends AppCompatActivity {



    @BindView(R.id.buttonPlayDefaultVideo)
    Button buttonPlayDefaultVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }

    @OnClick({ R.id.buttonPlayDefaultVideo})
    public void onViewClicked(View view) {


                Intent mIntent = MainActivity.getStartIntent(this, VideoPlayerConfig.DEFAULT_VIDEO_URL);
                startActivity(mIntent);

    }


}
