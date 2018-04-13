package Sorts;

import StuInfo.Person;
import java.util.Comparator;

public  class IDUpOrder implements Comparator<Person>{
    public int compare(Person o1, Person o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return (p1.getId()).compareTo(p2.getId());
    }
}
