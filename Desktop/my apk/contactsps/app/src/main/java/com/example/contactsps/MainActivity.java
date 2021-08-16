package com.example.contactsps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    Contacts o1=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts o2=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts o3=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts o4=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts o5=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts o6=new Contacts(R.drawable.black_male,"Krishna Kumar K","7568814039");
    Contacts cotact[]={o1,o2,o3,o4,o5,o6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(cotact);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }
}