
import java.util.Scanner;

public class IT24102476Lab7Q1A {

    public static void main(String args[]) {
        int i = 1, total = 0, marks;
        double avrg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr marks for four subjects:");

        while (i <= 4) {
            System.out.print("Enetr subject mark " + i + ": ");
            marks = input.nextInt();
            i++;
            total += marks;
        }
        avrg = (double) total / 4;
        System.out.println("\nAverage is: " + avrg);

        if (avrg <= 100 && avrg >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (avrg <= 74 && avrg >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else if (avrg <= 49 && avrg >= 0) {
            System.out.println("Overall Grade is : Fail");
        } else {
            System.out.println("Marks should be between 0 and 100.");
        }
    }
}
