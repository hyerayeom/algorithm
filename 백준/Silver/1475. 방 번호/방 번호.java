import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Scanner scan = new Scanner(System.in);

        String input = br.readLine();
        int[] number = new int[10];
        int max = 0;

        for (int i = 0; i < input.length(); i++) {
            number[Integer.parseInt(String.valueOf(input.charAt(i)))]++;
        }

        int temp = (number[6] + number[9]) / 2;
        int temp1 = ((number[6] + number[9]) / 2) + (number[6] + number[9]) % 2;
        number[6] = temp;
        number[9] =temp1;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}