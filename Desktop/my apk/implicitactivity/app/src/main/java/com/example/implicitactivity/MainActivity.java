package com.example.implicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText recipientText,urlText,subjectText,bodyText;
    private Button Email,Url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=findViewById(R.id.Email);
        Url=findViewById(R.id.Url);
        recipientText=findViewById(R.id.editText);
        urlText=findViewById(R.id.editText2);
        subjectText=findViewById(R.id.editText3);
        bodyText=findViewById(R.id.editText4);
        Url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String ss=urlText.getText().toString();
                Toast.makeText(MainActivity.this, "Loading...."+ss, Toast.LENGTH_SHORT).show();
                Uri webpage = Uri.parse(ss);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipientList=recipientText.getText().toString();
                String list[]=recipientList.split(",");
                String subject=subjectText.getText().toString();
                String body=bodyText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL,list);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT,body);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}