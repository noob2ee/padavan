package org.noob2ee.padavan.level0.shape;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Circle circle = new Circle("BIGCIRCLE");
        Square square = new Square("BIGSQUARE");
        Triangle triangle = new Triangle("smallTRIANGLE");
        canvas.draw(circle);
        canvas.draw(square);
        canvas.draw(triangle);

        TreeSet<Comparable> set = new TreeSet<>();
        set.add(square);
        set.add(triangle);

        System.out.println(set);


    }
}
