package baekjoonjava_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timesnumber {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mul=1;
        for(int i=0; i<3; i++){
            mul = mul*Integer.parseInt(br.readLine());
        }
        String st = Integer.toString(mul);
        int[] x = new int[st.length()];
        for(int i=0; i<st.length(); i++){
            x[i] = st.charAt(i)-'0';
        }
        int[] ct = new int[10];
        for(int i=0; i<x.length; i++){
            ct[x[i]]++;
        }
        for(int i=0; i<10; i++){
            System.out.println(ct[i]);
        }
    }
}
