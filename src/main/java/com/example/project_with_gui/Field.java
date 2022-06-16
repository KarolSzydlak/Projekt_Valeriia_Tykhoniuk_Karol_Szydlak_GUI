package com.example.project_with_gui;

import java.util.ArrayList;

public class Field {
  static int id;
  static int a=0;
  static int b=0;
  public static ArrayList<Point> field = new ArrayList<>();
  public static ArrayList<Point> generateField(){
    while(b<10){
      if(a==10){
        b++;
        a=0;
      }
      if(b==10)break;
      field.add(new Point(id,a,b));
      a++;
    }
    return field;
  }
  /*public static void main(String[] args){
    int i=0;
    generateField();
    Anthill.generateAnthill();
    Ant.spawn();
    Stone.spawnStone();
    Stick.spawnStick();
    Leaf.spawnLeaf();
    Food.spawnFood();
    Ant ant1= new Ant(2,"ant",100,3,100,100, 3,4);
    Ant ant2= new Ant(2,"ant",100,3,100,100, 4,5);
    Ant ant3= new Ant(2,"ant",100,3,100,100, 4,3);
    Ant ant4= new Ant(2,"ant",100,3,100,100, 5,4);
    for(int l=0;l<200;l++) {

      Ant.antmove(ant1);
      Ant.antmove(ant2);
      Ant.antmove(ant3);
      Ant.antmove(ant4);
    }
    System.out.println(field.size());

    for(Point k: field){
      if(i==10||i==20||i==30||i==40||i==50||i==60||i==70||i==80||i==90||i==100)System.out.println();
      if(k.id==0){
        System.out.printf(".   ");
        i++;
      }
      if(k.id==1){
        System.out.printf("#   ");
        i++;
      }
      if(k.id==2){
        System.out.printf("a   ");
        i++;
      }
      if(k.id==3){
        System.out.printf("s   ");
        i++;
      }
      if(k.id==4){
        System.out.printf("p   ");
        i++;
      }
      if(k.id==5){
        System.out.printf("l   ");
        i++;
      }
      if(k.id==6){
        System.out.printf("f   ");
        i++;
      }
    }


  }*/

}
