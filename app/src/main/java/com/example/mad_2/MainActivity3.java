package com.example.mad_2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }
    public static double celsiusToFarenheit(double celsius) {
        double farenhiet;
        farenhiet = (celsius*1.8)+32;
        return farenhiet;
    }
    private void settingUpListerners() {
        btn.setOnClickListener(view->{
            double Celsius=Integer.parseInt(num.getText().toString());
            double bin = celsiusToFarenheit(Celsius);
            res.setText("Farenheit = "+bin);
        });
    }
    private void initComponents() {
        num = findViewById(R.id.myNum);
        btn = findViewById(R.id.btnC);
        res = findViewById(R.id.res);
    }
}