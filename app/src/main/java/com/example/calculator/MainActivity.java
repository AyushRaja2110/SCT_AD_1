package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputLayout no1,no2;
    Button add,sub,mul,div,mod;

    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.number1);
        no2 = findViewById(R.id.number2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);

        ans = findViewById(R.id.answer);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (no1.getEditText().getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Number one is empty!", Toast.LENGTH_SHORT).show();
                }
                else if(no2.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Number Two is empty!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int n1  =Integer.parseInt(no1.getEditText().getText().toString().trim());
                    int n2  =Integer.parseInt(no2.getEditText().getText().toString().trim());
                    int res = n1+n2;
                    ans.setText(""+res);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (no1.getEditText().getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Number one is empty!", Toast.LENGTH_SHORT).show();
                }
                else if(no2.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Number Two is empty!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int n1  =Integer.parseInt(no1.getEditText().getText().toString().trim());
                    int n2  =Integer.parseInt(no2.getEditText().getText().toString().trim());
                    int res = n1-n2;
                    ans.setText(""+res);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (no1.getEditText().getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Number one is empty!", Toast.LENGTH_SHORT).show();
                }
                else if(no2.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Number Two is empty!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int n1  =Integer.parseInt(no1.getEditText().getText().toString().trim());
                    int n2  =Integer.parseInt(no2.getEditText().getText().toString().trim());
                    int res = n1*n2;
                    ans.setText(""+res);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (no1.getEditText().getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Number one is empty!", Toast.LENGTH_SHORT).show();
                }
                else if(no2.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Number Two is empty!", Toast.LENGTH_SHORT).show();
                }
                else {
                    float n1  =Integer.parseInt(no1.getEditText().getText().toString().trim());
                    float n2  =Integer.parseInt(no2.getEditText().getText().toString().trim());
                    float res = n1/n2;
                    ans.setText(""+res);
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (no1.getEditText().getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Number one is empty!", Toast.LENGTH_SHORT).show();
                }
                else if(no2.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Number Two is empty!", Toast.LENGTH_SHORT).show();
                }
                else {
                    float n1  =Integer.parseInt(no1.getEditText().getText().toString().trim());
                    float n2  =Integer.parseInt(no2.getEditText().getText().toString().trim());
                    float res = n1%n2;
                    ans.setText(""+res);
                }
            }
        });

    }
}