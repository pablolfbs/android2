package com.example.a361151420162n.arquivo;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText campoEscrita, campoLeitura;
    String arquivo = "arquivo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoEscrita = findViewById(R.id.campoEscrita);
        campoLeitura = findViewById(R.id.campoLeitura);

    }

    public void escrita(View view) {
        Toast.makeText(this, "ESCREVENDO", Toast.LENGTH_SHORT).show();
        try {
            FileOutputStream fileOutputStream = this.openFileOutput(arquivo, MODE_PRIVATE);
            fileOutputStream.write(campoEscrita.getText().toString().getBytes(), 0,
                    campoEscrita.getText().toString().length());
            fileOutputStream.close();
        } catch (Exception e) {
            campoLeitura.setText("FALHA NA ESCRITA: " + e.toString());
        }
    }

    public void leitura(View view) {
        int digito;
        String str = "";
        Toast.makeText(this, "LENDO", Toast.LENGTH_SHORT).show();
        try {
            FileInputStream fileInputStream = this.openFileInput(arquivo);
            while ((digito = fileInputStream.read()) != -1) {
                str += (char) digito;
            }
            fileInputStream.close();
            campoLeitura.setText(str);
        } catch (Exception e) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("MENSAGEM");
            alertDialog.setMessage(e.toString());
            alertDialog.show();
            campoLeitura.setText("FALHA NA ESCRITA: " + e.toString());
        }
    }

    public void verificar(View view) {

//        File arquivo = new File("arquivo");
//
//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//        alertDialog.setTitle("MENSAGEM");
//        try {
//            alertDialog.setMessage(arquivo.getCanonicalPath().toString());
//        } catch (Exception e) {
//            alertDialog.setMessage(e.toString());
//        }
//        alertDialog.show();

        // File arquivo = new File("pasta");
        // arquivo.mkdir();

        this.deleteFile("arquivo");

        // File dir = this.getFilesDir();

        // File x = new File(dir, "arquivo");

        // File arquivo = new File("arquivo");

        // Toast.makeText(this, arquivo.getAbsolutePath(), Toast.LENGTH_LONG).show();
    }
}
