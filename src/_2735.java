import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class _2735 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        int a = Integer.parseInt(st.nextToken());

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
