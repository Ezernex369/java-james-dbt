import java.util.Scanner;
class S_menu {

    int Choice; String name; int age;
    Scanner input = new Scanner(System.in);

    void show_S_menu(){
        if (Choice == 1) {
            System.out.println("Enter your name :");
            String name = input.nextLine();
            System.out.println("Your name is "+ name);
    } else if (Choice == 2) {
            System.out.println("Enter your age :");
            int age = input.nextInt();
            System.out.println("Your age is "+ age +" old");
    } else{
        System.out.println("Error!!");
    }
}
}

public class MainMenu { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    S_menu S1 = new S_menu();
        System.out.println("1. : NAME");
        System.out.println("2. : AGE");
        System.out.println("Enter your menu :");
        S1.Choice = input.nextInt();

        S1.show_S_menu();   
    }
}