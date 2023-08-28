import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class _10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String var = br.readLine();

        String[] a = line.split(" ");
        String[] b = var.split(" ");

        int n = Integer.parseInt(a[0]);
        int x = Integer.parseInt(a[1]);

        int[] intArray = Arrays.stream(b).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < b.length; i++) {
            if (x > intArray[i]) {
                System.out.print(b[i] + " ");
            }
        }
    }
}