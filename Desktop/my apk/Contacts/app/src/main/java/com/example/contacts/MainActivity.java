package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    String name[]={"Ravi Kumar K","Krishna Kumar K","Kaluram","Satyanarayan","Leela Devi"};
    String phoneNo[]={"6364224813","7568814039","9945633813","6360111328","7019157305"};
    Integer image[]={R.drawable.black_panther,R.drawable.black_panther,R.drawable.black_panther,R.drawable.black_panther,R.drawable.black_widow};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        CustomAdapter ad=new CustomAdapter(this,name,phoneNo,image);
        listView.setAdapter((ListAdapter) ad);

    }
}