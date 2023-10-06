import javax.management.MBeanRegistration;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Scanner scan = new Scanner(System.in);

        int count=1;

        String A = null;
        boolean B;

        ArrayList<String> answer = new ArrayList<>();

        while (true) {
            ArrayList<StudentList> StudentList = new ArrayList<>();

            int N;
            if(A == null){
                N = Integer.parseInt(br.readLine());
            } else if(A.equals("0")){
                for (int i = 0; i<answer.size(); i++){
                    System.out.println(count + " " + answer.get(i));
                    count++;
                }
                break;
            } else {
                N = Integer.parseInt(A);
            }

            for (int i = 0; i < N; i++) { // 학생 이름 등록
                String inputName = br.readLine();
                StudentList.add(new StudentList(i, inputName, true));
            }

            while (true) { // 압수한 귀걸이 반환 여부 검사
                st = new StringTokenizer(br.readLine());
                A = st.nextToken();
                B = st.hasMoreTokens();
                if(!B){
                    for (int i = 0; i<StudentList.size(); i++){
                        if(!StudentList.get(i).isReturn){
                            answer.add(StudentList.get(i).name);
                        }
                    }
                    break;
                }
                StudentList.get(Integer.parseInt(A)-1).isReturn = !StudentList.get(Integer.parseInt(A)-1).isReturn;

            }
        }
        
    }
}

class StudentList{
    int scenario;
    String name;
    boolean isReturn;
    public StudentList(int S, String N, boolean isR){
        this.scenario = S;
        this.name = N;
        this.isReturn = isR;
    }
}

