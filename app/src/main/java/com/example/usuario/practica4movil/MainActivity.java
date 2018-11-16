package com.example.usuario.practica4movil;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,FragUno.OnFragmentInteractionListener,FragDos.OnFragmentInteractionListener {


    Button botonFragUno, botonFragDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonFragUno=(Button)findViewById(R.id.btnFrgUno);
        botonFragDos=(Button)findViewById(R.id.btnFrgDos);
        botonFragUno.setOnClickListener(this);
        botonFragDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFrgUno:
                FragUno fragmentoUno = new FragUno();
                FragmentTransaction transactionUno=getSupportFragmentManager().beginTransaction();
                transactionUno.replace(R.id.contenedor,fragmentoUno);
                transactionUno.commit();
                break;
            case R.id.btnFrgDos:
                FragDos FragmentoDos =new FragDos();
                FragmentTransaction transactionDos = getSupportFragmentManager().beginTransaction();
                transactionDos.replace(R.id.contenedor,FragmentoDos);
                transactionDos.commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}