import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int a,b,c,d,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        System.out.print("Nhập số c: ");
        c = sc.nextInt();
        System.out.print("Nhập số d: ");
        d = sc.nextInt();
        if (a > b){
            max = a;
        }else{
            max = b;
        }
        if (max < c)
            max =c;
        if (max < d)
            max =d;
        System.out.printf("Số lớn nhất trong 4 số %d, %d, %d, %d là %d",a,b,c,d,max);

    }
}
