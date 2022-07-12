package baekjoonjava_2;

import java.util.Scanner;

public class alarmclock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int mn = sc.nextInt();
        mn -= 45;
        if(mn>=0){
            System.out.println(hr+" "+mn);
        }
        if(mn<0){
            mn = mn+60;
            if(hr==0){
                hr = 23;
            }
            else{
                hr -= 1;
            }
            System.out.println(hr+" "+mn);
        }
    }
}
