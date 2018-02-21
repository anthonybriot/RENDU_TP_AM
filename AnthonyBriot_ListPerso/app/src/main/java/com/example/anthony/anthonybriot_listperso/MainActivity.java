package com.example.anthony.anthonybriot_listperso;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView mListView;
    String[] noms = new String[]{
            "BASKETBALL", "FOOTBALL", "HANDBALL", "VOLLEYBALL", "BASEBALL", "TENNIS",
            "TENNIS", "TENNIS DE TABLE", "CRICKET", "MUSCULATION", "GYM", "SURF",
            "SNOWBOARD", "SKI", "BASEJUMP", "CURLING", "SKATEBOARD", "BOXE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);

        //afficherListeNoms();
        afficherListeSports();
    }

    private void afficherListeNoms(){

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, noms);
        mListView.setAdapter(adapter);
    }

    private List<Sport> genererSports(){
        List<Sport> sports = new ArrayList<Sport>();
        sports.add(new Sport(R.mipmap.basket, "BASKETBALL", "Un sport collectif opposant deux équipes de cinq joueurs sur un terrain rectangulaire."));
        sports.add(new Sport(R.mipmap.foot, "FOOTBALL", "Un sport collectif qui se joue principalement au pied avec un ballon sphérique. Il oppose deux équipes de onze joueurs dans un stade."));
        sports.add(new Sport(R.mipmap.hand, "HANDBALL", "Un sport collectif joué à la main où deux équipes de sept joueurs s'affrontent avec un ballon sur un terrain rectangulaire."));
        sports.add(new Sport(R.mipmap.volley, "VOLLEYBALL", "Un sport collectif mettant en jeu deux équipes de six joueurs séparés par un filet."));
        sports.add(new Sport(R.mipmap.base, "BASEBALL", "Un sport collectif dérivé des mêmes racines que le cricket, qui se pratique sur un terrain de gazon et de sable. Il se joue avec des battes pour frapper une balle lancée."));
        return sports;
    }

    private void afficherListeSports(){
        List<Sport> sports = genererSports();

        SportAdapter adapter = new SportAdapter(MainActivity.this, sports);
        mListView.setAdapter(adapter);
    }
}