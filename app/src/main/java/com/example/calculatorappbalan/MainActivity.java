package com.example.calculatorappbalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

        TextView textView = findViewById(R.id.userName);
        textView.setText(nameToShow);

    }
    public void switchScreens(View view) {
        EditText editText = findViewById(R.id.enterfirstnumberid);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, SecondCalcScreen.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

}