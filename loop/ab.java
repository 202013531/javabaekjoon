package baekjoonjava_3;

import java.util.Scanner;

public class ab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for(int i=0; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c[i] = a+b;
        }
        for(int i=0; i<n; i++){
            System.out.println(c[i]);
        }
    }
}
