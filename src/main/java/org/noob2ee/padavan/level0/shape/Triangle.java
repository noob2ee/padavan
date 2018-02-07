package org.noob2ee.padavan.level0.shape;

public class Triangle extends AbstractShape implements Comparable<AbstractShape> {

    private final static int CORNERS = 3;

    public Triangle(String type) {
        super(type);
    }

    @Override
    public int getCornerCount() {
        return CORNERS;
    }

    @Override
    public String draw() {
        return "T";
    }

    @Override
    public int compareTo(AbstractShape abstractShape) {
        return this.getCornerCount() - abstractShape.getCornerCount();
    }
}
