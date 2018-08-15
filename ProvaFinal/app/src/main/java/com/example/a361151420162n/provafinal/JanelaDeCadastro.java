package com.example.a361151420162n.provafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JanelaDeCadastro extends Generica {

    EditText produto, quantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_de_cadastro);
        produto = findViewById(R.id.produto);
        quantidade = findViewById(R.id.quantidade);
    }

    public void cadastrar(View view) {
        this.conectar();
        banco.execSQL("insert into aluno values (" + produto.getText().toString() + ", " + quantidade.getText().toString() + ");");
        new Mensagem(this, "SUCESSO NO CADASTRO");
    }

}
