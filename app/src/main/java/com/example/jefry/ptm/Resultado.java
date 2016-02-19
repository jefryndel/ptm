package com.example.jefry.ptm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
TextView resu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Bundle b = getIntent().getExtras();
        if(b!=null){
            int num1 = b.getInt("Num1");
           int num2 = b.getInt("Num2");
          int  suma=num1+num2;
            resu = (TextView) findViewById(R.id.texto);
            resu.setText(String.valueOf(suma));

        }else
        {
            Toast.makeText(this, "creado por jefry", Toast.LENGTH_LONG).show();
        }
    }
    public void volverOnClick(View v){
        resu.setText("");
            super.onBackPressed();
    }
}
