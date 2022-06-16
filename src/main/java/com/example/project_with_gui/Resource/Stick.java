package com.example.project_with_gui.Resource;

import java.util.Random;
import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;

public class Stick extends Resource{
    static int id=4;
    public static int armor=75;
    public int weight=75;
    public Stick(int id,int armor, int weight){
        this.id=id;
        this.armor=75;
        this.weight=75;
    }
    public static void spawnStick(){
        Stick stick= new Stick(4,75,75);
        Random random= new Random();
        int pozycja;
        int i;
        int j;
        int u;
        int k;
        u= random.nextInt(2)+4;
        Point point;
        for(k=0;k<u;k++){
            do{
                i=random.nextInt(9);
                j=random.nextInt(9);
                pozycja=10*j+i;
                point = Field.field.get(pozycja);
            }
            while(point.id!=0);
            Field.field.set(pozycja, new Point(Stick.id,i,j));

    }
}
}
