package leetcode;

public class L28_Implement_strStr {

    static int strStr(String haystack, String needle) {

//        if (needle.equals("")) return 0;
//
//        return haystack.indexOf(needle);

        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if(needleLen == 0) return 0;

        int last = needleLen - 1;

        for(int i=0;i<=(haystackLen - needleLen);i++){
            if(isSame(haystack, needle, i, last)) return i;
        }

        return -1;
    }

    static boolean isSame(String h, String n, int start, int last){

        int i=0;

        while(i<=last){
            if(h.charAt(start+i) != n.charAt(i++) || h.charAt(start+last)!=n.charAt(last--)) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        String haystack1 = "hello";
        String needle1 = "ll";

        String haystack2 = "aaaaa";
        String needle2 = "bba";

        String haystack3 = "";
        String needle3 = "";

        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }

}
