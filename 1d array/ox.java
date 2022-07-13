package baekjoonjava_4;

import java.io.*;

public class ox {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++){
            int score = 0;
            int ct=0;
            String ns = br.readLine();
            for(int j=0; j<ns.length(); j++){
                if(ns.charAt(j)=='O'){
                    ct += 1;
                    score += ct;
                }
                if(ns.charAt(j)=='X'){
                    ct = 0;
                }
            }
            bw.write(score+"\n");
        }
        bw.close();
    }
}
