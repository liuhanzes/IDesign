package com.liuhanze.design_patterns.visitor.demo2;

import java.util.ArrayList;
import java.util.List;

class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person person: personList) {
            person.accept(action);
        }
    }

}
