import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class _2480 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        if (a == b && b == c && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b &&  b != c) {
            System.out.println(1000 + a * 100);
        } else if (b == c && a != c) {
            System.out.println(1000 + b * 100);
        } else if (a == c && b != a) {
            System.out.println(1000 + a * 100);
        } else if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                System.out.println(a * 100);
            } else if (b > a && b > c) {
                System.out.println(b * 100);
            } else if (c > a && c > b) {
                System.out.println(c * 100);
            }
        }
    }
}
