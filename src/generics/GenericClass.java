package generics;

import java.util.ArrayList;

public class GenericClass {

    private final Object[] elementData;
    private int i = 0;

    GenericClass(int a) {
        elementData = new Object[a];
    }

    public Object get(int i) {
        return elementData[i];
    }

    public void add(Object o) {
        elementData[i] = o;
        i++;
    }

}