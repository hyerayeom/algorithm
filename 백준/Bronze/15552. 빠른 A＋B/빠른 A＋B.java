import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A, B;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            A = Integer.parseInt(s.split(" ")[0]);
            B = Integer.parseInt(s.split(" ")[1]);
            
            bw.write((A+B)+"\n");
        }
        bw.flush();
    }
}