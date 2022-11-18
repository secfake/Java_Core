package student_manage;

public class Student implements Iclassification {
    private String name;
    private int age;
    private float marks;
    private String classification;

    public Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


    public void classify() {
        if (marks >= 8) {
            this.classification = "A";
        } else if (marks > 6.5) {
            this.classification = "B";
        } else {
            this.classification = "C";
        }
    }


    @Override
    public void display() {
        this.classify();
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", classification='" + classification + '\'' +
                '}');
    }
}
