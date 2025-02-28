package com.example.Test4.Bai2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> list;

    public PersonService(){
        list = new ArrayList<>();
    }

    public boolean addPerson(Person person){
        if (person == null){
            return false;
        }
        return list.add(person);
    }
}
