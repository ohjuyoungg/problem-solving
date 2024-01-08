package programmers.lv0;

public class _120909 {
    public static int solution(int n) {
        double answer = Math.sqrt(n);

        if ((answer * answer) % answer == 0) {
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(976));
    }
}
