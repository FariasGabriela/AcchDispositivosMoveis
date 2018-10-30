package com.example.gabriela.dispositivosmoveisacch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickQtFaltas(View view) {
        Intent qtFaltasActivity = new Intent(MainActivity.this, QuantidadeFaltas.class);
        Bundle bundle = new Bundle();
        bundle.putString("nome", "gabriela");
        startActivity(qtFaltasActivity, bundle);

        Log.i("teste", "gabriela");
    }

    public void onClickQtFaltasRestantes(View view) {
        Intent qtFaltasRestantesActivity = new Intent(MainActivity.this, QuantidadeFaltasRestantes.class);
        startActivity(qtFaltasRestantesActivity);
    }
}
