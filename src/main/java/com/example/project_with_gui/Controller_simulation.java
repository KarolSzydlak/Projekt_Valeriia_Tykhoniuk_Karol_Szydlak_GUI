package com.example.project_with_gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import com.example.project_with_gui.Animal.Ant;
import com.example.project_with_gui.Animal.Anteater;
import com.example.project_with_gui.Resource.Food;
import com.example.project_with_gui.Resource.Leaf;
import com.example.project_with_gui.Resource.Stick;
import com.example.project_with_gui.Resource.Stone;

public class Controller_simulation {

    @FXML
    private ResourceBundle resources;


    @FXML
    private AnchorPane BAZA;

    @FXML
    private URL location;

    @FXML
    private Button Nastepny;

    @FXML
    private Button Nowyraz;

    @FXML
    private Label x0y0;

    @FXML
    private Label x0y1;

    @FXML
    private Label x0y2;

    @FXML
    private Label x0y3;

    @FXML
    private Label x0y4;

    @FXML
    private Label x0y5;

    @FXML
    private Label x0y6;

    @FXML
    private Label x0y7;

    @FXML
    private Label x0y8;

    @FXML
    private Label x0y9;

    @FXML
    private Label x1y0;

    @FXML
    private Label x1y1;

    @FXML
    private Label x1y2;

    @FXML
    private Label x1y3;

    @FXML
    private Label x1y4;

    @FXML
    private Label x1y5;

    @FXML
    private Label x1y6;

    @FXML
    private Label x1y7;

    @FXML
    private Label x1y8;

    @FXML
    private Label x1y9;

    @FXML
    private Label x2y0;

    @FXML
    private Label x2y1;

    @FXML
    private Label x2y2;

    @FXML
    private Label x2y3;

    @FXML
    private Label x2y4;

    @FXML
    private Label x2y5;

    @FXML
    private Label x2y6;

    @FXML
    private Label x2y7;

    @FXML
    private Label x2y8;

    @FXML
    private Label x2y9;

    @FXML
    private Label x3y0;

    @FXML
    private Label x3y1;

    @FXML
    private Label x3y2;

    @FXML
    private Label x3y3;

    @FXML
    private Label x3y4;

    @FXML
    private Label x3y5;

    @FXML
    private Label x3y6;

    @FXML
    private Label x3y7;

    @FXML
    private Label x3y8;

    @FXML
    private Label x3y9;

    @FXML
    private Label x4y0;

    @FXML
    private Label x4y1;

    @FXML
    private Label x4y2;

    @FXML
    private Label x4y3;

    @FXML
    private Label x4y4;

    @FXML
    private Label x4y5;

    @FXML
    private Label x4y6;

    @FXML
    private Label x4y7;

    @FXML
    private Label x4y8;

    @FXML
    private Label x4y9;

    @FXML
    private Label x5y0;

    @FXML
    private Label x5y1;

    @FXML
    private Label x5y2;

    @FXML
    private Label x5y3;

    @FXML
    private Label x5y4;

    @FXML
    private Label x5y5;

    @FXML
    private Label x5y6;

    @FXML
    private Label x5y7;

    @FXML
    private Label x5y8;

    @FXML
    private Label x5y9;

    @FXML
    private Label x6y0;

    @FXML
    private Label x6y1;

    @FXML
    private Label x6y2;

    @FXML
    private Label x6y3;

    @FXML
    private Label x6y4;

    @FXML
    private Label x6y5;

    @FXML
    private Label x6y6;

    @FXML
    private Label x6y7;

    @FXML
    private Label x6y8;

    @FXML
    private Label x6y9;

    @FXML
    private Label x7y0;

    @FXML
    private Label x7y1;

    @FXML
    private Label x7y2;

    @FXML
    private Label x7y3;

    @FXML
    private Label x7y4;

    @FXML
    private Label x7y5;

    @FXML
    private Label x7y6;

    @FXML
    private Label x7y7;

    @FXML
    private Label x7y8;

    @FXML
    private Label x7y9;

    @FXML
    private Label x8y0;

    @FXML
    private Label x8y1;

    @FXML
    private Label x8y2;

    @FXML
    private Label x8y3;

    @FXML
    private Label x8y4;

    @FXML
    private Label x8y5;

    @FXML
    private Label x8y6;

    @FXML
    private Label x8y7;

    @FXML
    private Label x8y8;

    @FXML
    private Label x8y9;

    @FXML
    private Label x9y0;

    @FXML
    private Label x9y1;

    @FXML
    private Label x9y2;

    @FXML
    private Label x9y3;

    @FXML
    private Label x9y4;

    @FXML
    private Label x9y5;

    @FXML
    private Label x9y6;

    @FXML
    private Label x9y7;

    @FXML
    private Label x9y8;

    @FXML
    private Label x9y9;

    public String check(int liczba, String literka){
        if (liczba==0) {
            literka = ".";
        }
        if (liczba==1) {
            literka = "#";
        }
        if (liczba==2) {
            literka = "a";
        }
        if (liczba==3) {
            literka = "s";
        }
        if (liczba==4) {
            literka = "p";
        }
        if (liczba==5) {
            literka = "l";
        }
        if (liczba==6) {
            literka = "f";
        }
        if (liczba==7) {
            literka = "A";
        }
        return literka;
    }

    @FXML
    void initialize() {
        Nowyraz.setOnAction(event -> {
            AtomicInteger i = new AtomicInteger();
            AtomicInteger j = new AtomicInteger();
            Field.generateField();
            Anthill.generateAnthill();
            Anthill anthill = new Anthill(100, 4, 4);
            Ant.spawn();
            Anteater.spawnAnteater();
            Stone.spawnStone();
            Stick.spawnStick();
            Leaf.spawnLeaf();
            Food.spawnFood();
            Anteater anteater1 = new Anteater(Anteater.id, "anteater", 2000, 1, 100, 150, 0, 0, 0);
            Anteater anteater2 = new Anteater(Anteater.id, "anteater", 2000, 1, 100, 150, 9, 9, 0);
            Ant ant1 = new Ant(2, "ant", 1000, 0, 100, 100, 3, 4, 0, 0, 0, 0, 0);
            Ant ant2 = new Ant(2, "ant", 1000, 0, 100, 100, 4, 5, 0, 0, 0, 0, 0);
            Ant ant3 = new Ant(2, "ant", 1000, 0, 100, 100, 4, 3, 0, 0, 0, 0, 0);
            Ant ant4 = new Ant(2, "ant", 1000, 0, 100, 100, 5, 4, 0, 0, 0, 0, 0);
            //Anteater anteater1= new Anteater(Anteater.id,"anteater",200,1,100,150,0,0);
            //Anteater anteater2= new Anteater(Anteater.id,"anteater",200,1,100,150,9,9);
            System.out.println("Stage " + j);
            j.getAndIncrement();
            String literka = "-";
            for (Point k : Field.field) {
                if (i.get() == 0) { x0y9.setText(check(k.id, literka));}
                if (i.get() == 1) { x1y9.setText(check(k.id, literka));}
                if (i.get() == 2) { x2y9.setText(check(k.id, literka));}
                if (i.get() == 3) {x3y9.setText(check(k.id, literka));}
                if (i.get() == 4) {x4y9.setText(check(k.id, literka));}
                if (i.get() == 5) {x5y9.setText(check(k.id, literka));}
                if (i.get() == 6) { x6y9.setText(check(k.id, literka));}
                if (i.get() == 7) {
                    x7y9.setText(check(k.id, literka));
                }
                if (i.get() == 8) {
                    x8y9.setText(check(k.id, literka));
                }
                if (i.get() == 9) {
                    x9y9.setText(check(k.id, literka));
                }
                if (i.get() == 10) {
                    x0y8.setText(check(k.id, literka));
                }
                if (i.get() == 11) {
                    x1y8.setText(check(k.id, literka));
                }
                if (i.get() == 12) {
                    x2y8.setText(check(k.id, literka));
                }
                if (i.get() == 13) {
                    x3y8.setText(check(k.id, literka));
                }
                if (i.get() == 14) {
                    x4y8.setText(check(k.id, literka));
                }
                if (i.get() == 15) {
                    x5y8.setText(check(k.id, literka));
                }
                if (i.get() == 16) {
                    x6y8.setText(check(k.id, literka));
                }
                if (i.get() == 17) {
                    x7y8.setText(check(k.id, literka));
                }
                if (i.get() == 18) {
                    x8y8.setText(check(k.id, literka));
                }
                if (i.get() == 19) {
                    x9y8.setText(check(k.id, literka));
                }
                if (i.get() == 20) {
                    x0y7.setText(check(k.id, literka));
                }
                if (i.get() == 21) {
                    x1y7.setText(check(k.id, literka));
                }
                if (i.get() == 22) {
                    x2y7.setText(check(k.id, literka));
                }
                if (i.get() == 23) {
                    x3y7.setText(check(k.id, literka));
                }
                if (i.get() == 24) {
                    x4y7.setText(check(k.id, literka));
                }
                if (i.get() == 25) {
                    x5y7.setText(check(k.id, literka));
                }
                if (i.get() == 26) {
                    x6y7.setText(check(k.id, literka));
                }
                if (i.get() == 27) {
                    x7y7.setText(check(k.id, literka));
                }
                if (i.get() == 28) {
                    x8y7.setText(check(k.id, literka));
                }
                if (i.get() == 29) {
                    x9y7.setText(check(k.id, literka));
                }
                if (i.get() == 30) {
                    x0y6.setText(check(k.id, literka));
                }
                if (i.get() == 31) {
                    x1y6.setText(check(k.id, literka));
                }
                if (i.get() == 32) {
                    x2y6.setText(check(k.id, literka));
                }
                if (i.get() == 33) {
                    x3y6.setText(check(k.id, literka));
                }
                if (i.get() == 34) {
                    x4y6.setText(check(k.id, literka));
                }
                if (i.get() == 35) {
                    x5y6.setText(check(k.id, literka));
                }
                if (i.get() == 36) {
                    x6y6.setText(check(k.id, literka));
                }
                if (i.get() == 37) {
                    x7y6.setText(check(k.id, literka));
                }
                if (i.get() == 38) {
                    x8y6.setText(check(k.id, literka));
                }
                if (i.get() == 39) {
                    x9y6.setText(check(k.id, literka));
                }
                if (i.get() == 40) {
                    x0y5.setText(check(k.id, literka));
                }
                if (i.get() == 41) {
                    x1y5.setText(check(k.id, literka));
                }
                if (i.get() == 42) {
                    x2y5.setText(check(k.id, literka));
                }
                if (i.get() == 43) {
                    x3y5.setText(check(k.id, literka));
                }
                if (i.get() == 44) {
                    x4y5.setText(check(k.id, literka));
                }
                if (i.get() == 45) {
                    x5y5.setText(check(k.id, literka));
                }
                if (i.get() == 46) {
                    x6y5.setText(check(k.id, literka));
                }
                if (i.get() == 47) {
                    x7y5.setText(check(k.id, literka));
                }
                if (i.get() == 48) {
                    x8y5.setText(check(k.id, literka));
                }
                if (i.get() == 49) {
                    x9y5.setText(check(k.id, literka));
                }
                if (i.get() == 50) {
                    x0y4.setText(check(k.id, literka));
                }
                if (i.get() == 51) {
                    x1y4.setText(check(k.id, literka));
                }
                if (i.get() == 52) {
                    x2y4.setText(check(k.id, literka));
                }
                if (i.get() == 53) {
                    x3y4.setText(check(k.id, literka));
                }
                if (i.get() == 54) {
                    x4y4.setText(check(k.id, literka));
                }
                if (i.get() == 55) {
                    x5y4.setText(check(k.id, literka));
                }
                if (i.get() == 56) {
                    x6y4.setText(check(k.id, literka));
                }
                if (i.get() == 57) {
                    x7y4.setText(check(k.id, literka));
                }
                if (i.get() == 58) {
                    x8y4.setText(check(k.id, literka));
                }
                if (i.get() == 59) {
                    x9y4.setText(check(k.id, literka));
                }
                if (i.get() == 60) {
                    x0y3.setText(check(k.id, literka));
                }
                if (i.get() == 61) {
                    x1y3.setText(check(k.id, literka));
                }
                if (i.get() == 62) {
                    x2y3.setText(check(k.id, literka));
                }
                if (i.get() == 63) {
                    x3y3.setText(check(k.id, literka));
                }
                if (i.get() == 64) {
                    x4y3.setText(check(k.id, literka));
                }
                if (i.get() == 65) {
                    x5y3.setText(check(k.id, literka));
                }
                if (i.get() == 66) {
                    x6y3.setText(check(k.id, literka));
                }
                if (i.get() == 67) {
                    x7y3.setText(check(k.id, literka));
                }
                if (i.get() == 68) {
                    x8y3.setText(check(k.id, literka));
                }
                if (i.get() == 69) {
                    x9y3.setText(check(k.id, literka));
                }
                if (i.get() == 70) {
                    x0y2.setText(check(k.id, literka));
                }
                if (i.get() == 71) {
                    x1y2.setText(check(k.id, literka));
                }
                if (i.get() == 72) {
                    x2y2.setText(check(k.id, literka));
                }
                if (i.get() == 73) {
                    x3y2.setText(check(k.id, literka));
                }
                if (i.get() == 74) {
                    x4y2.setText(check(k.id, literka));
                }
                if (i.get() == 75) {
                    x5y2.setText(check(k.id, literka));
                }
                if (i.get() == 76) {
                    x6y2.setText(check(k.id, literka));
                }
                if (i.get() == 77) {
                    x7y2.setText(check(k.id, literka));
                }
                if (i.get() == 78) {
                    x8y2.setText(check(k.id, literka));
                }
                if (i.get() == 79) {
                    x9y2.setText(check(k.id, literka));
                }
                if (i.get() == 80) {
                    x0y1.setText(check(k.id, literka));
                }
                if (i.get() == 81) {
                    x1y1.setText(check(k.id, literka));
                }
                if (i.get() == 82) {
                    x2y1.setText(check(k.id, literka));
                }
                if (i.get() == 83) {
                    x3y1.setText(check(k.id, literka));
                }
                if (i.get() == 84) {
                    x4y1.setText(check(k.id, literka));
                }
                if (i.get() == 85) {
                    x5y1.setText(check(k.id, literka));
                }
                if (i.get() == 86) {
                    x6y1.setText(check(k.id, literka));
                }
                if (i.get() == 87) {
                    x7y1.setText(check(k.id, literka));
                }
                if (i.get() == 88) {
                    x8y1.setText(check(k.id, literka));
                }
                if (i.get() == 89) {
                    x9y1.setText(check(k.id, literka));
                }
                if (i.get() == 90) {
                    x0y0.setText(check(k.id, literka));
                }
                if (i.get() == 91) {
                    x1y0.setText(check(k.id, literka));
                }
                if (i.get() == 92) {
                    x2y0.setText(check(k.id, literka));
                }
                if (i.get() == 93) {
                    x3y0.setText(check(k.id, literka));
                }
                if (i.get() == 94) {
                    x4y0.setText(check(k.id, literka));
                }
                if (i.get() == 95) {
                    x5y0.setText(check(k.id, literka));
                }
                if (i.get() == 96) {
                    x6y0.setText(check(k.id, literka));
                }
                if (i.get() == 97) {
                    x7y0.setText(check(k.id, literka));
                }
                if (i.get() == 98) {
                    x8y0.setText(check(k.id, literka));
                }
                if (i.get() == 99) {
                    x9y0.setText(check(k.id, literka));
                }

                if (i.get() == 10 || i.get() == 20 || i.get() == 30 || i.get() == 40 || i.get() == 50 || i.get() == 60 || i.get() == 70 || i.get() == 80 || i.get() == 90 || i.get() == 100)
                    System.out.println();
                if (k.id == 0) {
                    System.out.printf(".   ");
                    i.getAndIncrement();
                }
                if (k.id == 1) {
                    System.out.printf("#   ");
                    i.getAndIncrement();
                }
                if (k.id == 2) {
                    System.out.printf("a   ");
                    i.getAndIncrement();
                }
                if (k.id == 3) {
                    System.out.printf("s   ");
                    i.getAndIncrement();
                }
                if (k.id == 4) {
                    System.out.printf("p   ");
                    i.getAndIncrement();
                }
                if (k.id == 5) {
                    System.out.printf("l   ");
                    i.getAndIncrement();
                }
                if (k.id == 6) {
                    System.out.printf("f   ");
                    i.getAndIncrement();
                }
                if (k.id == 7) {
                    System.out.printf("A   ");
                    i.getAndIncrement();
                }

            }

            System.out.println();
            System.out.println();
            System.out.println();

            i.set(0);


            Nastepny.setOnAction(event2 -> {


                //głód
                Ant.getHungry(ant1);
                Ant.getHungry(ant2);
                Ant.getHungry(ant3);
                Ant.getHungry(ant4);
                //Ataki
                Ant.attack(ant1, anteater1);
                Ant.attack(ant2, anteater1);
                Ant.attack(ant3, anteater1);
                Ant.attack(ant4, anteater1);
                Ant.attack(ant1, anteater2);
                Ant.attack(ant2, anteater2);
                Ant.attack(ant3, anteater2);
                Ant.attack(ant4, anteater2);
                Anteater.attack(ant1, anteater1);
                Anteater.attack(ant2, anteater1);
                Anteater.attack(ant3, anteater1);
                Anteater.attack(ant4, anteater1);
                Anteater.attack(ant1, anteater2);
                Anteater.attack(ant2, anteater2);
                Anteater.attack(ant3, anteater2);
                Anteater.attack(ant4, anteater2);
                Anteater.die(anteater1);
                Anteater.die(anteater2);
                Ant.die(ant1);
                Ant.die(ant2);
                Ant.die(ant3);
                Ant.die(ant4);
                Ant.pickUp(ant1);
                Ant.pickUp(ant2);
                Ant.pickUp(ant3);
                Ant.pickUp(ant4);
                //zanoszenie
                Ant.carry(ant1, anthill);
                Ant.carry(ant2, anthill);
                Ant.carry(ant3, anthill);
                Ant.carry(ant4, anthill);
                //Ruch
                if (ant1.ms == 0) Ant.antmove(ant1);
                if (ant2.ms == 0) Ant.antmove(ant2);
                if (ant3.ms == 0) Ant.antmove(ant3);
                if (ant4.ms == 0) Ant.antmove(ant4);
                Anteater.anteater_move(anteater1);
                Anteater.anteater_move(anteater2);
                System.out.println("Stage " + j);
                j.getAndIncrement();

                for (Point k : Field.field) {
                    if (i.get() == 0) { x0y9.setText(check(k.id, literka));  }
                    if (i.get() == 1) { x1y9.setText(check(k.id, literka));}
                    if (i.get() == 2) { x2y9.setText(check(k.id, literka));}
                    if (i.get() == 3) {x3y9.setText(check(k.id, literka));}
                    if (i.get() == 4) {x4y9.setText(check(k.id, literka));}
                    if (i.get() == 5) {x5y9.setText(check(k.id, literka));}
                    if (i.get() == 6) { x6y9.setText(check(k.id, literka));}
                    if (i.get() == 7) {
                        x7y9.setText(check(k.id, literka));
                    }
                    if (i.get() == 8) {
                        x8y9.setText(check(k.id, literka));
                    }
                    if (i.get() == 9) {
                        x9y9.setText(check(k.id, literka));
                    }
                    if (i.get() == 10) {
                        x0y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 11) {
                        x1y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 12) {
                        x2y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 13) {
                        x3y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 14) {
                        x4y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 15) {
                        x5y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 16) {
                        x6y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 17) {
                        x7y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 18) {
                        x8y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 19) {
                        x9y8.setText(check(k.id, literka));
                    }
                    if (i.get() == 20) {
                        x0y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 21) {
                        x1y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 22) {
                        x2y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 23) {
                        x3y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 24) {
                        x4y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 25) {
                        x5y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 26) {
                        x6y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 27) {
                        x7y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 28) {
                        x8y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 29) {
                        x9y7.setText(check(k.id, literka));
                    }
                    if (i.get() == 30) {
                        x0y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 31) {
                        x1y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 32) {
                        x2y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 33) {
                        x3y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 34) {
                        x4y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 35) {
                        x5y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 36) {
                        x6y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 37) {
                        x7y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 38) {
                        x8y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 39) {
                        x9y6.setText(check(k.id, literka));
                    }
                    if (i.get() == 40) {
                        x0y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 41) {
                        x1y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 42) {
                        x2y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 43) {
                        x3y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 44) {
                        x4y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 45) {
                        x5y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 46) {
                        x6y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 47) {
                        x7y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 48) {
                        x8y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 49) {
                        x9y5.setText(check(k.id, literka));
                    }
                    if (i.get() == 50) {
                        x0y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 51) {
                        x1y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 52) {
                        x2y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 53) {
                        x3y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 54) {
                        x4y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 55) {
                        x5y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 56) {
                        x6y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 57) {
                        x7y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 58) {
                        x8y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 59) {
                        x9y4.setText(check(k.id, literka));
                    }
                    if (i.get() == 60) {
                        x0y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 61) {
                        x1y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 62) {
                        x2y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 63) {
                        x3y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 64) {
                        x4y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 65) {
                        x5y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 66) {
                        x6y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 67) {
                        x7y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 68) {
                        x8y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 69) {
                        x9y3.setText(check(k.id, literka));
                    }
                    if (i.get() == 70) {
                        x0y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 71) {
                        x1y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 72) {
                        x2y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 73) {
                        x3y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 74) {
                        x4y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 75) {
                        x5y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 76) {
                        x6y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 77) {
                        x7y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 78) {
                        x8y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 79) {
                        x9y2.setText(check(k.id, literka));
                    }
                    if (i.get() == 80) {
                        x0y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 81) {
                        x1y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 82) {
                        x2y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 83) {
                        x3y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 84) {
                        x4y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 85) {
                        x5y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 86) {
                        x6y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 87) {
                        x7y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 88) {
                        x8y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 89) {
                        x9y1.setText(check(k.id, literka));
                    }
                    if (i.get() == 90) {
                        x0y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 91) {
                        x1y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 92) {
                        x2y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 93) {
                        x3y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 94) {
                        x4y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 95) {
                        x5y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 96) {
                        x6y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 97) {
                        x7y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 98) {
                        x8y0.setText(check(k.id, literka));
                    }
                    if (i.get() == 99) {
                        x9y0.setText(check(k.id, literka));
                    }



                    if (i.get() == 10 || i.get() == 20 || i.get() == 30 || i.get() == 40 || i.get() == 50 || i.get() == 60 || i.get() == 70 || i.get() == 80 || i.get() == 90 || i.get() == 100)
                        System.out.println();
                    if (k.id == 0) {
                        System.out.printf(".   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 1) {
                        System.out.printf("#   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 2) {
                        System.out.printf("a   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 3) {
                        System.out.printf("s   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 4) {
                        System.out.printf("p   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 5) {
                        System.out.printf("l   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 6) {
                        System.out.printf("f   ");
                        i.getAndIncrement();
                    }
                    if (k.id == 7) {
                        System.out.printf("A   ");
                        i.getAndIncrement();
                    }




                }

                i.set(0);
                System.out.println();
                System.out.println();
                System.out.println();

                if (ant1.hp == 0 && ant2.hp == 0 && ant3.hp == 0 && ant4.hp == 0) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Mrówki pokonane-> Mrówkojady wygrywają");
                    System.out.println("Ilość zgromadzonych przez mrówki zasobów ma wartość: " + anthill.armor);

                    FXMLLoader fxmlLoader3 = new FXMLLoader(Menu.class.getResource("wynik1.fxml"));
                    Scene scene = null;
                    try {
                        scene = new Scene(fxmlLoader3.load(), 700, 400);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Life of ants");
                    stage.setScene(scene);
                    stage.show();
                }
                if (anteater1.hp == 0 && anteater2.hp == 0) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Mrówkojady pokonane-> Mrówki wygrywają");
                    System.out.println("Ilość zgromadzonych przez mrówki zasobów ma wartość: " + anthill.armor);
                    FXMLLoader fxmlLoader3 = new FXMLLoader(Menu.class.getResource("wynik3.fxml"));
                    Scene scene = null;
                    try {
                        scene = new Scene(fxmlLoader3.load(), 700, 400);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Life of ants");
                    stage.setScene(scene);
                    stage.show();

                }
                if (anthill.armor >= 1000) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Zgromadzono wystarczającą ilość surowców-> Mrówki wygrywają");
                    System.out.println("Ilość zgromadzonych przez mrówki zasobów ma wartość: " + anthill.armor);
                    FXMLLoader fxmlLoader3 = new FXMLLoader(Menu.class.getResource("wynik2.fxml"));
                    Scene scene = null;
                    try {
                        scene = new Scene(fxmlLoader3.load(), 700, 400);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Life of ants");
                    stage.setScene(scene);
                    stage.show();
                }



            });
        });
    }}

