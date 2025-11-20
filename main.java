import java.util.Scanner;

public class main {
    static class Banknote {
        int thousand;
        int fiveHundred;
        int hundred;
        int fifty;
        boolean valid;

        Banknote(int amount) {
            if (amount % 100 == 0) {
                valid = true;
                int remaining = amount;
                if (remaining >= 1000) {
                    thousand = remaining / 1000;
                    remaining = remaining % 1000;
                }
                if (remaining >= 500) {
                    fiveHundred = remaining / 500;
                    remaining = remaining % 500;
                }
                if (remaining >= 100) {
                    hundred = remaining / 100;
                    remaining = remaining % 100;
                }
                if (remaining >= 50) {
                    fifty = remaining / 50;
                }
            } else {
                valid = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงิน : ");
        int amount = scanner.nextInt();

        Banknote banknote = new Banknote(amount);
        if (banknote.valid) {
            System.out.println("จำนวนธนบัตร 1000 บาท = " + banknote.thousand + " ใบ");
            System.out.println("ธนบัตร 500 บาท = " + banknote.fiveHundred + " ใบ");
            System.out.println("ธนบัตร 100 บาท = " + banknote.hundred + " ใบ");
            System.out.println("ธนบัตร 50 บาท = " + banknote.fifty + " ใบ");
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
