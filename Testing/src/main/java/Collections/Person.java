package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    String name;
    String nationality;
    int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    String getNationality() {
        return nationality;
    }
    Integer getAge() {
        return age;
    }
    String getName(){
        return name;
    }

}