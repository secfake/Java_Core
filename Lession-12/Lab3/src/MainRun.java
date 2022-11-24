import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        WorkerAction workerAction = new WorkerAction();
        workers.addAll(workerAction.addWorker(scanner));
        System.out.println(workers.toString());
        workerAction.upSalary(scanner,workers);
        System.out.println(workers.toString());
        workerAction.downSalary(scanner,workers);
    }
}
