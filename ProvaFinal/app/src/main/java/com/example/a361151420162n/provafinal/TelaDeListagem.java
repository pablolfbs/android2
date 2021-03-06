package com.example.a361151420162n.provafinal;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class TelaDeListagem extends Generica {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_listagem);

        gridView = findViewById(R.id.gridView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("PRODUTO");
        arrayList.add("QUANTIDADE");
        arrayList.add(" ");
        arrayList.add(" ");

        this.conectar();

        Cursor cursor;
        cursor = this.banco.rawQuery("select produto from senac;", null);
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);

        gridView.setAdapter(arrayAdapter);
    }
    }
}
