package com.example.vash.industria40uc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListaAgenda extends AppCompatActivity {

    private RecyclerView rvAgenda;
    private RecyclerViewEventoAdapter eventoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_agenda);

        rvAgenda=findViewById(R.id.rvListAgenda);
        rvAgenda.setLayoutManager(new LinearLayoutManager(this));

        rvAgenda.setAdapter(eventoAdapter);
        final IndustriaDB db=new IndustriaDB(this);
        db.insertarEvento();
    }
}
