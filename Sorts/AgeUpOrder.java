package Sorts;

import StuInfo.Person;

import java.util.Comparator;

public class AgeUpOrder implements Comparator<Person> {

    public int compare(Person p1, Person p2){
        int num = (p1.getAge()).compareTo(p2.getAge());
        if (num == 0) {
            return (p1.getId()).compareTo(p2.getId()); //if same age then order by id
        }
        return (p1.getAge()).compareTo(p2.getAge());
    }
}
