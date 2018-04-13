package Sorts;

import StuInfo.Person;

import java.util.Comparator;

public class GradeUpOrder implements Comparator<Person> {

    public int compare(Person p1, Person p2){
        int num = (p1.getGrade()).compareTo(p2.getGrade());
        if (num == 0) {
            return (p1.getId()).compareTo(p2.getId()); //if same age then order by id
        }
        else
            return p1.getGrade().compareTo(p2.getGrade());

    }
}
