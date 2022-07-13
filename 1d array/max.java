package baekjoonjava_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=Integer.parseInt(br.readLine());
        int ct=1;
        for(int i=2; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            if(n>max){
                max = n;
                ct = i;
            }
        }
        System.out.println(max);
        System.out.println(ct);
    }
}
