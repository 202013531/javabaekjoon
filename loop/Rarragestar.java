package baekjoonjava_3;

import java.io.*;

public class Rarragestar {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                bw.write(" ");
            }
            for(int k=0; k<i; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
