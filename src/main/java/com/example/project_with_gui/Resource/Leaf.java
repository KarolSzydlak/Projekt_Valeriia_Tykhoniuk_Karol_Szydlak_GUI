package com.example.project_with_gui.Resource;

import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;

import java.util.Random;

public class Leaf extends Resource {
    static int id = 5;
    public static int armor = 50;
    int weight = 50;

    public Leaf(int id, int armor, int weight) {
        this.id = 5;
        this.armor = 50;
        this.weight = 50;
    }

    public static void spawnLeaf() {
        Leaf leaf = new Leaf(5, 50, 50);
        Random random = new Random();
        int pozycja;
        int i;
        int j;
        int u;
        u= random.nextInt(2)+4;
        Point point;
        for (int k = 0; k < u; k++) {
            do {
                i = random.nextInt(9);
                j = random.nextInt(9);
                pozycja = 10 * j + i;
                point = Field.field.get(pozycja);
            }
            while (point.id != 0);
            Field.field.set(pozycja, new Point(Leaf.id, i, j));
        }
    }
}
