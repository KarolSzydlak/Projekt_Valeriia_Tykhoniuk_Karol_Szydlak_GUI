package com.example.project_with_gui;

public class Point implements IPoint{
    public int id;
    int x;
    int y;
    public Point(int id, int x, int y){
        this.id=id;
        this.x=x;
        this.y=y;
    }

    @Override
    public void changeid() {
    }
}
