// Print n natural numbers and their sum
import java.util.*;
public class printandsumnaturalnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of natural numbers to print");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            System.out.print(i + " ");
            sum = sum+ i;
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }
}