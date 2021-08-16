package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    
    String ll[]=new String[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<100;i++)
        {
            ll[i]=String.valueOf(i*10000);
        }
        listView=findViewById(R.id.list);
        KrishnaKumar ad=new KrishnaKumar(this,R.layout.krishnakumar,ll);
//        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_2,ll);
        listView.setAdapter(ad);
    }
}