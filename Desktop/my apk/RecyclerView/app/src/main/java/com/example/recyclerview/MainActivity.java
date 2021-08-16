package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    String name[]={"Ravi Kumar K","Krishna Kumar K","Kaluram","Leela Devi","Satyannarayan"};
    String phoneNo[]={"6364224813","7568814039","9945633813","7019157305","6360111328"};
    Integer photoId[]={R.drawable.avengers_falcon,R.drawable.avengers_falcon,R.drawable.avengers_falcon,R.drawable.avengers_blackwidow,R.drawable.avengers_falcon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this);
        CustomAdapter ad=new CustomAdapter(name,phoneNo,photoId);
        recyclerView.setAdapter(ad);
    }
}