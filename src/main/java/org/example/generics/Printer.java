package org.example.generics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Printer<T extends NewMainClass> {

    T somethingToPrint;

    public void print() {
        somethingToPrint.make();
        System.out.println("");
    }

}
