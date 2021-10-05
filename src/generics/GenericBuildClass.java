package generics;


import serializable.Employee;

import java.util.ArrayList;

public class GenericBuildClass {
    public static void main(String[] args) {
        GenericClass files = new GenericClass(4);

        files.add("Juan");
        files.add("Maria");
        files.add("Ana");
        files.add("Sandra");

        String personName = (String) files.get(2);
        System.out.println(personName);



    }
}
