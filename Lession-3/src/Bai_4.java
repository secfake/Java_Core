import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int n;
        int m = 2;
        String ketqua ="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiền là: ", n);
        while (n>0){
            boolean check = true;
            for (int i = 2; i < m; i++){
                if (m % i == 0)
                    check = false;
            }
            if (check){
                n-=1;
                ketqua+=m + " ";
            }
            m+=1;
        }
        System.out.println(ketqua);
}
}
