package org.noob2ee.padavan.level0.shape;

public class Canvas {

    public void draw(IDraw figure) {
        System.out.println("I'm drawing on your desktop...");
        System.out.println(figure.draw());
        System.out.println("-------");
    }
}
