package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// 각 클래스를 왜 만들고 지금 상황에 왜 필요한지 명확히 알고 사용해야 됨.

// 입력
// 3
// Hello
// Jinseong
// Juyoung

// 출력
// Hello
// Jinseong
// Juyoung
public class _11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받을 수 있는 도구.
        int N = Integer.parseInt(br.readLine()); // 테스트 케이스의 갯수 입력 (숫자)

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            System.out.println(a);
        }
    }
}


