package baekjoonjava_4;

import java.io.*;
import java.util.StringTokenizer;

public class overmean {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            double[] t = new double[tmp];
            int sum = 0;
            for(int j=0; j<tmp; j++){
                t[j] = Integer.parseInt(st.nextToken());
                sum += t[j];
            }
            double mean = sum/tmp;
            double ct=0;
            for(int j=0; j<tmp; j++){
                if(t[j]>mean){
                    ct ++;
                }
            }
            double per = ct/tmp*100;
            bw.write(String.format("%.3f", per)+"%"+"\n");
        }
        bw.close();
    }
}
