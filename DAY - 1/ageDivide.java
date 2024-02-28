// package 65-Days-learning-challange.DAY - 1;

// WAP to divide people into three age groups depending on their age

public class ageDivide {
    public static void main(String[] args) {
        int age[] = {12,24,25,36,96,85};
        for(int i=0;i<age.length;i++){
        if (age[i]>60){
            System.out.println("60+");
            }
        else if(age[i]>30){
            System.out.println("adult");
        }else if(age[i]>10);
        System.out.println("teen");
        }
    }
    
}
