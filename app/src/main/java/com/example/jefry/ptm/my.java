package com.example.jefry.ptm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class my extends AppCompatActivity {
    EditText ET_Num1, ET_Num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ET_Num1 = (EditText) findViewById(R.id.ea);
        ET_Num2 = (EditText) findViewById(R.id.ea2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void sumarOnClick(View v) {
        Intent i = new Intent(this, Resultado.class);
        int Num1 = Integer.parseInt(ET_Num1.getText().toString());
        int Num2 = Integer.parseInt(ET_Num2.getText().toString());
        i.putExtra("Num1", Num1);
        i.putExtra("Num2", Num2);

        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.acerca) {
            Toast.makeText(this,"creado por jefry", Toast.LENGTH_LONG).show();
            return true;
        }
            if(id == R.id.borrar)
            {
                ET_Num1.setText("");
                ET_Num2.setText("");
            }
        return super.onOptionsItemSelected(item);
    }
}
