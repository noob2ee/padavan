package org.noob2ee.padavan.level2;

import java.util.ArrayList;
import java.util.List;

public class ArrayInitializer {

    public static <T> List<T> init(List<T> input, T initValue, int size) {
        List<T> result = input;
        if (input == null) {
            result = new ArrayList<>();
        }
        for (int i = 0; i < size; i++) {
            result.add(initValue);
        }
        return result;
    }
}
