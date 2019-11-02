package com.example.vash.industria40uc;

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
    public static final String AUDIO = "audio";
    public static final String IMAGEN = "imagen";
    public static final String VIDEO = "video";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponentes);


        this.listView.setNestedScrollingEnabled(true);
        this.listView.setAdapter(customAdapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }


    private String getEmoji(int unicode) {
        return new String(Character.toChars(unicode));
    }


}

