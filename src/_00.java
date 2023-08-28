import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력을 위한 도구 (알고리즘 용)

        int N = Integer.parseInt(br.readLine());
        String[] lines = new String[N];

        for (int i = 0; i < N; i++) {
            lines[i] = br.readLine();
        }

        // Enhanced for loop (for each)
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
