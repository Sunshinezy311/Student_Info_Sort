package StuInfo;

public class Person {
    private String id;
    private String name;
    private String age;
    private Double grade;

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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String show()
    {
       return "Id: "+this.id+", Name: "+this.name+", Age: "+this.age+", Grade: "+this.grade;
    }
}
