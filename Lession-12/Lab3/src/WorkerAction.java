import java.util.ArrayList;
import java.util.Scanner;

public class WorkerAction {
    public ArrayList<Worker> addWorker(Scanner scanner) {
        int num;
        while (true) {
            try {
                System.out.print("Number Worker: ");
                num = Integer.parseInt(scanner.nextLine());
                if (num < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error input!");
            }
        }
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Worker worker = new Worker();
            worker.inputInfo(scanner);
            workers.add(worker);
        }
        return workers;
    }

    public void upSalary(Scanner scanner, ArrayList<Worker> workers){
        System.out.print("Enter Code: ");
        String code = scanner.nextLine();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId().equalsIgnoreCase(code)){
                while (true) {
                    try {
                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(scanner.nextLine());
                        if (salary < 0||workers.get(i).getSalary()>=salary) {
                            throw  new Exception();
                        }
                        workers.get(i).setSalary(salary);
                        break;
                    } catch (Exception e) {
                        System.out.println("Error input!");
                    }
                }
                return;
            }
        }
        System.out.println("Not Found!");
    }
    public void downSalary(Scanner scanner, ArrayList<Worker> workers){
        System.out.print("Enter Code: ");
        String code = scanner.nextLine();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId().equalsIgnoreCase(code)){
                while (true) {
                    try {
                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(scanner.nextLine());
                        if (salary < 0||workers.get(i).getSalary()<=salary) {
                            throw  new Exception();
                        }
                        workers.get(i).setSalary(salary);
                        break;
                    } catch (Exception e) {
                        System.out.println("Error input!");
                    }
                }
                return;
            }
        }
        System.out.println("Not Found!");
    }
}
