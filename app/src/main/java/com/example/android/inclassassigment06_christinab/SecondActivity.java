package com.example.android.inclassassigment06_christinab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.inclassassigment06_christinab.R;


public class SecondActivity extends AppCompatActivity {

    // you'll need a variable to display text (that you'll assign)
    TextView userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        /*
        Intent intent = getIntent();
        String animal = intent.getStringExtra("ANIMAL_STRING");
        String legs = intent.getStringExtra("LEGS_STRING");
        String moreInfo = intent.getStringExtra("MORE_STRING");
        String fur = intent.getStringExtra("FUR_STRING");
*/
        //connect variable to XML
        userText = (TextView) findViewById(R.id.user_text);
       //userText.getSerializableExtra;

        // .getSerializableExtra
        // take the object and .toString to display

    }

}