import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;


class _14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String var = br.readLine();

        String[] a = line.split(" ");
        String[] b = var.split(" ");

        long x = Long.parseLong(a[0]);
        long y = Long.parseLong(b[0]);

        if (0 < x && x <= 1000 && 0 < y && y <= 1000 ){
            System.out.println(1);
        } else if (0 > x && x >= -1000 && 0 < y && y <= 1000) {
            System.out.println(2);
        } else if (0 > x && x >= -1000 && 0 > y && y >= -1000) {
            System.out.println(3);
        } else if (0 < x && x <= 1000 && 0 > y && y >= -1000) {
            System.out.println(4);
        }
    }
}
