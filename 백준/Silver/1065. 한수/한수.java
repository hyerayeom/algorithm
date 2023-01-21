import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();

        if (N < 100) {
            System.out.println(N);
        } else {
            int x, y, z;
            int count = 99;

            for (int i = 100; i <= N; i++) {
                x = i / 100;
                y = i / 10 % 10;
                z = i % 10;

                if ((z - y) == (y - x)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

