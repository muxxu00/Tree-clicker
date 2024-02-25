package com.muxxu00.treeclicker;

import static com.muxxu00.treeclicker.R.id.Imgplante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Click;
    ImageView Imgplante, para, magasin;

    private int c=0;

    public int getC() {
        return c;
    }
    public void setC(int c){
        this.c = c;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Click = findViewById(R.id.Click);
        Imgplante = findViewById(R.id.Imgplante);
        para = findViewById(R.id.para);
        magasin = findViewById(R.id.magasin);

        Imgplante.setOnClickListener(v -> {
            c++;
            Click.setText("Feuille " + c);
        });

        magasin.setOnClickListener(v -> openmagasin());

        para.setOnClickListener(v -> openparametre());

    }
    public void openmagasin() {
        Intent intent= new Intent(this, magasin.class);
        startActivity(intent);
    }

    public void openparametre() {
        Intent intent= new Intent(this, para.class);
        startActivity(intent);
    }
}
