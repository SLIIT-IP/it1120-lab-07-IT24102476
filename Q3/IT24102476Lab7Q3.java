
import java.util.Scanner;

public class IT24102476Lab7Q3 {

    public static void main(String args[]) {

        int person = 1;
        double amount, discount, pay;
        char mode;
        Scanner input = new Scanner(System.in);

        while (person <= 5) {
            System.out.println("customer " + person);
            System.out.print("Enter total bill amount: ");
            amount = input.nextDouble();

            System.out.print("Enter mode of payment(C for cash, o for other): ");
            mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                discount = amount * 0.05;
                System.out.println("Discount is: " + discount);
                pay = amount - discount;
                System.out.println("Amount to be paid: " + pay + "\n");

            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amount + "\n");

            } else {
                System.out.println("payment Mode is Not Valid.\n");
            }

            person++;
        }

    }
}
