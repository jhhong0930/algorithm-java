package programmers.kakao;

public class P17683_방금그곡 {

    public static String solution(String m, String[] musicinfos) {

        String answer = "(None)";
        int maxPlaytime = Integer.MIN_VALUE;
        m = replaceWithSharp(m);

        for (int i=0; i< musicinfos.length; i++) {

            String[] musicInfo = musicinfos[i].split(",");

            int playtime = getPlaytime(musicInfo[0], musicInfo[1]);

            String chords = replaceWithSharp(musicInfo[3]);
            int chordsLen = chords.length();

            StringBuilder sb = new StringBuilder();
            for (int j=0; j<playtime; j++) sb.append(chords.charAt(j % chordsLen));
            chords = sb.toString();

            if (chords.contains(m) && playtime > maxPlaytime) {
                answer = musicInfo[2];
                maxPlaytime = playtime;
            }
        }

        return answer;
    }

    static String replaceWithSharp(String str) {

        str = str
                .replace("C#", "H")
                .replace("D#", "I")
                .replace("F#", "J")
                .replace("G#", "K")
                .replace("A#", "L");
        return str;
    }

    static int getPlaytime(String startTime, String endTime) {

        int startHour = Integer.parseInt(startTime.substring(0, 2));
        int startMin = Integer.parseInt(startTime.substring(3));
        int endHour = Integer.parseInt(endTime.substring(0, 2));
        int endMin = Integer.parseInt(endTime.substring(3));

        return (endHour * 60 + endMin) - (startHour * 60 + startMin);
    }

    public static void main(String[] args) {

        String m1 = "ABCDEFG";
        String[] musicinfos1 = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};

        String m2 = "CC#BCC#BCC#BCC#B"	;
        String[] musicinfos2 = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};

        String m3 = "ABC";
        String[] musicinfos3 = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};

        System.out.println(solution(m1, musicinfos1));
        System.out.println(solution(m2, musicinfos2));
        System.out.println(solution(m3, musicinfos3));
    }
}
