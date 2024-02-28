// WAP to find the simple interest
import java.util.*;
public class simple_interest{
    public static int SI(int amount, int rate, int time){
        int SimpleInterest = (amount*rate*time)/100;
        return SimpleInterest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount = ");
        int amount = sc.nextInt();
        System.out.println("enter rate = ");
        int rate = sc.nextInt();
        System.out.println("enter time = ");
        int time = sc.nextInt();
        System.out.println(SI(amount,rate,time));
    }
}