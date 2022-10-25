import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        String s, c;
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("===============Phần a==============");
        System.out.print("Nhập chuỗi ký tự: ");
        s = sc.nextLine();
        System.out.print("Nhập ký tự cần tìm: ");
        c = sc.next();
        int kq = s.indexOf(c);
        String ketqua = kq < 0 ? "Không tìm thấy ký tự trong chuỗi" : "Vị trị ký tự đầu tiên: "+(s.indexOf(c)+1)+"\nVị trí ký tự cuối cùng: "+(s.lastIndexOf(c)+1);
        System.out.println(ketqua);
        System.out.println("===============Phần b==============");
        System.out.print("Nhập chuỗi bất kỳ s: ");
        sc.nextLine();
        s = sc.nextLine();
        System.out.print("Nhập chuỗi cần tìm s1: ");
        s1 = sc.nextLine();
        System.out.print("Nhập chuỗi thay thế s2: ");
        s2 = sc.nextLine();
        kq = s.indexOf(s1);
        ketqua = kq < 0 ? "Không tìm thấy chuỗi s1" : "Kết quả chuỗi mới: "+s.replace(s1,s2);
        System.out.println(ketqua);
    }
}
