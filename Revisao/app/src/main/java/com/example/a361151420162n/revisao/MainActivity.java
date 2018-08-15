package com.example.a361151420162n.revisao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList cidades = new ArrayList();
        cidades.add("Rio de Janeiro");
        cidades.add("Niterói");
        cidades.add("São Gonçalo");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, cidades);
        spinner.setAdapter(arrayAdapter);
    }

    public void processar(View view) {
        Toast.makeText(this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT);
    }
}
