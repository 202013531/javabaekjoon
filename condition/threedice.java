package baekjoonjava_2;

import java.util.Scanner;

public class threedice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int reward=0;
        if(a==b && b==c){
            reward = 10000+a*1000;
        } else if (a!=b && b!=c && c!=a) {
            if(a>b){
                if(a>c){
                    reward = a*100;
                }
                else{
                    reward = c*100;
                }
            } else if (b>a) {
                if(b>c){
                    reward = b*100;
                }
                else {
                    reward = c*100;
                }
            }
        }
        else {
            if(a==b){
                reward = 1000+a*100;
            }
            if(b==c){
                reward = 1000+b*100;
            }
            if(c==a){
                reward = 1000+c*100;
            }
        }
        System.out.println(reward);
    }
}
