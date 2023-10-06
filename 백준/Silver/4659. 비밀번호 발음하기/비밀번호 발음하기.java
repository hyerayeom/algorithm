import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String password = br.readLine();

        while (!password.equals("end")) {
            bw.write("<" + password + ">");
            boolean ch1 = false;

            loop:
            {
                // 조건 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
                for (int i = 0; i < password.length(); i++) {
                    char X = password.charAt(i);

                    if (X == 'a' || X == 'e' || X == 'u' || X == 'i' || X == 'o') {
                        ch1 = true;
                    }
                }

                if (ch1 == false) {
                    bw.write(" is not acceptable.");
                    bw.write("\n");
                    break loop;
                }

                // 조건 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다
                if (password.length() >= 3) {
                    boolean[] check = new boolean[password.length()];

                    if (password.charAt(0) == password.charAt(1) && password.charAt(0) != 'e' && password.charAt(0) != 'o') {
                        bw.write(" is not acceptable.");
                        bw.write("\n");
                        break loop;
                    }

                    if (password.charAt(0) == 'a' || password.charAt(0) == 'e' || password.charAt(0) == 'u' || password.charAt(0) == 'i' || password.charAt(0) == 'o') {
                        check[0] = true;
                    }
                    if (password.charAt(1) == 'a' || password.charAt(1) == 'e' || password.charAt(1) == 'u' || password.charAt(1) == 'i' || password.charAt(1) == 'o') {
                        check[1] = true;
                    }

                    for (int i = 2; i < password.length(); i++) {
                        // 같은 글자 2개 연속으로 오는지 확인(ee, oo 제외)
                        if (password.charAt(i - 1) == password.charAt(i) && password.charAt(i) != 'e' && password.charAt(i) != 'o') {
                            bw.write(" is not acceptable.");
                            bw.write("\n");
                            break loop;
                        }

                        // 3개 연속으로 자음, 모음이 오는지 확인
                        if (password.charAt(i) == 'a' || password.charAt(i) == 'e' || password.charAt(i) == 'u' || password.charAt(i) == 'i' || password.charAt(i) == 'o') {
                            check[i] = true;
                        }
                        if ((check[i - 2] && check[i - 1] && check[i]) || (check[i - 2] == false && check[i - 1] == false && check[i] == false)) {
                            bw.write(" is not acceptable.");
                            bw.write("\n");
                            break loop;
                        }
                    }
                }
                bw.write(" is acceptable.");
                bw.write("\n");
            } // loop END

            password = br.readLine();

        } // while END

        bw.flush();
        bw.close();
    }
}