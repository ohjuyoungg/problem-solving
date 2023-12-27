package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;


class _27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String var = br.readLine();

        String a = line;
        String[] b = var.split(" ");

        int i = Integer.parseInt(b[0]);

        System.out.println(a.charAt(i-1));

        }
    }

