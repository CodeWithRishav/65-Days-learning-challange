// WAP to check if the number is even and divisible by 3

/**
 * divisibilityCheck
 */

import java.util.*;
public class divisibilityCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number = ");
        int num = sc.nextInt();
        if(num%3==0){
            System.out.println("number is divisible by 3");
        }
        else{
            System.out.println("number not divisible by 3");
        }
    }
}