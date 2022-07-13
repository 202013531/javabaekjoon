package baekjoonjava_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timesremain {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] re = new int[42];
        int ct = 0;
        for(int i=0; i<10; i++){
            re[Integer.parseInt(br.readLine())%42]++;
        }
        for(int i=0; i<42; i++){
            if(re[i]>0){
                ct ++;
            }
        }
        System.out.println(ct);
    }
}
