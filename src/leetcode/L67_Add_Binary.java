package leetcode;

import java.util.Stack;

public class L67_Add_Binary {

    static String addBinary(String a, String b) {

        StringBuilder result=new StringBuilder();

        int reminder=0;
        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0 || j>=0){

            int sum = reminder;

            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';

            result.append(sum%2);

            reminder=sum/2;

            i--;
            j--;
        }

        if(reminder==1) result.append(reminder);


        return result.reverse().toString();
    }

    public static void main(String[] args) {

        String a1 = "11";
        String a2 = "1010";

        String b1 = "1";
        String b2 = "1011";

        System.out.println(addBinary(a1, b1));
        System.out.println(addBinary(a2, b2));
    }

}
