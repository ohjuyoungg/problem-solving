import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;

        for (int i = 1; i <= n; i++) {
            s = i + s;
        }
        System.out.print(s - 1);
    }
}
