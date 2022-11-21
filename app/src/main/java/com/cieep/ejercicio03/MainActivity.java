package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarInfo (View view) {
        CardView cardView = (CardView) view;
        int nombre=0;
        int imagen=0;
        int descripcion=0;
        switch (cardView.getId()) {
            case R.id.cardBerlin:
                nombre = R.string.Berlin;
                descripcion = R.string.Berlin_desc;
                imagen = R.drawable.berl_n_desc;
                break;
            case R.id.cardDenver:
                nombre = R.string.Denver;
                descripcion = R.string.Denver_desc;
                imagen = R.drawable.denver_desc;
                break;
            case R.id.cardMoscu:
                nombre = R.string.Moscu;
                descripcion = R.string.Moscu_desc;
                imagen = R.drawable.mosc__desc;
                break;
            case R.id.cardProfesor:
                nombre = R.string.profesor;
                descripcion = R.string.profesor_desc;
                imagen = R.drawable.el_profesor_desc;
                break;
            case R.id.cardRio:
                nombre = R.string.Rio;
                descripcion = R.string.Rio_desc;
                imagen = R.drawable.r_o_desc;
                break;
            case R.id.cardTokio:
                nombre = R.string.Tokio;
                descripcion = R.string.Tokio_desc;
                imagen = R.drawable.tokio_desc;
                break;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("NAME", nombre);
        bundle.putInt("DESC", descripcion);
        bundle.putInt("IMAGEN", imagen);
        Intent intent = new Intent(this, VerMasActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}