package leetcode;

public class L58_Length_of_Last_Word {

    static int lengthOfLastWord(String s) {

        String temp = s.trim();

        int length = temp.length();

        int count = 0;

        for (int i=length-1; i>=0; i--) {

            if (temp.charAt(i) == ' ') {
                break;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("    day"));
    }

}
