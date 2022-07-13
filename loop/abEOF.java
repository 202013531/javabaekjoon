package baekjoonjava_3;

import java.io.*;
import java.util.StringTokenizer;

public class abEOF {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;
        while((input=br.readLine())!=null){
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a+b;
            bw.write(c+"\n");
        }
        bw.close();
    }
}
