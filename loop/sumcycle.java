package baekjoonjava_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumcycle {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int n = a;
        int ct = 0;
        boolean done = true;
        while(done){
            if(a<10){
                a = a*10+a;
                ct +=1;
            }
            else {
                a = (a/10+a%10)%10+(a%10)*10;
                ct +=1;
            }
            if(a==n){
                done = false;
            }
        }
        System.out.println(ct);
    }
}
