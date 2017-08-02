package com.example.adrian.android_java_diffutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adrian_Czigany on 8/2/2017.
 */

public class DataProvider {

    public static List<Person> getOldPersonList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, 20, "John"));
        persons.add(new Person(2, 12, "Jack"));
        persons.add(new Person(3, 8, "Michael"));
        persons.add(new Person(4, 19, "Rafael"));
        return persons;
    }

    public static List<Person> sortByAge(List<Person> oldList) {
        Collections.sort(oldList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person person2) {
                return person.getAge() - person2.getAge();
            }
        });
        return oldList;
    }

}
