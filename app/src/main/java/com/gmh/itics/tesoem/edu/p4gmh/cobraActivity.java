package com.gmh.itics.tesoem.edu.p4gmh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cobraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobra);
    }
    public void cobra(View v){
        Intent frmmenu = new Intent(this, frmmenu.class);
        startActivity(frmmenu);
        finish();
}
}

