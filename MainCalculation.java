import java.util.Scanner;

class MenuCalculation {

    Scanner input = new Scanner(System.in);

    void show_MenuCalculation(int choice) {
        int a; int b;

        System.out.print("Enter A number : ");
        a = input.nextInt();

        System.out.print("Enter B number : ");
        b = input.nextInt();

        if (choice == 1) {
            System.out.println( + a + " + " + b + " = " + (a + b));
        } else if (choice == 2) {
            System.out.println( + a + " - " + b + " = " + (a - b));
        } else if (choice == 3) {
            System.out.println( + a + " * " + b + " = " + (a * b));
        } else if (choice == 4) {
            if (b != 0) {
                System.out.println( + a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("Error");
            }
        } else if (choice == 5) {
            if (b != 0) {
                System.out.println( + a + " % " + b + " = " + (a % b));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("input 1 to 5 Only");
        }
    }
}

public class MainCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pongpisut Ruktao");
        System.out.println("Program Calculation");
        System.out.println("1.(+)");
        System.out.println("2.(-)");
        System.out.println("3.(*)");
        System.out.println("4.(/)");
        System.out.println("5.(%)");
        System.out.print("Input Choice (1-5): ");

        int choice = input.nextInt();

        MenuCalculation S1 = new MenuCalculation();
        S1.show_MenuCalculation(choice);
    }
}
