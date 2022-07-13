package baekjoonjava_3;

import java.io.*;
import java.util.StringTokenizer;

public class nab {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        boolean done = true;
        while(done){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a+b==0){
                done= false;
            }
            else{
                int c = a+b;
                bw.write(c+"\n");
            }
        }
        bw.close();
    }
}
