package Sorts;

import StuInfo.Person;

import java.util.Comparator;

public class AgeDeOrder implements Comparator<Person>{
    public int compare(Person o1, Person o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        int num = (p2.getAge()).compareTo(p1.getAge());
        if(num == 0) {
            return (p1.getId()).compareTo(p2.getId());
        }
        else
            return  num;
    }
}
