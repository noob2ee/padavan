package org.noob2ee.padavan.level0.shape;

import java.util.Random;

public abstract class AbstractShape implements IDraw {
    protected Long id;
    protected String type;
    private Random random = new Random();

    public AbstractShape(String type) {
        this.id = random.nextLong();
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract int getCornerCount();

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
