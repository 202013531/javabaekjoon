package baekjoonjava_3;

import java.io.*;
import java.util.StringTokenizer;

public class ncaseab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a + b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + c + "\n");
        }
        bw.close();
    }
}
