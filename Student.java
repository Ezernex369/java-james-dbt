import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your age: ");
        int age = sc.nextInt();

        System.out.println();
        System.out.println("your name is : " + name);
        System.out.println("your age is : " + age);
        System.out.println();
    }
}