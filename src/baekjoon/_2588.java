package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 다시 풀기

class _2588 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String var = br.readLine();

        String[] a = line.split("");
        String[] b = var.split("");

        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(b[0]);

        int sum = 0;

        while (y > 0) {
            sum += y % 10;
            y /= 10;
            System.out.println(x * y);
        }
        System.out.println(x * y);
    }
}
