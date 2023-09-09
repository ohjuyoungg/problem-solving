import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = n / 4;
        String l = "long";

        for (int i = 1; i < n; i++) {
           l = l + " " + n;
        }
        System.out.print(l + " int");

    }
}
