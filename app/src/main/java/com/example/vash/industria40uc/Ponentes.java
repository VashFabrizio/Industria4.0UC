package com.example.vash.industria40uc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ponentes extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;

    public static final String TEXTO = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponentes);

        init();

        this.listView.setNestedScrollingEnabled(true);
        this.listView.setAdapter(customAdapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position ==0)
                {
                    Intent a = new Intent(view.getContext(), DetallePonente_Heena.class);
                    startActivity(a);
                }

                if(position ==1)
                {
                    Intent b = new Intent(view.getContext(), DetallePonente_Lucia.class);
                    startActivity(b);
                }

                if(position ==2)
                {
                    Intent c = new Intent(view.getContext(), DetallePonente_Jorge.class);
                    startActivity(c);
                }
                if(position ==3)
                {
                    Intent d = new Intent(view.getContext(), DetallePonente_Ruth.class);
                    startActivity(d);
                }
                if(position ==4)
                {
                    Intent e = new Intent(view.getContext(), DetallePonente_Joseph.class);
                    startActivity(e);
                }
                if(position ==5)
                {
                    Intent f = new Intent(view.getContext(), DetallePonente_Juan.class);
                    startActivity(f);
                }

                if(position ==6)
                {
                    Intent g = new Intent(view.getContext(), DetallePonente_Jairo.class);
                    startActivity(g);
                }

                if(position ==7)
                {
                    Intent h = new Intent(view.getContext(), DetallePonente_Nelson.class);
                    startActivity(h);
                }

                if(position ==8)
                {
                    Intent i = new Intent(view.getContext(), DetallePonente_Edmundo.class);
                    startActivity(i);
                }

                if(position ==9)
                {
                    Intent j = new Intent(view.getContext(), DetallePonente_Cesar.class);
                    startActivity(j);
                }

                if(position ==10)
                {
                    Intent k = new Intent(view.getContext(), DetallePonente_Italo.class);
                    startActivity(k);
                }

                if(position ==11)
                {
                    Intent l = new Intent(view.getContext(), DetallePonente_Jose.class);
                    startActivity(l);
                }

            }
        });

    }

    private void init() {
        this.listView = findViewById(R.id.listViewPonentes);
        this.customAdapter = new CustomAdapter(this, getArrayList());
    }

    private String getEmoji(int unicode) {
        return new String(Character.toChars(unicode));
    }

    private ArrayList<ObjetoListView> getArrayList() {

        ArrayList<ObjetoListView> arrayList = new ArrayList<>();


        return arrayList;
    }

}