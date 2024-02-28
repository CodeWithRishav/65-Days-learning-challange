// package 65-Days-learning-challange.DAY - 1;

// WAP to print odd if the number entered is odd else even

/* 
METHOD 1


public class odd_even {
    public static int oddeve(int num){
        if (num%2==0){
            System.out.println("even number");;
        }else{
            System.out.println("odd number");
        }

        return 1;
    }
    public static void main(String[] args) {
        int num = 25;
        System.out.println(oddeve(num));
    }
    
}
*/

// method 2
import java.util.*;
public class oddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number = ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("even number");;
        }else{
            System.out.println("odd number");
        }
    }
}