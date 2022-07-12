package baekjoonjava_2;

import java.util.Scanner;

public class quardrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int qrd;
        if(x*y>0){
            if(x>0){
                qrd = 1;
            }
            else {
                qrd = 3;
            }
        }
        else{
            if(x>0){
                qrd = 4;
            }
            else {
                qrd = 2;
            }
        }
        System.out.println(qrd);
    }
}
