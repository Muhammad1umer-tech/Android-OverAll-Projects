package com.example.mad_2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }
    public static float cmToFt(float cm) {
        float ft;
        ft = (float) (cm/30.48);
        return ft;
    }
    private void settingUpListerners() {
        btn.setOnClickListener(view->{
            float cm=Integer.parseInt(num.getText().toString());
            float bin = cmToFt(cm);
            res.setText("Ft = "+bin);
        });
    }
    private void initComponents() {
        num = findViewById(R.id.myNum);
        btn = findViewById(R.id.btnC);
        res = findViewById(R.id.res);
    }
}