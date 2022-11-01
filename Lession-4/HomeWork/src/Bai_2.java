public class Bai_2 {
    public static void main(String[] args) {
        System.out.println("Các số thỏa mãn:");
        for (int i = 1000000; i < 10000000; i++) {
            if (checkSNT(i) && chuSoNT(i) && nghichDao_SNT(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean chuSoNT(int n) {
        while (n > 0) {
            if (!checkSNT(n % 10)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean nghichDao_SNT(int n) {
        int check = 0;
        while (n > 0) {
            check = check * 10 + n % 10;
            n /= 10;
        }
        if (!checkSNT(check)) {
            return false;
        }
        return true;
    }
}
