import java.util.Scanner;

public class james {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("My program pongpisut ruktao 15");
        System.out.println("Hello program input-output");
        System.out.println("----------------------------");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your nickname: ");
        String nickname = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your phone: ");
        String phone = input.nextLine();

        System.out.print("Enter your School: ");
        String school = input.nextLine();

        System.out.println("----------------------------");
        System.out.println("Your name is " + name);
        System.out.println("Your nickname is " + nickname);
        System.out.println("Your age is " + age);
        System.out.println("Your phone is " + phone);
        System.out.println("Your School is " + school);
    }
}