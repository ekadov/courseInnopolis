package org.example.chaining;

public class Person {

    private int age;
    private String name;
    private String job;
    private double weight;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setJob(String job) {
        this.job = job;
        return this;
    }

    public Person setWeight(double weight) {
        this.weight = weight;
        return this;
    }
}
