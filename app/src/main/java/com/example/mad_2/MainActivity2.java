package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }
    public static int decimaltobinary(int decimal) {
        int[] binary = new int[100];
        int i = 0;
        while (decimal > 0) {
            binary[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }
        int bin = 0;
        for (int j = i - 1; j >= 0; j--) {
            bin = bin * 10 + binary[j];
        }
        return bin;
    }
    private void settingUpListerners() {
        btn.setOnClickListener(view->{
            int decimal=Integer.parseInt(num.getText().toString());
            int bin = decimaltobinary(decimal);
            res.setText(bin);
        });
    }
    private void initComponents() {
        num = findViewById(R.id.myNum);
        btn = findViewById(R.id.btnC);
        res = findViewById(R.id.res);
    }
}