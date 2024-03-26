package org.example.strings;

public class StringsTraining {

    public static void main(String[] args) {

        /*String stringWithSpaces = "   This is a STRING    ";
        System.out.println(stringWithSpaces);

        String trimmedString = stringWithSpaces.trim();
        System.out.println(trimmedString);*/

        /*int weight = 10;

        if (weight % 2 == 0) {
            System.out.println("Четное число");
        } else System.out.println("Нечетное число");*/

        String url = "https://vk.com";

        if (url.startsWith("http:")) {
            System.out.println("ERROR");
        } else System.out.println("GOOD");

    }

}
