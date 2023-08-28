import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class _10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력받기 위한 도구
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T // 입력받기를 기다리기 = readLine() > 실제로 입력을 진행하는 함수
        StringTokenizer st; // 입력을 정수 A와 B로 쪼개기 위해서 StringTokenizer 이용
        StringBuilder sb = new StringBuilder(); // 마지막에 한꺼번에 출력하기 위한 StringBuilder 성능때문에 함.

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input, " "); // 띄어쓰기를 기준으로 입력받은 문자열을 자르겠다.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b + "\n");
        }
        System.out.println(sb);
    }
}