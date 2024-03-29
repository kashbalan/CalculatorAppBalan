package com.example.calculatorappbalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v) throws ScriptException {
        ////https://www.youtube.com/watch?v=kqmSUwRZ6kg
        // the following lines of code takes the String in the equation then calls
        // the ScriptEngine class and instantiates a new ScriptEngingManager in order to eval
        //the String and converts it a mathematical equation to be solved and then converts the answer
        // into a double to be put into the Double toutal which is then converted back into a String
        // to be put into the AnswerId to display the answer

        Double total = null;
        TextView infoTV = (TextView)findViewById(R.id.equationid);
        String info = infoTV.getText().toString();
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        total = (double)engine.eval(info);
        result = String.valueOf(total.doubleValue());
        TextView infoTVAns = (TextView)findViewById(R.id.Answerid);
        infoTVAns.setText(result);
    }
    public void buttonSelected(View v) {
            String num1 = "1";
            String num2 = "2";
            String num3= "3";
            String num4 = "4";
            String num5 = "5";
            String num6 = "6";
            String num7 = "7";
            String num8 = "8";
            String num9 = "9";
        String num0 = "0";
            String fullText = "";

            if (v.getId() == R.id.number1id) {
                TextView infoTV = (TextView)findViewById(R.id.equationid);
                String temp = infoTV.getText().toString();
                fullText = temp + num1;
                infoTV.setText(fullText);
            } if (v.getId() == R.id.number2id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num2;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number3id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num3;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number4id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num4;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number5id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num5;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number6id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num6;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number7id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num7;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number8id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num8;
            infoTV.setText(fullText);
            } if (v.getId() == R.id.number9id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num9;
            infoTV.setText(fullText);
            }
        if (v.getId() == R.id.number0id) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + num0;
            infoTV.setText(fullText);
        }
        if (v.getId() == R.id.plusid) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + "+";
            infoTV.setText(fullText);
        }
        else if (v.getId() == R.id.minusid) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + "-";
            infoTV.setText(fullText);
        }
        else if (v.getId() == R.id.multid) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + "*";
            infoTV.setText(fullText);
        }
        else if (v.getId() == R.id.divideid) {
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            String temp = infoTV.getText().toString();
            fullText = temp + "/";
            infoTV.setText(fullText);
        }

        if(v.getId() == R.id.acid){
            TextView infoTV = (TextView)findViewById(R.id.equationid);
            infoTV.setText("");
        }


        }

    }


