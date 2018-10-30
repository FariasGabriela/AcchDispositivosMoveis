package com.example.gabriela.dispositivosmoveisacch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class QuantidadeFaltasRestantes extends AppCompatActivity {

    private String[] text = { "Quantiade aulas" , "Porcentagem", "Total" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid);
        gridView.setAdapter(new EditText(this, text));
    }

    public void onClickVoltar(View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }

    public void onClickCalcular(View view) {
        TextView qtFaltas = findViewById(R.id.qtFaltas);
        TextView qtAulas = findViewById(R.id.qtAulas);
        TextView porcFaltas = findViewById(R.id.porcFaltas);
        TextView valorFinal = findViewById(R.id.resultado);

        double faltas = Integer.parseInt(qtFaltas.getText().toString());
        double aulas = Integer.parseInt(qtAulas.getText().toString());
        double porcentagem = Integer.parseInt(porcFaltas.getText().toString());

        double resultado = aulas * ( porcentagem / 100 );
        double faltasRestantes = aulas - resultado;

        valorFinal.setText( Double.toString( faltasRestantes ) );

    }
}
