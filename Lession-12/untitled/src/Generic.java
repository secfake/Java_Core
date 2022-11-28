import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(list.toString());
        MyGenneric<Integer> a = new MyGenneric<>(1);MyGenneric<String> b = new MyGenneric<>("ậndj");
        System.out.println(a.toString());
        System.out.println(b.toString());
        in(list);
    }
    public static <T> void in(List<T> list){
        System.out.println(list.get(0));
    }
}
