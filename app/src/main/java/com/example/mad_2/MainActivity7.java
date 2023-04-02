package com.example.mad_2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    EditText num;
    TextView res1;
    TextView res2;
    TextView res3;
    TextView res4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
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
            int currency=Integer.parseInt(num.getText().toString());
            int h,f,t,o,remember,remember1 = 0, remember2 = 0;
            h=currency/100;
            remember = currency%100;
            res1.setText("Note of 100= "+h);
            if(remember>=50)
            {
                f=remember/50;
                remember1 = remember%50;
                res2.setText("Note of 50= "+f);
                System.out.println("Note of 50= "+f);
                if(remember1 <50)
                {
                    t = remember1/10;
                    remember2 = remember1%10;
                    res3.setText("Note of 10= "+t);
                    res4.setText("Note of 1= " + remember2);
                }
            }
            else if(remember<50)
            {
                t = remember/10;
                remember2 = remember%10;
                res4.setText("Note of 10= "+t);
                res4.setText("Note of 1=" + remember2);
            }



        });
    }
    private void initComponents() {
        num = findViewById(R.id.myNum);
        btn = findViewById(R.id.btnC);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);
        res3 = findViewById(R.id.res3);
        res4 = findViewById(R.id.res4);
    }
}