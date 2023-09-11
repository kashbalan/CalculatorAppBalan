package com.example.calculatorappbalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("NAME");

        TextView textView = findViewById(R.id.Answerid);
        textView.setText(nameToShow);

    }
    public void switchScreens(View view) {
        EditText firstNum = findViewById(R.id.enterfirstnumberid);
        String name = firstNum.getText().toString();



        EditText secondNum = findViewById(R.id.entersecondnumid);
        String age = secondNum.getText().toString();



        //log statments allow us to print to the console for debugging
        Log.i("kash", name + " " + age);
        String fullText = name + "\n " + age + "\n" + hobby;
        //create intent and tell where to go
        //fill the intent (optional)
        //call startActivity to launch the intent
        Intent intent = new Intent(this, ShowInfoActivity.class);
        intent.putExtra("FULLTEXT", fullText);
        startActivity(intent);
    }

    public void numSelected(View v){
        if(v.getId() == R.id.number1id || v.getId() == R.id.number2id || v.getId() == R.id.number3id || v.getId() == R.id.number4id || v.getId() == R.id.number5id || v.getId() == R.id.number6id || v.getId() == R.id.number7id || v.getId() == R.id.number8id || v.getId() == R.id.number9id){
            switchScreens(v);
        }

    }

}