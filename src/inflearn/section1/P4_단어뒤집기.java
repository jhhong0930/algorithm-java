package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class P4_단어뒤집기 {

    public static void solution(String[] strArr) {

        for (String s : strArr) {
            System.out.println(new StringBuilder(s).reverse());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];

        for (int i=0; i<n; i++) {
            strArr[i] = br.readLine();
        }

        solution(strArr);
    }

    // 강의 코드 v1
//    public static ArrayList<String> solution(int n, String[] str){
//
//        ArrayList<String> answer=new ArrayList<>();
//
//        for(String x : str){
//            String tmp=new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//
//        return answer;
//    }

    // 강의 코드 v2
//    public static ArrayList<String> solution(int n, String[] str){
//
//        ArrayList<String> answer=new ArrayList<>();
//
//        for(String x : str){
//
//            char[] s=x.toCharArray();
//            int lt=0, rt=x.length()-1;
//
//            while(lt<rt){
//                char tmp=s[lt];
//                s[lt]=s[rt];
//                s[rt]=tmp;
//                lt++;
//                rt--;
//            }
//
//            String tmp=String.valueOf(s);
//            answer.add(tmp);
//        }
//
//        return answer;
//    }

//    public static void main(String[] args){
//
//        Scanner kb = new Scanner(System.in);
//        int n=kb.nextInt();
//        String[] str=new String[n];
//
//        for(int i=0; i<n; i++){
//            str[i]=kb.next();
//        }
//
//        for(String x : solution(n, str)){
//            System.out.println(x);
//        }
//    }
}
