package com.example.a4enraya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jorge on 11/03/2018.
 */

public class inicio extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }
    public void iniciarJuego(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
