package com.example.chp1practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
    }
   public void calculate(View v)
   {
       int N=Integer.parseInt(editText.getText().toString());
       textView.setText(N+" X 1 = "+N*1+"\n"+N+" X 2 = "+N*2+"\n"+N+" X 3 = "+N*3+"\n"+N+" X 4 = "+N*4+"\n"+N+" X 5 = "+N*5+"\n"+N+" X 6 = "+N*6+"\n"+N+" X 7 = "+N*7+"\n"+N+" X 8 = "+N*8+"\n"+N+" X 9 = "+N*9+"\n"+N+" X 10 = "+N*10);
    }
}