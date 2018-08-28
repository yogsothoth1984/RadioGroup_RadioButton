package com.max.radiogroup_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText et1, et2;
private Button botOperar;
private TextView tv1;
private RadioButton rbSuma, rbResta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        botOperar=findViewById(R.id.botOperar);
        tv1=findViewById(R.id.tv1);
        rbSuma=findViewById(R.id.rbSuma);
        rbResta=findViewById(R.id.rbResta);
    }
    public void operar(View v){
    int nro1=Integer.parseInt(et1.getText().toString());
    int nro2=Integer.parseInt(et2.getText().toString());
        if (rbSuma.isChecked() == true) {
            int suma= nro1 + nro2;
            String resu=String .valueOf(suma);
            tv1.setText(resu);
        }else if(rbResta.isChecked()==true){
            int resta=nro1 - nro2;
            tv1.setText(String.valueOf(resta));
        }

        }
        }
