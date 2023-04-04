package com.indigenas.slotmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InicioActivity extends AppCompatActivity {

    EditText nombreEditTxt;
    String nombreJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void PlayGame(View view) {
        nombreEditTxt = findViewById(R.id.edtxNombre);
        nombreJugador = nombreEditTxt.getText().toString();

        Intent playgame = new Intent(this, MainActivity.class);
        playgame.putExtra("nomPlayer",nombreJugador);
        startActivity(playgame);
    }



}