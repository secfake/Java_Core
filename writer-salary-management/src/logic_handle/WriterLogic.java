package logic_handle;

import entity.Writer;
import run.MainRun;

import java.util.Scanner;

public class WriterLogic {

    public static void showWriter() {
        for (int i = 0; i < MainRun.writers.length; i++) {
            if (MainRun.writers[i] != null) {
                System.out.println(MainRun.writers[i]);
            }
        }
    }

    public static void addNewWriter() {
        System.out.print("Nhập số lượng phóng viên muốn thêm: ");
        int writerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < writerNum; i++) {
            Writer writer = new Writer();
            writer.inputInfo();
            saveWriter(writer);
        }
    }

    public static void saveWriter(Writer writer) {
        if (writer == null) {
            return;
        }
        for (int i = 0; i < MainRun.writers.length; i++) {
            if (MainRun.writers[i] == null) {
                MainRun.writers[i] = writer;
                break;
            }
        }
    }

    public static Writer findWriterById(int id) {
        Writer writer = null;
        for (int j = 0; j < MainRun.writers.length; j++) {
            if (MainRun.writers[j] != null && MainRun.writers[j].getId() == id) {
                writer = MainRun.writers[j];
                break;
            }
        }
        return writer;
    }

}
