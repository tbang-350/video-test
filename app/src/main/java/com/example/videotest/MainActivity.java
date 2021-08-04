package com.example.videotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView) findViewById(R.id.video);

       video.setVideoPath("android.resource://" +getPackageName() +"/" + R.raw.testfootage2);

        MediaController mediacon = new MediaController(this);
        mediacon.setAnchorView(video);
        video.setMediaController(mediacon);

       video.start();

    }
}
