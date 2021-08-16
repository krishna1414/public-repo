package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String quetionpaper[] = {"Java technology is both a programming language and a platform", "James Gosling is father of Java?", "A .class file contains bytecodes?", "The modifiers public and static cannot written in either order \"public static\" or \"static public\".", "Interfaces can be instantiated", "Variable name can begin with a letter,\"$\" or \"_\" ","In Java SE 7 and later, underscore characters \"_\" can appear anywhere between digits in a numerical literal","int x[] = new int[]{10,20,30};<br><br>Arrays can also be created and initialize as in above statement.", "In an instance method or a constructor, \"this\" is a reference to the current object.", "Garbage Collection is manual process", "The JRE deletes objects when it determines that they are no longer being used. This process is called Garbage Collection.", "Constructor overloading is not possible in Java.", "Assignment operator is evaluated Left to Right", "All binary operators except for the assignment operators are evaluated from Left to Right", "Java programming is not statically-typed, means all variables should not first be declared before they can be used.", ""};
    boolean answerpaper[] = {true, true, true, false, false, true, true, true, true, false, true, false, false, true, false};
    private TextView question;
    private Button True,False;
    private int index=0;
    private int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.textView2);
        True=findViewById(R.id.button);
        False=findViewById(R.id.button2);
        question.setText("  1)"+quetionpaper[index]);
        True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<answerpaper.length)
                {
                    if(!answerpaper[index]) ans++;
                    index=index+1;
                    if(index<quetionpaper.length-1) question.setText((index+1)+"  )"+quetionpaper[index]);
                    else question.setText("your score is "+ans+"/"+answerpaper.length);
                }
                else Toast.makeText(MainActivity.this, "RESTART YOUR APP TO PLAY AGAIN", Toast.LENGTH_SHORT).show();
            }
        });
        False.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<answerpaper.length)
                {
                    if(!answerpaper[index]) ans++;
                    index=index+1;
                    if(index<quetionpaper.length-1) question.setText((index+1)+"  )"+quetionpaper[index]);
                    else question.setText("your score is "+ans+"/"+answerpaper.length);
                }
                else Toast.makeText(MainActivity.this, "RESTART YOUR APP TO PLAY AGAIN", Toast.LENGTH_SHORT).show();
            }
        });
    }
}