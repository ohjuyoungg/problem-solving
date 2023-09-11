import java.io.*;
import java.util.Arrays;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split(" ");
        int arr[] = new int[line.length];

        int b = Integer.parseInt(br.readLine());

        int v = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
                if (b == arr[i]) {
                    v = v + 1;
                }
            }
        bw.write(Integer.toString(v));
        bw.flush();
        bw.close();
        }
    }

