package com.example.project_with_gui.Animal;

import com.example.project_with_gui.Anthill;
import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;
import com.example.project_with_gui.Resource.Leaf;
import com.example.project_with_gui.Resource.Stick;
import com.example.project_with_gui.Resource.Stone;

import java.util.Random;
import java.lang.Math;

public class Ant extends Animal{
    public Ant(int id, String name, int hp, int ms, int hunger, int strength, int x, int y,int distance_traveled_x, int distance_traveled_y, double distance_traveled, int items_carried, int attackc_performed){
        this.id=2;
        this.name="ant";
        this.hp=1000;
        this.ms=0;
        this.hunger=100;
        this.strength=100;
        this.x=x;
        this.y=y;
        this.distance_traveled_x=distance_traveled_x;
        this.distance_traveled_y=distance_traveled_y;
        this.distance_traveled=distance_traveled;
        this.items_carried=items_carried;
        this.attacks_performed=attackc_performed;


    }
    public static void spawn(){
        Ant ant1= new Ant(2,"ant",1000,0,100,100, 3,4,0,0,0,0,0);
        Field.field.set(10* ant1.y+ant1.x,new Point(ant1.id,ant1.x, ant1.y));
        Ant ant2= new Ant(2,"ant",1000,0,100,100, 4,5,0,0,0,0,0);
        Field.field.set(10* ant2.y+ant2.x,new Point(ant2.id,ant2.x, ant2.y));
        Ant ant3= new Ant(2,"ant",1000,0,100,100, 4,3,0,0,0,0,0);
        Field.field.set(10* ant3.y+ant3.x,new Point(ant3.id,ant3.x, ant3.y));
        Ant ant4= new Ant(2,"ant",1000,0,100,100, 5,4,0,0,0,0,0);
        Field.field.set(10* ant4.y+ant4.x,new Point(ant4.id,ant4.x, ant4.y));
    }
    public static void antmove(Ant ant){
        if(ant.hp>0) {
            Random random = new Random();
            int i;
            int j;
            Point point;
            do {
                i = random.nextInt(3) - 1;
                j = random.nextInt(3) - 1;
                while (((10 * (ant.y + j) + (ant.x + i)) < 0 || (10 * (ant.y + j) + (ant.x + i)) > 99 || ant.x + i < 0 || ant.x + i > 9 || ant.y + j < 0 || ant.y + j > 9)) {
                    i = random.nextInt(3) - 1;
                    j = random.nextInt(3) - 1;
                }
                point = Field.field.get((10 * (ant.y + j) + (ant.x + i)));
            }
            while (point.id != 0);
            if (i != 0) {
                ant.distance_traveled_x = ant.distance_traveled_x + i;
            }
            if (j != 0) {
                ant.distance_traveled_y = ant.distance_traveled_y + j;
            }
            double distance = ant.distance_traveled_x * ant.distance_traveled_x + ant.distance_traveled_y * ant.distance_traveled_y;
            ant.distance_traveled = ant.distance_traveled + Math.sqrt(distance);
            Field.field.set(10 * ant.y + ant.x, new Point(0, ant.x, ant.y));
            ant.x = ant.x + i;
            ant.y = ant.y + j;
            Field.field.set(10 * ant.y + ant.x, new Point(ant.id, ant.x, ant.y));
        }
    }
    public static void pickUp(Ant ant){
        if(ant.hp>0) {
            Point point;
            point = Field.field.get(10 * ant.y + ant.x);
            int i, j;
            for (i = ant.x - 1; i <= ant.x + 1; i++) {
                for (j = ant.y - 1; j <= ant.y + 1; j++) {
                    if (10 * j + i > 0 && 10 * j + i < 100) {
                        point = Field.field.get(10 * j + i);
                        if (point.id == 3) {
                            ant.ms += Stone.armor;
                            Field.field.set(10 * j + i, new Point(0, i, j));
                        }
                        if (point.id == 4) {
                            ant.ms += Stick.armor;
                            Field.field.set(10 * j + i, new Point(0, i, j));
                        }
                        if (point.id == 5) {
                            ant.ms += Leaf.armor;
                            Field.field.set(10 * j + i, new Point(0, i, j));
                        }
                        if (point.id == 6) {
                            ant.hunger += 200;
                            Field.field.set(10 * j + i, new Point(0, i, j));
                        }
                    }
                }
            }
        }
    }
    public static void carry(Ant ant, Anthill anthill){
        if(ant.hp>0) {
            int i, j;
            Point point;
            if (ant.ms != 0) {
                if (anthill.x > ant.x + 1) {
                    Field.field.set(10 * ant.y + ant.x, new Point(0, ant.x, ant.y));
                    ant.x += 1;
                    Field.field.set(10 * ant.y + ant.x, new Point(ant.id, ant.x, ant.y));
                }
                if (anthill.x < ant.x - 1) {
                    Field.field.set(10 * ant.y + ant.x, new Point(0, ant.x, ant.y));
                    ant.x += -1;
                    Field.field.set(10 * ant.y + ant.x, new Point(ant.id, ant.x, ant.y));
                }
                if (anthill.y > ant.y + 1) {
                    Field.field.set(10 * ant.y + ant.x, new Point(0, ant.x, ant.y));
                    ant.y += 1;
                    Field.field.set(10 * ant.y + ant.x, new Point(ant.id, ant.x, ant.y));
                }
                if (anthill.y < ant.y - 1) {
                    Field.field.set(10 * ant.y + ant.x, new Point(0, ant.x, ant.y));
                    ant.y += -1;
                    Field.field.set(10 * ant.y + ant.x, new Point(ant.id, ant.x, ant.y));
                }
                for (i = ant.y - 1; i <= ant.y + 1; i++) {
                    for (j = ant.x - 1; j <= ant.x + 1; j++) {
                        if (10 * j + i > 0 && 10 * j + i < 100) {
                            point = Field.field.get(10 * j + i);
                            if (point.id == 1) {
                                anthill.armor += ant.ms;
                                ant.ms = 0;
                                ant.items_carried++;
                            }
                        }
                    }
                }
            }
        }
    }
    public static void attack(Ant ant, Anteater anteater) {
        if (ant.hp > 0) {
            Point point;
            point = Field.field.get(10 * ant.y + ant.x);
            int i, j;
            for (i = ant.y - 1; i <= ant.y + 1; i++) {
                for (j = ant.x - 1; j <= ant.x + 1; j++) {
                    if (10 * j + i > 0 && 10 * j + i < 100) {
                        point = Field.field.get(10 * j + i);
                        if ((point.id == 7) && (anteater.x == i && anteater.y == j)) {
                            anteater.hp -= 100;
                            ant.attacks_performed++;
                        }
                    }
                }
            }
        }
    }
    public static void die(Ant ant){
        if(ant.hp<=0){
            Field.field.set(ant.y*10+ant.x, new Point(0,ant.x,ant.y));
        }
    }
    public static void getHungry(Ant ant){
        ant.hunger-=1;
        if(ant.hunger==0)ant.hp=0;
    }

    /*
    @Override
    public static void spawn() {
       Ant ant= new Ant(2,"ant",100,3,100,100, 6,4,46);
       Field.field.set(10* ant.y+ant.x,new Point(ant.id,ant.x, ant.y));

    }

    @Override
    public void attack() {

    }

    @Override
    public void getDamage() {
        hp=hp-Anteater.strength/10;

    }

    @Override
    public void move() {

    }

    @Override
    public void see() {

    }

    @Override
    public void die() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void pickUp() {

    }

    @Override
    public void eat() {

    }*/

}
