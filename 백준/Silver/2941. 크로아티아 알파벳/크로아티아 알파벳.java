import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        scan.close();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < cro.length; i++) {
            if (temp.contains(cro[i])) {
                temp = temp.replace(cro[i], "0");
            }
        }
        System.out.println(temp.length());
    }
}