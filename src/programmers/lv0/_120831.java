package programmers.lv0;

public class _120831 {

    public static int solution(int n) {
        int sum = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                sum += n;
            }
            n--;
        }
        return sum + n;
    }


    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
