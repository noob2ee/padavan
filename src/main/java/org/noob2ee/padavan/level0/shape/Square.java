package org.noob2ee.padavan.level0.shape;

public class Square extends AbstractShape implements Comparable<AbstractShape> {

    private final static int CORNERS = 4;

    public Square(String type) {
        super(type);
    }

    @Override
    public int getCornerCount() {
        return CORNERS;
    }

    @Override
    public String draw() {
        return "S";
    }

    @Override
    public int compareTo(AbstractShape abstractShape) {
        return this.getCornerCount() - abstractShape.getCornerCount();
    }
}
