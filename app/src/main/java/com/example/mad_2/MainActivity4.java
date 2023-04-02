package com.example.mad_2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }
    public static double farenheitToCelsius(double farenhiet) {
        double celsius;
        celsius = (farenhiet-32)/1.8;
        return celsius;
    }
    private void settingUpListerners() {
        btn.setOnClickListener(view->{
            double Farenhiet=Integer.parseInt(num.getText().toString());
            double bin = farenheitToCelsius(Farenhiet);
            res.setText("Celsius = "+bin);
        });
    }
    private void initComponents() {
        num = findViewById(R.id.myNum);
        btn = findViewById(R.id.btnC);
        res = findViewById(R.id.res);
    }
}