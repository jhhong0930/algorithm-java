package programmers.kakao;

public class P72410_신규아이디추천 {

    public static String solution(String new_id) {

        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^a-z\\d\\-_.]*", "");

        // 3단계
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4단게
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        // 5단계
        if (new_id.length() == 0) new_id = "a";

        // 6단계
        if (new_id.length() >= 16) new_id = new_id.substring(0, 15);
        new_id = new_id.replaceAll("[.]$", "");

        // 7단게
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.substring(new_id.length() - 1);
            }
        }

        return new_id;
    }

    public static void main(String[] args) {

        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";

        System.out.println(solution(new_id1));
        System.out.println(solution(new_id2));
        System.out.println(solution(new_id3));
        System.out.println(solution(new_id4));
        System.out.println(solution(new_id5));
    }

}
