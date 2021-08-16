package com.example.avengersguid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity
{
    private ListView list;
    String name[]={"IRON MAN","CAPTAIN AMERICA","BLACK PANTHER","BLACK WIDOW","BUCKY","DOCTOR STRANGE","DRAX","FALCON","GAMORA","HULK","NEBULA","RHODES","ROCKET AND GROOT","SPIDERMAN","STAR LORD","THOR","VISION","WANDA MAXIMOFF","WONG"};
    String discription[]={
            "TONY STARK",
            "STEVE ROGERS",
            "BLACK PANTHER","BLACK WIDOW","BUCKY","DOCTOR STRANGE","DRAX","FALCON","GAMORA","HULK","NEBULA","RHODES","ROCKET AND GROOT","SPIDERMAN","STAR LORD","THOR","VISION","WANDA MAXIMOFF","WONG"};
    Integer photoId[]={R.drawable.ironman,R.drawable.captain_america,R.drawable.black_panther,R.drawable.black_widow,R.drawable.bucky,R.drawable.doctor_strange,R.drawable.drax,R.drawable.falcon,R.drawable.gamora,R.drawable.hulk,R.drawable.nebula,R.drawable.rhodes,R.drawable.rocket_and_groot,R.drawable.spiderman,R.drawable.star_lord,R.drawable.thor,R.drawable.vision,R.drawable.wanda_maximoff,R.drawable.wong};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list_view);
        avengers_adapter ad=new avengers_adapter(this,name,photoId,discription);
        list.setAdapter(ad);
    }
}