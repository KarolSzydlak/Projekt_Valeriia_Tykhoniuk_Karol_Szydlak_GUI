package com.example.project_with_gui.Resource;

import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;

import java.util.Random;

public class Stone extends Resource{
    static int id=3;
    public static int armor=100;
    int weigth=100;
    public Stone(int id,int armor, int weigth){
        this.id=id;
        this.armor=armor;
        this.weigth=weigth;
    }
    public static void spawnStone(){
        Stone stone= new Stone(3,100,100);
        Random random= new Random();
        int pozycja;
        int i;
        int j;
        int u;
        u= random.nextInt(2)+4;
        Point point;
        for(int k=0;k<u;k++){
            do{
                i=random.nextInt(9);
                j=random.nextInt(9);
                pozycja=10*j+i;
                point = Field.field.get(pozycja);
            }
            while(point.id!=0);
            Field.field.set(pozycja, new Point(Stone.id,i,j));
        }
        /*Field.field.set(0,new Point(stone1.id,0,0));
        Field.field.set(9,new Point(stone2.id,0,9));
        Field.field.set(90,new Point(stone3.id,9,0));
        Field.field.set(99,new Point(stone4.id,9,9));*/

    }
}

