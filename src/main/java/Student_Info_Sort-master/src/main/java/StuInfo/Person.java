package StuInfo;

public class Person {
    public String id;
    public String name;
    public String age;
    public String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String show()
    {
       return "Id: "+this.id+", Name: "+this.name+", Age: "+this.age+", Grade: "+this.grade;
    }
}
