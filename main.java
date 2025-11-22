import java.util.Scanner;

class Banknote {
    public void MainMath(int money) {
        int n = money;
        int b1000 = 0;
        int b500 = 0;
        int b100 = 0;
        int b50 = 0;

        if (n >= 100 && n % 50 == 0) {
            b1000 = n / 1000;
            n = n % 1000;

            b500 = n / 500;
            n = n % 500;

            b100 = n / 100;
            n = n % 100;

            b50 = n / 50;

            System.out.println("1000 Baht = " + b1000 + " Bill");
            System.out.println("500 Baht = " + b500 + " Bill");
            System.out.println("100 Baht = " + b100 + " Bill");
            System.out.println("50 Baht = " + b50 + " Bill");
        } else {
            System.out.println("error");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your money : ");
        int money = input.nextInt();
        Banknote N1 = new Banknote();
        N1.MainMath(money);
    }
}