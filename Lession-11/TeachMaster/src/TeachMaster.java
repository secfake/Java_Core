import java.util.Scanner;

public class TeachMaster {
    private String classManager;
    private String teacher;
    private Classz classz;

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Classz getClassz() {
        return classz;
    }

    public void setClassz(Classz classz) {
        this.classz = classz;
    }

    @Override
    public String toString() {
        return "TeachMaster{" +
                "classManager='" + classManager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classz=" + classz +
                '}';
    }



    public void  inputInfo(Scanner scanner){
        System.out.print("Class manager: ");
        this.classManager= scanner.nextLine();
        System.out.print("Teacher: ");
        this.teacher= scanner.nextLine();
        System.out.println("Enter class: ");
        Classz temp = new Classz();
        temp.inputInfo(scanner);
        this.classz=temp;
    }
}
