package org.noob2ee.padavan.level0.shape;

public class Circle extends AbstractShape {

    public Circle(String type) {
        super(type);
    }

    @Override
    public String draw() {
        return "o";
    }

    @Override
    public int getCornerCount() {
        throw new RuntimeException("Invalid usage. Doesn't support this method");
    }
}
