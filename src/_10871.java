import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class _10871 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String var = br.readLine();

        String[] a = line.split(" ");
        String[] b = var.split(" ");

        int n = Integer.parseInt(a[0]);
        int x = Integer.parseInt(a[1]);

        // 실수한 부분 2. 문자열 값을 int형으로 변환하지 않고 출력 시도하였다.
        int[] intArray = Arrays.stream(b).mapToInt(Integer::parseInt).toArray();

        // 실수한 부분 1. for문의 조건부에서 = 을 붙였기 때문에 한번 더 반복되었다 (int i = 0; i <= b.length; i++)

        for (int i = 0; i < b.length; i++) {
            if (x > intArray[i]) {
                System.out.print(b[i] + " ");
            }
        }
    }
}