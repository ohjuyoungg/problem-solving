import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class _9498 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        int a = Integer.parseInt(st.nextToken());

        if (90 <= a && a <= 100) { // a 는 90보다 크거나 같다 그리고 a는 100 보다 작거나 같다.
            System.out.println("A");
        } else if (80 <= a && a <= 89) { // a 는 80보다 크거나 같다 그리고 a 는 89보다 작거나 같다.
            System.out.println("B");
        } else if (70 <= a && a <= 79) { // a 는 70보다 크거나 같다 그리고 a는 79보다 작거나 같다.
            System.out.println("C");
        } else if (60 <= a && a <= 69) { // a 는 60보다 크거나 같다. 그리고 a는 69보다 작거나 같다.
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
