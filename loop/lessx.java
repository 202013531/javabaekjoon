package baekjoonjava_3;

import java.io.*;
import java.util.StringTokenizer;

public class lessx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringTokenizer xt;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        xt = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(xt.nextToken());
            if(x>k){
                bw.write(k+" ");
            }
        }
        bw.close();
    }
}
