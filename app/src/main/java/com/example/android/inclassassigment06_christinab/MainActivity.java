package com.example.android.inclassassigment06_christinab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // First you'll need 4 variables for inputs (3 EditText and 1 CheckBox)

    EditText name;
    EditText legs;
    EditText moreInfo;
    CheckBox hasFur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Then you'll need to connect those to the XML (findViewById)

        EditText name = (EditText) findViewById(R.id.animal_name_view);
        EditText legs = (EditText) findViewById(R.id.legs_view);
        EditText moreInfo = (EditText) findViewById(R.id.more_info_view);
        CheckBox hasFur = (CheckBox) findViewById(R.id.has_fur_view);


    }

    public void launchActivity(View view) {


        // then a Method to .getText() and convert .toString() for each EditText
        // and a boolean for the CheckBox

        String nameText = name.getEditableText().toString();
        String legsText = legs.getEditableText().toString();
        String moreInfoText = moreInfo.getEditableText().toString();
        boolean fur = hasFur.isChecked();


        // then create an Object with constructor that accepts everything
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ANIMAL_STRING", nameText);
        intent.putExtra("LEGS_STRING", legsText);
        intent.putExtra("MORE_STRING", moreInfoText);
        intent.putExtra("FUR_STRING", fur);



        // and pass that to the com.example.android.inclassassigment06_christinab.SecondActivity
        startActivity(intent);

    }
}