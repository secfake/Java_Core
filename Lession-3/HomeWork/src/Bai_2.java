import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int n, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        n = sc.nextInt();
        String ketqua ="";
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                ketqua+=i +" ";
                k+=1;
            }
        }
        System.out.printf("Số %d có %d ước số",n,k);
        System.out.printf("\nƯớc số của %d là: %s",n,ketqua);
    }
}
