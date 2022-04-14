package com.example.activity_game_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnJouer = (Button) findViewById(R.id.jouer);
        btnJouer.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId() == R.id.jouer){
            EditText joueur1 = (EditText) findViewById(R.id.joueur1);
            EditText joueur2 = (EditText) findViewById(R.id.joueur2);
            if(joueur1.getText().toString().equals("")|| joueur2.getText().toString().equals("")){
                //Message d'erreur
            } else {
                int scoreJ1 = 0;
                int scoreJ2 = 0;
                Intent inte = new Intent(this, jeu.class);
                inte.putExtra("Joueur1", joueur1.getText().toString());
                inte.putExtra("Joueur2", joueur2.getText().toString());
                startActivity(inte);
            }
        }
    }
}