package com.example.mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.boton);
        TextView texto = (TextView) findViewById(R.id.mensaje);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (texto.getVisibility() == View.VISIBLE){
                    texto.setVisibility(View.INVISIBLE);
                } else {
                    texto.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}