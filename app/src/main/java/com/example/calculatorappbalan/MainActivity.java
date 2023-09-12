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
        int recieved = intent.getIntExtra("FULLTEXT",0);
        Log.i("kash", "Recieved " + recieved);
        TextView infoTV = findViewById(R.id.enterfirstnumberid);
        infoTV.setText("" +recieved);

        Intent intent2 = getIntent();
        int recieved2 = intent2.getIntExtra("FULLTEXT",0);
        Log.i("kash", "Recieved " + recieved);
        TextView infoTV2 = findViewById(R.id.secondNumberId);
        infoTV2.setText("" +recieved);

    }

    public void calculate(View v){
        if(v.getId() == R.id.plusid){

        }

    }

    public void buttonSelected(View v) {
            String name = "";
            int fullText = 0;
            if (v.getId() == R.id.number1id) {
                name += 1;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;

            } else if (v.getId() == R.id.number2id) {
                name += 2;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number3id) {
                name += 3;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number4id) {
                name += 4;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number5id) {
                name += 5;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number6id) {
                name += 6;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number7id) {
                name += 7;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number8id) {
                name += 8;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            } else if (v.getId() == R.id.number9id) {
                name += 9;
                int num1 = Integer.parseInt(name.toString());
                fullText += num1;
            }
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("FULLTEXT", fullText);
            startActivity(intent);
    }
    }

