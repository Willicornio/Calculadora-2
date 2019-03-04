package com.example.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button suma;
    EditText numeroa;
    EditText numerob;
    Button resta;
    Button multipli;
    Button divi;
    Button sumaans;
    TextView ans;
    EditText numeroc;
    Button restaans;
    Button divians;
    Button multians;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaans = findViewById(R.id.restaans);
        multians= findViewById(R.id.multians);
        divians= findViewById(R.id.divians);
        sumaans = findViewById(R.id.sumans);
        ans = findViewById(R.id.ans);
        suma = findViewById(R.id.suma);
        numeroa = findViewById(R.id.Numa);
        numerob = findViewById(R.id.Numb);
        numeroc = findViewById(R.id.Numc);
        resta = findViewById(R.id.resta);
        multipli = findViewById(R.id.multi);
        divi = findViewById(R.id.divi);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroa.getText().toString();
                String cosa2 = numeroa.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                int numero2 = Integer.parseInt(cosa2);
                int res = numero1 + numero2;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));



            }
        });
        sumaans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroc.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                String ans2 = ans.getText().toString();
                int ans1 = Integer.parseInt(ans2);
                int res = ans1 + numero1;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroa.getText().toString();
                String cosa2 = numeroa.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                int numero2 = Integer.parseInt(cosa2);
                int res = numero1 - numero2;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });
        restaans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroc.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                String ans2 = ans.getText().toString();
                int ans1 = Integer.parseInt(ans2);
                int res = ans1 - numero1;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });
        multipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroa.getText().toString();
                String cosa2 = numeroa.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                int numero2 = Integer.parseInt(cosa2);
                int res = numero1 * numero2;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });
        multians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroc.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                String ans2 = ans.getText().toString();
                int ans1 = Integer.parseInt(ans2);
                int res = ans1 * numero1;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));


            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroa.getText().toString();
                String cosa2 = numeroa.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                int numero2 = Integer.parseInt(cosa2);
                int res = numero1 / numero2;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });
        divians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cosa1 = numeroc.getText().toString();
                int numero1 = Integer.parseInt(cosa1);
                String ans2 = ans.getText().toString();
                int ans1 = Integer.parseInt(ans2);
                int res = ans1 + numero1;
                Toast.makeText(getApplicationContext(), "el resultado es:" + res, Toast.LENGTH_SHORT).show();
                ans.setText(String.valueOf(res));

            }
        });
    }
}