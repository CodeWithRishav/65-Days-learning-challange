// Do the sum of the integers entered by the user until he enters 0

import java.util.Scanner;
public class sumuntil0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter an integer (enter 0 to stop): ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum of entered integers: " + sum);

    }
}


