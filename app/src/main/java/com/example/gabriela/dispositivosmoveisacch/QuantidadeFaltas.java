package com.example.gabriela.dispositivosmoveisacch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class QuantidadeFaltas extends AppCompatActivity {

    private String[] text = { "Quantidade" , "Porcentagem" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid);
        gridView.setAdapter(new EditText(this, text));

        //Bundle bundle = getIntent().getExtras();
        //bundle.containsKey("nome");
        //String nome = bundle.getString("nome");
    }


    public void onClickVoltar(View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }

    public void onClickCalcular(View view) {
        //Arrumar variaveis
        GridView gridView = findViewById(R.id.grid);
        TextView qtAulas = findViewById(R.id.qtAulas);
        TextView porcFaltas = findViewById(R.id.porcFaltas);
        TextView valorResultado = findViewById(R.id.resultado);

        double aulas = Integer.parseInt(qtAulas.getText().toString());
        double porcentagem = Integer.parseInt(porcFaltas.getText().toString());

        double resultado = aulas * ( porcentagem / 100 );

        valorResultado.setText( Double.toString( resultado ) );

    }


}
