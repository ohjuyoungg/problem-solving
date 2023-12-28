package programmers.lv0;

public class _120829 {
    public static int solution(int angle) {
        int acute = 1;
        int right = 2;
        int obtuse = 3;
        int square = 4;

        if (0 < angle && angle < 90) {
            return acute;
        } else if (angle == 90) {
            return right;
        } else if (90 < angle && angle < 180) {
            return obtuse;
        } else if (angle == 180) {
            return square;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(90));
    }
}
