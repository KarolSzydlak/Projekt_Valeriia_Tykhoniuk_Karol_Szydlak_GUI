package com.example.project_with_gui.Animal;

import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;

import java.util.Random;

public class Anteater extends Animal {
    public Anteater(int id, String name, int hp, int ms, int hunger, int strength, int x, int y,int attacks_performed){
        this.id=7;
        this.name="anteater";
        this.hp=2000;
        this.ms=1;
        this.hunger=100;
        this.strength=150;
        this.x=x;
        this.y=y;
        this.attacks_performed=attacks_performed;
    }
    public static void spawnAnteater(){
        Anteater anteater1= new Anteater(Anteater.id,"anteater",2000,1,100,150,0,0,0);
        Anteater anteater2= new Anteater(Anteater.id,"anteater",2000,1,100,150,9,9,0);
        Field.field.set(10*anteater1.y+anteater1.x,new Point(7,anteater1.x,anteater1.y));
        Field.field.set(10*anteater2.y+anteater2.x, new Point(7, anteater2.x, anteater2.y));
    }
    public static void anteater_move(Anteater anteater){
        Random random= new Random();
        int i;
        int j;
        Point point;
        do{
            i=random.nextInt(3)-1;
            j=random.nextInt(3)-1;
            while(((10*(anteater.y+j)+(anteater.x+i))<0||(10*(anteater.y+j)+(anteater.x+i))>99||anteater.x+i<0||anteater.x+i>9||anteater.y+j<0||anteater.y+j>9)){
                i=random.nextInt(3)-1;
                j=random.nextInt(3)-1;
            }
            point = Field.field.get((10*(anteater.y+j)+(anteater.x+i)));
        }
        while(point.id!=0);
        if(i!=0){
            anteater.distance_traveled_x= anteater.distance_traveled_x+i;
        }
        if(j!=0){
            anteater.distance_traveled_y= anteater.distance_traveled_y+j;
        }
        double distance= anteater.distance_traveled_x*anteater.distance_traveled_x+anteater.distance_traveled_y* anteater.distance_traveled_y;
        anteater.distance_traveled= anteater.distance_traveled+Math.sqrt(distance);
        Field.field.set(10*anteater.y+anteater.x,new Point(0,anteater.x,anteater.y));
        anteater.x= anteater.x+i;
        anteater.y=anteater.y+j;
        Field.field.set(10*anteater.y+anteater.x,new Point(7,anteater.x,anteater.y));
    }
    public static void die(Anteater anteater){
        if(anteater.hp<=0){
            Field.field.set(10*anteater.y+ anteater.x,new Point(0, anteater.x, anteater.y));
        }
    }
    public static void attack(Ant ant, Anteater anteater) {
        if(anteater.hp>0){
        Point point;
        point = Field.field.get(10 * ant.y + ant.x);
        int i, j;
        for (i = anteater.y - 1; i <= anteater.y + 1; i++) {
            for (j = anteater.x - 1; j <= anteater.x + 1; j++) {
                if (10 * j + i > 0 && 10 * j + i < 100) {
                    point = Field.field.get(10 * j + i);
                    if((point.id==2)&&(ant.x==i&&ant.y==j)){
                        ant.hp-=100;
                        anteater.attacks_performed++;
                    }
                }
            }
        }}
    }
}
