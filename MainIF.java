import java.util.Scanner;

public class MainIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ชื่อ-สกุล");
        System.out.println("Program Grade");
        System.out.println("*****************************************************");

        System.out.print("Enter your score\n> ");
        int score = scanner.nextInt();

        int grade;
        if (score >= 80) {
            grade = 4;
        } else if (score >= 70) {
            grade = 3;
        } else if (score >= 60) {
            grade = 2;
        } else if (score >= 50) {
            grade = 1;
        } else {
            grade = 0;
        }

        System.out.println();
        System.out.println("คะแนนของคุณคือ: " + score);
        System.out.println("เกรดที่ได้คือ: " + grade);

        scanner.close();
    }
}
