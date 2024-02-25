package com.muxxu00.treeclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class magasin extends AppCompatActivity {

    Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);

        retour=findViewById(R.id.retour);

        retour.setOnClickListener( v -> openmain());


    }

    public void openmain() {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}