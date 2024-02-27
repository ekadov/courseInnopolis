package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class MainGeneric {

    public static void main(String[] args) {
        /*makeSomething("sdfgdfge", true);
        makeSomething(2, false);*/

        List<String> list = new ArrayList<>();
        list.add("sdgergertfg");
    }


    private static <T> void makeSomething(List<T> something1) {
        System.out.println("Something1: " + something1);
    }

}
