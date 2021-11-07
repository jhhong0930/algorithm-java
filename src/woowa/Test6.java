package woowa;

public class Test6 {
    public String solution(double time, String[][] plans) {

        /*
        퇴근 시간 == 6PM == 18
        출근 시간 == 1PM == 13
         */
        String answer = "";
        int sum = 0;

        String departure;
        String arrival;
        // 출발, 도착 시간
        int dTime;
        int aTime;
        // AM or PM
        String dStr;
        String aStr;

        int len = plans.length;
        for (int i=0; i<len; i++) {

            departure =  plans[i][1];
            dTime = Integer.parseInt(departure.replaceAll("[^0-9]", ""));
            dStr = departure.substring(departure.length() - 2);
            // 24시간제로 변경
            if (dStr.equals("PM")) dTime += 12;

            arrival = plans[i][2];
            aTime = Integer.parseInt(arrival.replaceAll("[^0-9]", ""));
            aStr = arrival.substring(arrival.length() - 2);
            if (aStr.equals("PM")) aTime += 12;

            // 퇴근 시간보다 일찍 출발할 경우
            if (dTime < 18) {
                sum = sum + (18 - dTime);
            }

            // 출근 시간보다 늦게 도착할 경우
            if (aTime > 13) {
                sum = sum + (aTime - 13);
            }

            if (sum < time) answer = plans[i][0];
        }

        return answer;
    }

    public static void main(String[] args) {
//        String str = "11PM";
//        System.out.println(str.substring(str.length()-2));
//        str = str.replaceAll("[^0-9]", "");
//        System.out.println(str);
    }
}
