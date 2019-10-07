package com.gmh.itics.tesoem.edu.p4gmh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frmmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmmenu);
    }
    public void perro(View v){
        Intent perro = new Intent(this,perroActivity.class);
        startActivity(perro);
        finish();
}
public void tiburon(View v){
        Intent tiburon = new Intent(this,tiburon2Activity.class);
        startActivity(tiburon);
        finish();

}
public void perico(View v){
        Intent perico = new Intent(this,pericoActivity.class);
        startActivity(perico);
        finish();

}
public void oso(View v){
        Intent oso = new Intent(this,osoActivity.class);
        startActivity(oso);
        finish();
}
public void lobo(View v) {
    Intent lobo = new Intent(this, loboActivity.class);
    startActivity(lobo);
    finish();
}
public void gato(View v) {
    Intent gato = new Intent(this, gatoActivity.class);
    startActivity(gato);
    finish();

}

    public void ardilla(View v){
        Intent ardilla = new Intent(this, ardilla2Activity.class);
        startActivity(ardilla);
        finish();
}
public void cobra(View v){
        Intent cobra = new Intent(this, cobraActivity.class);
        startActivity(cobra);
        finish();
    }
}
