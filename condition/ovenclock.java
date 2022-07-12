package baekjoonjava_2;

import java.util.Scanner;

public class ovenclock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int mn = sc.nextInt();
        int tc = sc.nextInt();
        mn = mn+tc;
        int new_hr = mn/60;
        mn = mn%60;
        hr = hr+new_hr;
        hr = hr%24;
        System.out.println(hr+" "+mn);
    }
}
