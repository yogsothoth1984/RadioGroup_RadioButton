package com.max.radiogroup_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
