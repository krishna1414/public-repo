package com.example.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private ImageView image;
    MediaPlayer music;
    private Button Play,Pause,Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.mail);
        music = MediaPlayer.create(this, R.raw.despacito);
    }
    public void musicplay(View v)
    {
        music.start();
    }
    public void musicpause(View v)
    {
        music.pause();
    }
    public void musicstop(View v)
    {
        music.stop();
        music
                = MediaPlayer.create(
                this, R.raw.despacito);
    }
}