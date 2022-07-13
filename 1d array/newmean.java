package baekjoonjava_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class newmean {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        float[] x = new float[n];
        for(int i=0; i<n; i++){
            x[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        float M = x[x.length-1];
        for(int i=0; i<n; i++){
            x[i] = x[i]/M*100;
        }
        float sum=0;
        for(int i=0; i<n; i++){
            sum += x[i];
        }
        float mean = sum/n;
        System.out.println(mean);
    }
}
