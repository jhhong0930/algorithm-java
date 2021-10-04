package leetcode;

public class L14_Longest_Common_Prefix {

    static String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        int minLength = 200;

        char temp;

        // 제일 짧은 길이 구하기
        for (int i=0; i<strs.length; i++) {
            if (strs[i].length() < minLength) minLength = strs[i].length();
        }

        for (int i=0; i<minLength; i++) {

            // 첫 번째 문자열의 i번째 문자를 변수에 저장
            temp = strs[0].charAt(i);

            // 그 다음 문자열의 i번째 문자를 비교
            for (int j=1; j<strs.length; j++) {
                // 다르면 그대로 StringBuilder를 return
                if (temp != strs[j].charAt(i)) return sb.toString();
            }

            // 전체 순회 후 모든 문자들이 같으면 StringBuilder에 저장
            sb.append(temp);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs1));
    }

}
