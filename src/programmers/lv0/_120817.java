package programmers.lv0;

public class _120817 {

    public static double solution(int[] numbers) {
        int sum = 0;
        int a = 0;
        double answer;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            a++;
        }
        return answer = (double) sum / a;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
