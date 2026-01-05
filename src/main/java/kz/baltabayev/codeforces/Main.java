package kz.baltabayev.codeforces;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt(); // читаем количество тестов
        while (t-- > 0) {
            int x = in.nextInt();
            char[] array = String.valueOf(x).toCharArray();

            int min = 9;
            for (char c : array) {
                min = Math.min(min, c - '0'); // символ -> цифра
            }

            out.println(min);
        }

        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
