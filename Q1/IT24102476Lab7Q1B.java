
import java.util.Scanner;

public class IT24102476Lab7Q1B {

    public static void main(String args[]) {
        int i = 1, total = 0, marks, student;
        double avrg;
        Scanner input = new Scanner(System.in);

        for (student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enetr marks: ");

            for (i = 1; i <= 4; i++) {
                marks = input.nextInt();
                total += marks;
            }

            avrg = (double) total / 4;
            System.out.println("Average is: " + avrg);
            total = 0;

            if (avrg <= 100 && avrg >= 75) {
                System.out.println("Overall Grade is : Distinction\n");
            } else if (avrg <= 74 && avrg >= 50) {
                System.out.println("Overall Grade is : Credit\n");
            } else if (avrg <= 49 && avrg >= 0) {
                System.out.println("Overall Grade is : Fail\n");
            } else {
                System.out.println("Marks should be between 0 and 100.\n");
            }
        }
    }
}
