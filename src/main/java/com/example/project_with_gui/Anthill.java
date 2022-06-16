package com.example.project_with_gui;

public class Anthill {
    static int id=1;
    public int armor;
    public static int x;
    public static int y;
    public Anthill(int armor, int x,int y){
        this.armor=100;
        this.x=4;
        this.y=4;
    }
    public static void generateAnthill(){
    Anthill anthill= new Anthill(100,4,4);
    Field.field.set((Anthill.y)*10+x,new Point(1,4,4));
    System.out.println(String.valueOf((Anthill.y)*10+x));
      // Field.field.add(new Point(1,5,5));
    }
}
