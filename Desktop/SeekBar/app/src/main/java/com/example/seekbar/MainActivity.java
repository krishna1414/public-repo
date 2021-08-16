package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity
{
    private SeekBar seekbar;
    private MediaPlayer music;
    private Button play,pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar=findViewById(R.id.seekBar);
        play=findViewById(R.id.button);
        pause=findViewById(R.id.button2);
        music=MediaPlayer.create(this,R.raw.give_me_freedom_give_me_reason);
        music.start();
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.pause();
            }
        });
        seekbar.setMax(music.getDuration());
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                if(fromUser)
                    music.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}