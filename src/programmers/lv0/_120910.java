package programmers.lv0;

public class _120910 {

    public static long solution(int n, int t) {
        long answer = n;
        int i = 1;

        while (i <= t) {
            answer = answer + answer;
            if (i >= t) {
                break;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 15));
    }
}
