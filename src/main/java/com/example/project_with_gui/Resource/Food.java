package com.example.project_with_gui.Resource;

import com.example.project_with_gui.Field;
import com.example.project_with_gui.Point;

import java.util.Random;

public class Food extends Resource {
    public Food(int id) {
        this.id = 6;
    }

    public static void spawnFood() {
        Food food1 = new Food(6);
        Food food2 = new Food(6);
        Food food3 = new Food(6);
        Food food4 = new Food(6);
        Random random = new Random();
        int pozycja;
        int i;
        int j;
        int u;
        u= random.nextInt(3)+4;
        Point point;
        for (int k = 0; k < u; k++) {
            do {
                i = random.nextInt(9);
                j = random.nextInt(9);
                pozycja = 10 * j + i;
                point = Field.field.get(pozycja);
            }
            while (point.id != 0);
            Field.field.set(pozycja, new Point(Food.id, i, j));
        }
    }
}
