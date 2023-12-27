package programmers.lv0;

public class _120806 {
    public static int solution(double num1, double num2) {
        int answer = (int) ((num1 / num2) * 1000);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
    }
}
