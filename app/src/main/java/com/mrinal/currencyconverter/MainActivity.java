package com.mrinal.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void convertInDollars(View view){
        EditText rupee = (EditText) findViewById(R.id.rupee);
        String s1 = rupee.getText().toString();
        Double d1 = Double.parseDouble(s1);
        d1 = d1/ 64;
        Toast.makeText(this,"the dollar value is "+ d1 , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
