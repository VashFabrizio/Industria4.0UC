package com.example.vash.industria40uc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListaAgenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_agenda);

        final IndustriaDB db=new IndustriaDB(this);
        db.insertarEvento();
    }
}
