package com.example.app1subirbajartexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaramos variables
    EditText etTextoArriba,etTextoAbajo;

    Button btBajar,btSubir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hacer referencia a las vistas
        initReferences();

        // generamos los listeners de los botones

        btBajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comprobar si hay texto arriba, si lo hay... bajarlo y limpiar arriba
                if(!etTextoArriba.getText().toString().isEmpty()){
                    etTextoAbajo.setText(etTextoArriba.getText());
                    etTextoArriba.setText("");
                } else{
                    Toast.makeText(MainActivity.this, "No hay texto !!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btSubir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comprobar si hay texto abajo, si lo hay..subirlo... y limpiar abajo
                if(!etTextoAbajo.getText().toString().isEmpty()){
                    etTextoArriba.setText(etTextoAbajo.getText());
                    etTextoAbajo.setText("");
                } else{
                    Toast.makeText(MainActivity.this, "No hay texto !!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

        //metodo privado que inicializa las vistas XML
        private void initReferences() {

            btBajar = findViewById(R.id.buttonBajar);
            btSubir = findViewById(R.id.buttonSubir);
            etTextoAbajo = findViewById(R.id.editTextInferior);
            etTextoArriba = findViewById(R.id.editTextSuperior);



    }
}