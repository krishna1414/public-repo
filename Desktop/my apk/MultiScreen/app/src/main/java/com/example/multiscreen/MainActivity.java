package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private EditText editText;
    public static String EXTRA_NAME="com.example.multiscreen.extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading....", Toast.LENGTH_SHORT).show();
                String str=editText.getText().toString();
                openActivity(str);
            }
        });
    }
    public void openActivity(String str)
    {
        Intent inten=new Intent(this,MainActivity2.class);
        inten.putExtra(EXTRA_NAME,str);
        startActivity(inten);
    }

}