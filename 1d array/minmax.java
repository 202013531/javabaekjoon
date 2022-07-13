package baekjoonjava_4;

import java.io.*;
import java.util.StringTokenizer;

public class minmax {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i] = Integer.parseInt(st.nextToken());
        }
        int max = x[0];
        int min = x[0];
        for(int i=0; i<n; i++){
            if(x[i]>max){
                max = x[i];
            }
            if(x[i]<min){
                min = x[i];
            }
        }
        bw.write(min+" "+max);
        bw.close();
    }
}
