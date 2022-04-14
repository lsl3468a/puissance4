package com.example.activity_game_menu;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import nl.dionsegijn.konfetti.core.Angle;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Spread;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Size;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public class jeu extends AppCompatActivity implements View.OnClickListener {
    private int tourJ;
    private int drawableJoueur;
    private String joueurEnCours;
    private int[][] board = new int[6][7];

    private KonfettiView konfettiView = null;
    private Shape.DrawableShape drawableShape = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);
        final Drawable drawableT = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_foreground);
        drawableShape = new Shape.DrawableShape(drawableT, true);
        konfettiView = findViewById(R.id.konfettiView);
        EmitterConfig emitterConfig = new Emitter(5L, TimeUnit.SECONDS).perSecond(50);
        Party party = new PartyFactory(emitterConfig)
                .angle(270)
                .spread(90)
                .setSpeedBetween(1f, 5f)
                .timeToLive(2000L)
                .shapes(new Shape.Rectangle(0.2f), drawableShape)
                .sizes(new Size(12, 5f, 0.2f))
                .position(0.0, 0.0, 1.0, 0.0)
                .build();
        tourJ = 1;
        Intent inte = getIntent();
        String nameJ1 = inte.getStringExtra("Joueur1");
        String nameJ2 = inte.getStringExtra("Joueur2");
        TextView txtJ1 = (TextView) findViewById(R.id.nameJ1);
        TextView txtJ2 = (TextView) findViewById(R.id.nameJ2);
        txtJ1.setText(nameJ1);
        txtJ2.setText(nameJ2);
        createBoard();
        joueurEnCours = nameJ1;
        TextView txtTour = (TextView) findViewById(R.id.tour);
        txtTour.setText("C'est le tour de : Joueur 1");
        Button retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(this);
        ImageView case11 = (ImageView) findViewById(R.id.case11);
        case11.setOnClickListener(this);
        ImageView case12 = (ImageView) findViewById(R.id.case12);
        case12.setOnClickListener(this);
        ImageView case13 = (ImageView) findViewById(R.id.case13);
        case13.setOnClickListener(this);
        ImageView case14 = (ImageView) findViewById(R.id.case14);
        case14.setOnClickListener(this);
        ImageView case15 = (ImageView) findViewById(R.id.case15);
        case15.setOnClickListener(this);
        ImageView case16 = (ImageView) findViewById(R.id.case16);
        case16.setOnClickListener(this);
        ImageView case21 = (ImageView) findViewById(R.id.case21);
        case21.setOnClickListener(this);
        ImageView case22 = (ImageView) findViewById(R.id.case22);
        case22.setOnClickListener(this);
        ImageView case23 = (ImageView) findViewById(R.id.case23);
        case23.setOnClickListener(this);
        ImageView case24 = (ImageView) findViewById(R.id.case24);
        case24.setOnClickListener(this);
        ImageView case25 = (ImageView) findViewById(R.id.case25);
        case25.setOnClickListener(this);
        ImageView case26 = (ImageView) findViewById(R.id.case26);
        case26.setOnClickListener(this);
        ImageView case31 = (ImageView) findViewById(R.id.case31);
        case31.setOnClickListener(this);
        ImageView case32 = (ImageView) findViewById(R.id.case32);
        case32.setOnClickListener(this);
        ImageView case33 = (ImageView) findViewById(R.id.case33);
        case33.setOnClickListener(this);
        ImageView case34 = (ImageView) findViewById(R.id.case34);
        case34.setOnClickListener(this);
        ImageView case35 = (ImageView) findViewById(R.id.case35);
        case35.setOnClickListener(this);
        ImageView case36 = (ImageView) findViewById(R.id.case36);
        case36.setOnClickListener(this);
        ImageView case41 = (ImageView) findViewById(R.id.case41);
        case41.setOnClickListener(this);
        ImageView case42 = (ImageView) findViewById(R.id.case42);
        case42.setOnClickListener(this);
        ImageView case43 = (ImageView) findViewById(R.id.case43);
        case43.setOnClickListener(this);
        ImageView case44 = (ImageView) findViewById(R.id.case44);
        case44.setOnClickListener(this);
        ImageView case45 = (ImageView) findViewById(R.id.case45);
        case45.setOnClickListener(this);
        ImageView case46 = (ImageView) findViewById(R.id.case46);
        case46.setOnClickListener(this);
        ImageView case51 = (ImageView) findViewById(R.id.case51);
        case51.setOnClickListener(this);
        ImageView case52 = (ImageView) findViewById(R.id.case52);
        case52.setOnClickListener(this);
        ImageView case53 = (ImageView) findViewById(R.id.case53);
        case53.setOnClickListener(this);
        ImageView case54 = (ImageView) findViewById(R.id.case54);
        case54.setOnClickListener(this);
        ImageView case55 = (ImageView) findViewById(R.id.case55);
        case55.setOnClickListener(this);
        ImageView case56 = (ImageView) findViewById(R.id.case56);
        case56.setOnClickListener(this);
        ImageView case61 = (ImageView) findViewById(R.id.case61);
        case61.setOnClickListener(this);
        ImageView case62 = (ImageView) findViewById(R.id.case62);
        case62.setOnClickListener(this);
        ImageView case63 = (ImageView) findViewById(R.id.case63);
        case63.setOnClickListener(this);
        ImageView case64 = (ImageView) findViewById(R.id.case64);
        case64.setOnClickListener(this);
        ImageView case65 = (ImageView) findViewById(R.id.case65);
        case65.setOnClickListener(this);
        ImageView case66 = (ImageView) findViewById(R.id.case66);
        case66.setOnClickListener(this);
        ImageView case71 = (ImageView) findViewById(R.id.case71);
        case71.setOnClickListener(this);
        ImageView case72 = (ImageView) findViewById(R.id.case72);
        case72.setOnClickListener(this);
        ImageView case73 = (ImageView) findViewById(R.id.case73);
        case73.setOnClickListener(this);
        ImageView case74 = (ImageView) findViewById(R.id.case74);
        case74.setOnClickListener(this);
        ImageView case75 = (ImageView) findViewById(R.id.case75);
        case75.setOnClickListener(this);
        ImageView case76 = (ImageView) findViewById(R.id.case76);
        case76.setOnClickListener(this);
    }

    public void createBoard() {
        for(int i = 0; i< 6; i++){
            for(int j=0; j<7; j++){
                this.board[i][j] = 0;
            }
        }
    }

    boolean caseblanche(Drawable drawable){
        Drawable white = getResources().getDrawable(R.drawable.white);
        if (drawable.getConstantState().equals(white.getConstantState())){
            return true;
        } else {
            return false;
        }
    }

    public boolean gagner(int joueur){
        if(horizontalCheck(joueur) || verticalCheck(joueur) || ascendingDiagonalCheck(joueur) || descendingDiagonalCheck(joueur)){
            return true;
        } else {
            return false;
        }
    }

    public boolean ascendingDiagonalCheck(int joueur) {
        if(this.board[2][6]==joueur && this.board[3][5]==joueur && this.board[4][4]==joueur && this.board[5][3]==joueur){
            return true;
        }
        if(this.board[0][3]==joueur && this.board[1][2]==joueur && this.board[2][1]==joueur && this.board[3][0]==joueur){
            return true;
        }
        int i = 4; int j = 0;
        if(this.board[i][j]==joueur && this.board[i-1][j+1]==joueur && this.board[i-2][j+2]==joueur && this.board[i-3][j+3]==joueur){
            return true;
        }
        i=3; j=1;
        if(this.board[i][j]==joueur && this.board[i-1][j+1]==joueur && this.board[i-2][j+2]==joueur && this.board[i-3][j+3]==joueur){
            return true;
        }
        i = 5; j = 2;
        if(this.board[i][j]==joueur && this.board[i-1][j+1]==joueur && this.board[i-2][j+2]==joueur && this.board[i-3][j+3]==joueur){
            return true;
        }
        i=4; j=3;
        if(this.board[i][j]==joueur && this.board[i-1][j+1]==joueur && this.board[i-2][j+2]==joueur && this.board[i-3][j+3]==joueur){
            return true;
        }
        if(this.board[5][0]==joueur && this.board[4][1]==joueur && this.board[3][2]==joueur && this.board[2][3]==joueur){
            return true;
        }
        if(this.board[4][1]==joueur && this.board[3][2]==joueur && this.board[2][3]==joueur && this.board[1][4]==joueur){
            return true;
        }
        if(this.board[3][2]==joueur && this.board[2][3]==joueur && this.board[1][4]==joueur && this.board[0][5]==joueur){
            return true;
        }
        if(this.board[5][1]==joueur && this.board[4][2]==joueur && this.board[3][3]==joueur && this.board[2][4]==joueur){
            return true;
        }
        if(this.board[4][2]==joueur && this.board[3][3]==joueur && this.board[2][4]==joueur && this.board[1][5]==joueur){
            return true;
        }
        if(this.board[3][3]==joueur && this.board[2][4]==joueur && this.board[1][5]==joueur && this.board[0][6]==joueur){
            return true;
        }
        return false;
    }

    public boolean verticalCheck(int joueur) {
        for (int i = 0; i<3 ; i++ ){
            for (int j = 0; j<7; j++){
                if (this.board[i][j] == joueur && this.board[i+1][j] == joueur && this.board[i+2][j] == joueur && this.board[i+3][j] == joueur){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean horizontalCheck(int joueur) {
        for (int j = 0; j<4 ; j++ ){
            for (int i = 0; i<6; i++){
                if (this.board[i][j] == joueur && this.board[i][j+1] == joueur && this.board[i][j+2] == joueur && this.board[i][j+3] == joueur){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean descendingDiagonalCheck(int joueur) {
        if(this.board[2][0]==joueur && this.board[3][1]==joueur && this.board[4][2]==joueur && this.board[5][3]==joueur){
            return true;
        }
        int i = 1; int j = 0;
        if(this.board[i][j]==joueur && this.board[i+1][j+1]==joueur && this.board[i+2][j+2]==joueur && this.board[i+3][j+3]==joueur){
            return true;
        }
        i=2; j=1;
        if(this.board[i][j]==joueur && this.board[i+1][j+1]==joueur && this.board[i+2][j+2]==joueur && this.board[i+3][j+3]==joueur){
            return true;
        }
        i = 0; j = 2;
        if(this.board[i][j]==joueur && this.board[i+1][j+1]==joueur && this.board[i+2][j+2]==joueur && this.board[i+3][j+3]==joueur){
            return true;
        }
        i=1; j=3;
        if(this.board[i][j]==joueur && this.board[i+1][j+1]==joueur && this.board[i+2][j+2]==joueur && this.board[i+3][j+3]==joueur){
            return true;
        }
        if(this.board[0][3]==joueur && this.board[1][4]==joueur && this.board[2][5]==joueur && this.board[3][6]==joueur){
            return true;
        }
        for(i=0;i<3;i++){
            if(this.board[i][i]==joueur && this.board[i+1][i+1]==joueur && this.board[i+2][i+2]==joueur && this.board[i+3][i+3]==joueur){
                return true;
            }
        }
        for(i=0; i<3; i++){
            if(this.board[i][i+1]==joueur && this.board[i+1][i+2]==joueur && this.board[i+2][i+3]==joueur && this.board[i+3][i+4]==joueur){
                return true;
            }
        }
        return false;
    }




    public void jouer(ImageView c, String nomcase){
        Drawable drawable =  c.getDrawable();
        switch(nomcase){
            case "case1":
                ImageView case16 = (ImageView) findViewById(R.id.case16);
                Drawable Dcase16 = case16.getDrawable();
                ImageView case15 = (ImageView) findViewById(R.id.case15);
                Drawable Dcase15 = case15.getDrawable();
                ImageView case14 = (ImageView) findViewById(R.id.case14);
                Drawable Dcase14 = case14.getDrawable();
                ImageView case13 = (ImageView) findViewById(R.id.case13);
                Drawable Dcase13 = case13.getDrawable();
                ImageView case12 = (ImageView) findViewById(R.id.case12);
                Drawable Dcase12 = case12.getDrawable();
                ImageView case11 = (ImageView) findViewById(R.id.case11);
                Drawable Dcase11 = case11.getDrawable();
                if(caseblanche(Dcase16)){
                    case16.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][0]=1;
                    } else if(tourJ%2==1){
                        this.board[5][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase15)) {
                    case15.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][0]=1;
                    } else if(tourJ%2==1){
                        this.board[4][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase14)) {
                    case14.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][0]=1;
                    } else if(tourJ%2==1){
                        this.board[3][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase13)) {
                    case13.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][0]=1;
                    } else if(tourJ%2==1){
                        this.board[2][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase12)) {
                    case12.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][0]=1;
                    } else if(tourJ%2==1){
                        this.board[1][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase11)) {
                    case11.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][0]=1;
                    } else if(tourJ%2==1){
                        this.board[0][0]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case "case2":
                ImageView case26 = (ImageView) findViewById(R.id.case26);
                Drawable Dcase26 = case26.getDrawable();
                ImageView case25 = (ImageView) findViewById(R.id.case25);
                Drawable Dcase25 = case25.getDrawable();
                ImageView case24 = (ImageView) findViewById(R.id.case24);
                Drawable Dcase24 = case24.getDrawable();
                ImageView case23 = (ImageView) findViewById(R.id.case23);
                Drawable Dcase23 = case23.getDrawable();
                ImageView case22 = (ImageView) findViewById(R.id.case22);
                Drawable Dcase22 = case22.getDrawable();
                ImageView case21 = (ImageView) findViewById(R.id.case21);
                Drawable Dcase21 = case21.getDrawable();
                if(caseblanche(Dcase26)){
                    case26.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][1]=1;
                    } else if(tourJ%2==1){
                        this.board[5][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase25)) {
                    case25.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][1]=1;
                    } else if(tourJ%2==1){
                        this.board[4][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase24)) {
                    case24.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][1]=1;
                    } else if(tourJ%2==1){
                        this.board[3][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase23)) {
                    case23.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][1]=1;
                    } else if(tourJ%2==1){
                        this.board[2][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase22)) {
                    case22.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][1]=1;
                    } else if(tourJ%2==1){
                        this.board[1][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase21)) {
                    case21.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][1]=1;
                    } else if(tourJ%2==1){
                        this.board[0][1]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case "case3":
                ImageView case36 = (ImageView) findViewById(R.id.case36);
                Drawable Dcase36 = case36.getDrawable();
                ImageView case35 = (ImageView) findViewById(R.id.case35);
                Drawable Dcase35 = case35.getDrawable();
                ImageView case34 = (ImageView) findViewById(R.id.case34);
                Drawable Dcase34 = case34.getDrawable();
                ImageView case33 = (ImageView) findViewById(R.id.case33);
                Drawable Dcase33 = case33.getDrawable();
                ImageView case32 = (ImageView) findViewById(R.id.case32);
                Drawable Dcase32 = case32.getDrawable();
                ImageView case31 = (ImageView) findViewById(R.id.case31);
                Drawable Dcase31 = case31.getDrawable();
                if(caseblanche(Dcase36)){
                    case36.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][2]=1;
                    } else if(tourJ%2==1){
                        this.board[5][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase35)) {
                    case35.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][2]=1;
                    } else if(tourJ%2==1){
                        this.board[4][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase34)) {
                    case34.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][2]=1;
                    } else if(tourJ%2==1){
                        this.board[3][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase33)) {
                    case33.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][2]=1;
                    } else if(tourJ%2==1){
                        this.board[2][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase32)) {
                    case32.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][2]=1;
                    } else if(tourJ%2==1){
                        this.board[1][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase31)) {
                    case31.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][2]=1;
                    } else if(tourJ%2==1){
                        this.board[0][2]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case "case4":
                ImageView case46 = (ImageView) findViewById(R.id.case46);
                Drawable Dcase46 = case46.getDrawable();
                ImageView case45 = (ImageView) findViewById(R.id.case45);
                Drawable Dcase45 = case45.getDrawable();
                ImageView case44 = (ImageView) findViewById(R.id.case44);
                Drawable Dcase44 = case44.getDrawable();
                ImageView case43 = (ImageView) findViewById(R.id.case43);
                Drawable Dcase43 = case43.getDrawable();
                ImageView case42 = (ImageView) findViewById(R.id.case42);
                Drawable Dcase42 = case42.getDrawable();
                ImageView case41 = (ImageView) findViewById(R.id.case41);
                Drawable Dcase41 = case41.getDrawable();
                if(caseblanche(Dcase46)){
                    case46.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][3]=1;
                    } else if(tourJ%2==1){
                        this.board[5][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase45)) {
                    case45.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][3]=1;
                    } else if(tourJ%2==1){
                        this.board[4][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase44)) {
                    case44.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][3]=1;
                    } else if(tourJ%2==1){
                        this.board[3][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase43)) {
                    case43.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][3]=1;
                    } else if(tourJ%2==1){
                        this.board[2][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase42)) {
                    case42.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][3]=1;
                    } else if(tourJ%2==1){
                        this.board[1][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase41)) {
                    case41.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][3]=1;
                    } else if(tourJ%2==1){
                        this.board[0][3]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case "case5":
                ImageView case56 = (ImageView) findViewById(R.id.case56);
                Drawable Dcase56 = case56.getDrawable();
                ImageView case55 = (ImageView) findViewById(R.id.case55);
                Drawable Dcase55 = case55.getDrawable();
                ImageView case54 = (ImageView) findViewById(R.id.case54);
                Drawable Dcase54 = case54.getDrawable();
                ImageView case53 = (ImageView) findViewById(R.id.case53);
                Drawable Dcase53 = case53.getDrawable();
                ImageView case52 = (ImageView) findViewById(R.id.case52);
                Drawable Dcase52 = case52.getDrawable();
                ImageView case51 = (ImageView) findViewById(R.id.case51);
                Drawable Dcase51 = case51.getDrawable();
                if(caseblanche(Dcase56)){
                    case56.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][4]=1;
                    } else if(tourJ%2==1){
                        this.board[5][4]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase55)) {
                    case55.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][4]=1;
                    } else if(tourJ%2==1){
                        this.board[4][4]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase54)) {
                    case54.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][4]=1;
                    } else if(tourJ%2==1){
                        this.board[3][4]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase53)) {
                    case53.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][4]=1;
                    } else if(tourJ%2==1){
                        this.board[2][4]=2;
                    }
                    tourJ = (tourJ +1);
                } else if (caseblanche(Dcase52)) {
                    case52.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][4]=1;
                    } else if(tourJ%2==1){
                        this.board[1][4]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase51)) {
                    case51.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][4]=1;
                    } else if(tourJ%2==1){
                        this.board[0][4]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case"case6":
                ImageView case66 = (ImageView) findViewById(R.id.case66);
                Drawable Dcase66 = case66.getDrawable();
                ImageView case65 = (ImageView) findViewById(R.id.case65);
                Drawable Dcase65 = case65.getDrawable();
                ImageView case64 = (ImageView) findViewById(R.id.case64);
                Drawable Dcase64 = case64.getDrawable();
                ImageView case63 = (ImageView) findViewById(R.id.case63);
                Drawable Dcase63 = case63.getDrawable();
                ImageView case62 = (ImageView) findViewById(R.id.case62);
                Drawable Dcase62 = case62.getDrawable();
                ImageView case61 = (ImageView) findViewById(R.id.case61);
                Drawable Dcase61 = case61.getDrawable();
                if(caseblanche(Dcase66)){
                    case66.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][5]=1;
                    } else if(tourJ%2==1){
                        this.board[5][5]=2;
                    }
                    tourJ = (tourJ +1);
                } else if (caseblanche(Dcase65)) {
                    case65.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][5]=1;
                    } else if(tourJ%2==1){
                        this.board[4][5]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase64)) {
                    case64.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][5]=1;
                    } else if(tourJ%2==1){
                        this.board[3][5]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase63)) {
                    case63.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][5]=1;
                    } else if(tourJ%2==1){
                        this.board[2][5]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase62)) {
                    case62.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][5]=1;
                    } else if(tourJ%2==1){
                        this.board[1][5]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase61)) {
                    case61.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][5]=1;
                    } else if(tourJ%2==1){
                        this.board[0][5]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
            case "case7":
                ImageView case76 = (ImageView) findViewById(R.id.case76);
                Drawable Dcase76 = case76.getDrawable();
                ImageView case75 = (ImageView) findViewById(R.id.case75);
                Drawable Dcase75 = case75.getDrawable();
                ImageView case74 = (ImageView) findViewById(R.id.case74);
                Drawable Dcase74 = case74.getDrawable();
                ImageView case73 = (ImageView) findViewById(R.id.case73);
                Drawable Dcase73 = case73.getDrawable();
                ImageView case72 = (ImageView) findViewById(R.id.case72);
                Drawable Dcase72 = case72.getDrawable();
                ImageView case71 = (ImageView) findViewById(R.id.case71);
                Drawable Dcase71 = case71.getDrawable();
                if(caseblanche(Dcase76)){
                    case76.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[5][6]=1;
                    } else if(tourJ%2==1){
                        this.board[5][6]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase75)) {
                    case75.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[4][6]=1;
                    } else if(tourJ%2==1){
                        this.board[4][6]=2;
                    }
                    tourJ = (tourJ +1);
                } else if (caseblanche(Dcase74)) {
                    case74.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[3][6]=1;
                    } else if(tourJ%2==1){
                        this.board[3][6]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase73)) {
                    case73.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[2][6]=1;
                    } else if(tourJ%2==1){
                        this.board[2][6]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase72)) {
                    case72.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[1][6]=1;
                    } else if(tourJ%2==1){
                        this.board[1][6]=2;
                    }
                    tourJ = (tourJ +1) ;
                } else if (caseblanche(Dcase71)) {
                    case71.setImageResource(drawableJoueur);
                    if(tourJ%2==0){
                        this.board[0][6]=1;
                    } else if(tourJ%2==1){
                        this.board[0][6]=2;
                    }
                    tourJ = (tourJ +1) ;
                }
                break;
        }
        Drawable green = getResources().getDrawable(R.drawable.green);
        Drawable red = getResources().getDrawable(R.drawable.red);
        if(gagner(1)){
            EmitterConfig emitterConfig = new Emitter(35, TimeUnit.SECONDS).perSecond(100);
            konfettiView.start(
                    new PartyFactory(emitterConfig)
                            .angle(Angle.BOTTOM)
                            .spread(Spread.ROUND)
                            .shapes(Arrays.asList(Shape.Square.INSTANCE, Shape.Circle.INSTANCE, drawableShape))
                            .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                            .setSpeedBetween(0f, 15f)
                            .position(new Position.Relative(0.0, 0.0).between(new Position.Relative(1.0, 0.0)))
                            .build()
            );
            TextView mess = (TextView) findViewById(R.id.tour);
            mess.setText("Victoire du Joueur 2 !");
            Toast.makeText(this, "Victoire du Joueur 2", Toast.LENGTH_SHORT).show();
            Intent inte = new Intent(this, jeu.class);
            TextView nameJ1 = (TextView) findViewById(R.id.nameJ1);
            TextView nameJ2 = (TextView) findViewById(R.id.nameJ2);
            inte.putExtra("Joueur1", nameJ1.getText().toString());
            inte.putExtra("Joueur2", nameJ2.getText().toString());
            inte.putExtra("ScoreJ1", 0);
            inte.putExtra("ScoreJ2", 0);
            startActivity(inte);
        } else if(gagner(2)){
            EmitterConfig emitterConfig = new Emitter(35, TimeUnit.SECONDS).perSecond(100);
            konfettiView.start(
                    new PartyFactory(emitterConfig)
                            .angle(Angle.BOTTOM)
                            .spread(Spread.ROUND)
                            .shapes(Arrays.asList(Shape.Square.INSTANCE, Shape.Circle.INSTANCE, drawableShape))
                            .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                            .setSpeedBetween(0f, 15f)
                            .position(new Position.Relative(0.0, 0.0).between(new Position.Relative(1.0, 0.0)))
                            .build()
            );
            TextView mess = (TextView) findViewById(R.id.tour);
            mess.setText("Victoire du Joueur 1 !");
            Toast.makeText(this, "Victoire du joueur 1", Toast.LENGTH_SHORT).show();
            Intent inte = new Intent(this, jeu.class);
            TextView nameJ1 = (TextView) findViewById(R.id.nameJ1);
            TextView nameJ2 = (TextView) findViewById(R.id.nameJ2);
            inte.putExtra("Joueur1", nameJ1.getText().toString());
            inte.putExtra("Joueur2", nameJ2.getText().toString());
            inte.putExtra("ScoreJ1", 0);
            inte.putExtra("ScoreJ2", 0);
            startActivity(inte);

        }

    }

    @Override
    public void onClick(View v) {
        if((tourJ%2) == 1) {
            drawableJoueur = R.drawable.green;
            TextView j1 = (TextView) findViewById(R.id.nameJ1);
            joueurEnCours = j1.getText().toString();
            TextView txtTour = (TextView) findViewById(R.id.tour);
            txtTour.setText("C'est le tour de : Joueur 2");
        } else if ((tourJ%2)==0){
            drawableJoueur = R.drawable.red;
            TextView j2 = (TextView) findViewById(R.id.nameJ2);
            joueurEnCours = j2.getText().toString();
            TextView txtTour = (TextView) findViewById(R.id.tour);
            txtTour.setText("C'est le tour de : Joueur 1");
        }
        if(v.getId() == R.id.case11){
            Log.v("CLICK","vous avez bien cliqué sur case11");
            ImageView case11 = (ImageView) findViewById(R.id.case11);
            jouer(case11, "case1");
        }
        if(v.getId() == R.id.case12){
            Log.v("CLICK","vous avez bien cliqué sur case12");
            ImageView case12 = (ImageView) findViewById(R.id.case12);
            jouer(case12, "case1");
        }
        if(v.getId() == R.id.case13){
            Log.v("CLICK","vous avez bien cliqué sur case13");
            ImageView case13 = (ImageView) findViewById(R.id.case13);
            jouer(case13, "case1");
        }
        if(v.getId() == R.id.case14){
            Log.v("CLICK","vous avez bien cliqué sur case14");
            ImageView case14 = (ImageView) findViewById(R.id.case14);
            Drawable drawable =  case14.getDrawable();
            jouer(case14, "case1");
        }
        if(v.getId() == R.id.case15){
            Log.v("CLICK","vous avez bien cliqué sur case15");
            ImageView case15 = (ImageView) findViewById(R.id.case15);
            Drawable drawable =  case15.getDrawable();
            jouer(case15, "case1");
        }
        if(v.getId() == R.id.case16){
            Log.v("CLICK","vous avez bien cliqué sur case16");
            ImageView case16 = (ImageView) findViewById(R.id.case16);
            Drawable drawable =  case16.getDrawable();
            jouer(case16, "case1");
        }
        if(v.getId() == R.id.case21){
            Log.v("CLICK","vous avez bien cliqué sur case21");
            ImageView case21 = (ImageView) findViewById(R.id.case21);
            jouer(case21, "case2");
        }
        if(v.getId() == R.id.case22){
            Log.v("CLICK","vous avez bien cliqué sur case22");
            ImageView case22 = (ImageView) findViewById(R.id.case22);
            jouer(case22, "case2");
        }
        if(v.getId() == R.id.case23){
            Log.v("CLICK","vous avez bien cliqué sur case23");
            ImageView case23 = (ImageView) findViewById(R.id.case23);
            jouer(case23, "case2");
        }
        if(v.getId() == R.id.case24){
            Log.v("CLICK","vous avez bien cliqué sur case24");
            ImageView case24 = (ImageView) findViewById(R.id.case24);
            Drawable drawable =  case24.getDrawable();
            jouer(case24, "case2");
        }
        if(v.getId() == R.id.case25){
            Log.v("CLICK","vous avez bien cliqué sur case25");
            ImageView case25 = (ImageView) findViewById(R.id.case25);
            Drawable drawable =  case25.getDrawable();
            jouer(case25, "case2");
        }
        if(v.getId() == R.id.case26){
            Log.v("CLICK","vous avez bien cliqué sur case26");
            ImageView case26 = (ImageView) findViewById(R.id.case26);
            Drawable drawable =  case26.getDrawable();
            jouer(case26, "case2");
        }
        if(v.getId() == R.id.case31){
            Log.v("CLICK","vous avez bien cliqué sur case31");
            ImageView case31 = (ImageView) findViewById(R.id.case31);
            jouer(case31, "case3");
        }
        if(v.getId() == R.id.case32){
            Log.v("CLICK","vous avez bien cliqué sur case32");
            ImageView case32 = (ImageView) findViewById(R.id.case32);
            jouer(case32, "case3");
        }
        if(v.getId() == R.id.case33){
            Log.v("CLICK","vous avez bien cliqué sur case33");
            ImageView case33 = (ImageView) findViewById(R.id.case33);
            jouer(case33, "case3");
        }
        if(v.getId() == R.id.case34){
            Log.v("CLICK","vous avez bien cliqué sur case34");
            ImageView case34 = (ImageView) findViewById(R.id.case34);
            Drawable drawable =  case34.getDrawable();
            jouer(case34, "case3");
        }
        if(v.getId() == R.id.case35){
            Log.v("CLICK","vous avez bien cliqué sur case35");
            ImageView case35 = (ImageView) findViewById(R.id.case35);
            Drawable drawable =  case35.getDrawable();
            jouer(case35, "case3");
        }
        if(v.getId() == R.id.case36){
            Log.v("CLICK","vous avez bien cliqué sur case36");
            ImageView case36 = (ImageView) findViewById(R.id.case36);
            Drawable drawable =  case36.getDrawable();
            jouer(case36, "case3");
        }
        if(v.getId() == R.id.case41){
            Log.v("CLICK","vous avez bien cliqué sur case41");
            ImageView case41 = (ImageView) findViewById(R.id.case41);
            jouer(case41, "case4");
        }
        if(v.getId() == R.id.case42){
            Log.v("CLICK","vous avez bien cliqué sur case42");
            ImageView case42 = (ImageView) findViewById(R.id.case42);
            jouer(case42, "case4");
        }
        if(v.getId() == R.id.case43){
            Log.v("CLICK","vous avez bien cliqué sur case43");
            ImageView case43 = (ImageView) findViewById(R.id.case43);
            jouer(case43, "case4");
        }
        if(v.getId() == R.id.case44){
            Log.v("CLICK","vous avez bien cliqué sur case44");
            ImageView case44 = (ImageView) findViewById(R.id.case44);
            jouer(case44, "case4");
        }
        if(v.getId() == R.id.case45){
            Log.v("CLICK","vous avez bien cliqué sur case45");
            ImageView case45 = (ImageView) findViewById(R.id.case45);
            Drawable drawable =  case45.getDrawable();
            jouer(case45, "case4");
        }
        if(v.getId() == R.id.case46){
            Log.v("CLICK","vous avez bien cliqué sur case46");
            ImageView case46 = (ImageView) findViewById(R.id.case46);
            Drawable drawable =  case46.getDrawable();
            jouer(case46, "case4");
        }
        if(v.getId() == R.id.case51){
            Log.v("CLICK","vous avez bien cliqué sur case51");
            ImageView case51 = (ImageView) findViewById(R.id.case51);
            jouer(case51, "case5");
        }
        if(v.getId() == R.id.case52){
            Log.v("CLICK","vous avez bien cliqué sur case52");
            ImageView case52 = (ImageView) findViewById(R.id.case52);
            jouer(case52, "case5");
        }
        if(v.getId() == R.id.case53){
            Log.v("CLICK","vous avez bien cliqué sur case53");
            ImageView case53 = (ImageView) findViewById(R.id.case53);
            jouer(case53, "case5");
        }
        if(v.getId() == R.id.case54){
            Log.v("CLICK","vous avez bien cliqué sur case54");
            ImageView case54 = (ImageView) findViewById(R.id.case54);
            jouer(case54, "case5");
        }
        if(v.getId() == R.id.case55){
            Log.v("CLICK","vous avez bien cliqué sur case55");
            ImageView case55 = (ImageView) findViewById(R.id.case55);
            Drawable drawable =  case55.getDrawable();
            jouer(case55, "case5");
        }
        if(v.getId() == R.id.case56){
            Log.v("CLICK","vous avez bien cliqué sur case56");
            ImageView case56 = (ImageView) findViewById(R.id.case56);
            Drawable drawable =  case56.getDrawable();
            jouer(case56, "case5");
        }
        if(v.getId() == R.id.case61){
            Log.v("CLICK","vous avez bien cliqué sur case61");
            ImageView case61 = (ImageView) findViewById(R.id.case61);
            jouer(case61, "case6");
        }
        if(v.getId() == R.id.case62){
            Log.v("CLICK","vous avez bien cliqué sur case62");
            ImageView case62 = (ImageView) findViewById(R.id.case62);
            jouer(case62, "case6");
        }
        if(v.getId() == R.id.case63){
            Log.v("CLICK","vous avez bien cliqué sur case63");
            ImageView case63 = (ImageView) findViewById(R.id.case63);
            jouer(case63, "case6");
        }
        if(v.getId() == R.id.case64){
            Log.v("CLICK","vous avez bien cliqué sur case64");
            ImageView case64 = (ImageView) findViewById(R.id.case64);
            Drawable drawable =  case64.getDrawable();
            jouer(case64, "case6");
        }
        if(v.getId() == R.id.case65){
            Log.v("CLICK","vous avez bien cliqué sur case65");
            ImageView case65 = (ImageView) findViewById(R.id.case65);
            Drawable drawable =  case65.getDrawable();
            jouer(case65, "case6");
        }
        if(v.getId() == R.id.case66){
            Log.v("CLICK","vous avez bien cliqué sur case66");
            ImageView case66 = (ImageView) findViewById(R.id.case66);
            Drawable drawable =  case66.getDrawable();
            jouer(case66, "case6");
        }
        if(v.getId() == R.id.case71){
            Log.v("CLICK","vous avez bien cliqué sur case71");
            ImageView case71 = (ImageView) findViewById(R.id.case71);
            jouer(case71, "case7");
        }
        if(v.getId() == R.id.case72){
            Log.v("CLICK","vous avez bien cliqué sur case72");
            ImageView case72 = (ImageView) findViewById(R.id.case72);
            jouer(case72, "case7");
        }
        if(v.getId() == R.id.case73){
            Log.v("CLICK","vous avez bien cliqué sur case73");
            ImageView case73 = (ImageView) findViewById(R.id.case73);
            jouer(case73, "case7");
        }
        if(v.getId() == R.id.case74){
            Log.v("CLICK","vous avez bien cliqué sur case74");
            ImageView case74 = (ImageView) findViewById(R.id.case74);
            Drawable drawable =  case74.getDrawable();
            jouer(case74, "case7");
        }
        if(v.getId() == R.id.case75){
            Log.v("CLICK","vous avez bien cliqué sur case75");
            ImageView case75 = (ImageView) findViewById(R.id.case75);
            Drawable drawable =  case75.getDrawable();
            jouer(case75, "case7");
        }
        if(v.getId() == R.id.case76){
            Log.v("CLICK","vous avez bien cliqué sur case76");
            ImageView case76 = (ImageView) findViewById(R.id.case76);
            Drawable drawable =  case76.getDrawable();
            jouer(case76, "case7");
        }
        if(v.getId()==R.id.retour){
            Intent inte = new Intent(this, MainActivity.class);
            startActivity(inte);
        }
    }
}