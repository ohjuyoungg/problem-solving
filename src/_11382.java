import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;


class _11382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] x = line.split(" ");

        long a = Long.parseLong(x[0]);
        long b = Long.parseLong(x[1]);
        long c = Long.parseLong(x[2]);


        System.out.println(a + b + c);

    }
}
