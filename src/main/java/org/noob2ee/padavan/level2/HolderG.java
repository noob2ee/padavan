package org.noob2ee.padavan.level2;

public class HolderG<T extends Number> {
    private T field;

    public HolderG(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
