import java.io.*;
import java.util.StringTokenizer;

public class _10951 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // 입력을 정수 A와 B로 쪼개기 위해서 StringTokenizer 이용
        StringBuilder sb = new StringBuilder();

        String str;

        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}