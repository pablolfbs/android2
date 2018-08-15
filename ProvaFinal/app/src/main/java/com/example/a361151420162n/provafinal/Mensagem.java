package com.example.a361151420162n.provafinal;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by 36115142016.2N on 26/06/2018.
 */

public class Mensagem {
    Mensagem(Context context, String str) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("MENSAGEM");
        alertDialog.setMessage(str);
        alertDialog.show();
    }
}