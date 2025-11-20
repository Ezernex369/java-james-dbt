import java.util.Scanner;
class Number{
    int num;
    void showNumber(){
        if (num < 50 && num > 40) {
            System.out.println("Number less then 50 and more than 40");
            }else if (num > 50 || num < 40) {
                System.out.println("Number more then 50 or less 40");
            }else{
                System.out.println("Numbre equal to 50");
            }
    }
}

public class MainIF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Number N1 =new number();

        System.out.println("Enter your Numbers");
        N1.num = input.nextInt();

        N1.showNumber();
    }
}