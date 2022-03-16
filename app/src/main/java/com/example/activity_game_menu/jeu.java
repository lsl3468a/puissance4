package com.example.activity_game_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class jeu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);
        Intent inte = getIntent();
        String nameJ1 = inte.getStringExtra("Joueur1");
        String nameJ2 = inte.getStringExtra("Joueur2");
        TextView txtJ1 = (TextView) findViewById(R.id.nameJ1);
        TextView txtJ2 = (TextView) findViewById(R.id.nameJ2);
        txtJ1.setText(nameJ1);
        txtJ2.setText(nameJ2);
    }
}