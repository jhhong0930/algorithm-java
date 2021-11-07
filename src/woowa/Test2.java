package woowa;

public class Test2 {

    public static String solution(String[] log) {

        int len = log.length;
        String[][] tempLog = new String[len][2];

        for (int i=0; i<len; i++) {
            for (int j=0; j<2; j++) {
                String[] temp = log[i].split(":");
                tempLog[i][j] = temp[j];
            }
        }

        int index = len - 1;
        int sum = 0;
        int h, m;

        while (index >= 0) {
            h = Integer.parseInt(tempLog[index][0]) - Integer.parseInt(tempLog[index - 1][0]);
            h *= 60;
            m = Math.abs(Integer.parseInt(tempLog[index][1]) - Integer.parseInt(tempLog[index - 1][1]));

            if (h == 0) {
                if (m >= 5) sum += m;
            } else if (h - m >= 5) {
                if (h - m >= 105) {
                    sum += 105;
                } else {
                    sum = sum + (h - m);
                }
            }

            index -= 2;
        }

        h = sum / 60;
        m = sum % 60;

        StringBuilder sb = new StringBuilder();

        if (h <= 10) {
            sb.append(0);
            sb.append(h);
        } else {
            sb.append(h);
        }

        sb.append(":");

        if (m <= 10) {
            sb.append(0);
            sb.append(m);
        } else {
            sb.append(m);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String[] log1 = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};

        System.out.println(solution(log1));
    }
}
