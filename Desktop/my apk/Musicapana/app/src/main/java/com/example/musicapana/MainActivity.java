package com.example.musicapana;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity
{
    private ImageButton play;
    MediaPlayer mediaPlayer;
    private SeekBar seek;
    boolean isOn=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.imageButton);
        mediaPlayer=MediaPlayer.create(this,R.raw.despacito);
        mediaPlayer.start();
        Toast.makeText(MainActivity.this, "start", Toast.LENGTH_SHORT).show();
    }
}