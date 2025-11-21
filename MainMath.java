import java.util.Scanner;

public class MainMath {
    static class Banknote {
        int money;
        int b1000;
        int b500;
        int b100;
        int b50;

        void showMath() {
            int n = money;
            int ok = 0;

            b1000 = 0;
            b500 = 0;
            b100 = 0;
            b50 = 0;

            if (n > 0 && n % 50 == 0) {
                ok = 1;
                b1000 = n / 1000;
                n = n % 1000;
                b500 = n / 500;
                n = n % 500;
                b100 = n / 100;
                n = n % 100;
                b50 = n / 50;
            }

            if (ok == 1) {
                System.out.println("1000Bath = " + b1000 + " Bill");
                System.out.println("500Bath = " + b500 + " Bill");
                System.out.println("100Bath = " + b100 + " Bill");
                System.out.println("50Bath = " + b50 + " Bill");
            } else {
                System.out.println("error");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงิน : ");
        int money = sc.nextInt();

        Banknote N1 = new Banknote();
        N1.money = money;
        N1.showMath();

        sc.close();
    }
}
