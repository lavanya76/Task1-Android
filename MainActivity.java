package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b;
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.sometext);
        b=findViewById(R.id.somebutton);


    }

    public void clicked(View v){
        num++;
        if(num%2==0) {
            tv.setText("This is static text!!!");
        }
        else{
            tv.setText("Text Changed!!!");
        }
       // tv.setText("This is static text!!!");

    }


}