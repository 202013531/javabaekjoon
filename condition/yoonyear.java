package baekjoonjava_2;

import java.util.Scanner;

public class yoonyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if(yr%4==0 && yr%100!=0){
            System.out.println("1");
        } else if (yr%400==0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
