package org.example.chaining;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = true, chain = true)
@ToString
public class Person1 {

    private int age;
    private String name;
    private String job;
    private double weight;

}
