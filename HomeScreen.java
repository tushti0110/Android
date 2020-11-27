package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeScreen extends AppCompatActivity implements View.OnClickListener{

    Button play,pause;
    MediaPlayer mediaPlayer;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        play = (Button)findViewById(R.id.btn_play);
        pause = (Button)findViewById(R.id.btn_pause);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
    }
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn_play:
                if(mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.musicsample);
                mediaPlayer.start();}
                else if(!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(position);
                    mediaPlayer.start();
                }
                break;
            case R.id.btn_pause:
                if(mediaPlayer!=null)
                {
                    mediaPlayer.pause();
                    position = mediaPlayer.getCurrentPosition();
                }
                break;
        }
    }
}
