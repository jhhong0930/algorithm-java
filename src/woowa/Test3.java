package woowa;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static int solution(String[] ings, String[] menu, String[] sell) {

        int ingsLen = ings.length;
        int menuLen = menu.length;
        int sellLen = sell.length;

        String[][] ingsArr = new String[ingsLen][2];
        String[][] menuArr = new String[menuLen][3];
        String[][] sellArr = new String[sellLen][2];

        // 각각의 재료들을 재료이름, 가격으로 담기
        Map<String, Integer> ingCost = new HashMap<>();
        for (int i=0; i<ingsLen; i++) {
            for (int j=0; j<2; j++) {
                String[] temp = ings[i].split(" ");
                ingsArr[i][j] = temp[j];
            }
            ingCost.put(ingsArr[i][0], Integer.parseInt(ingsArr[i][1]));
        }

        Map<String, Integer> menuCost = new HashMap<>();
        for (int i=0; i<menuLen; i++) {
            for (int j=0; j<3; j++) {
                String[] temp = menu[i].split(" ");
                menuArr[i][j] = temp[j];
            }
        }

        // 각각의 메뉴들을 메뉴이름, 판매가격 - 재료가격으로 담기
        int cost = 0;
        for (int i=0; i<menuLen; i++) {
            String temp = menuArr[i][1];
            for (int j=0; j<temp.length(); j++) {
                cost += ingCost.get(Character.toString(temp.charAt(j)));
            }
            menuCost.put(menuArr[i][0], Integer.parseInt(menuArr[i][2]) - cost);
            cost = 0;
        }

        for (int i=0; i<sellLen; i++) {
            for (int j=0; j<2; j++) {
                String[] temp = sell[i].split(" ");
                sellArr[i][j] = temp[j];
            }
        }

        int answer = 0;

        // (판매가격 - 재료가격) * 판매수량
        for (int i=0; i<sellLen; i++) {
            answer += menuCost.get(sellArr[i][0]) * Integer.parseInt(sellArr[i][1]);
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] ings = {"x 25", "y 20", "z 1000"};
        String[] menu = {"AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"};
        String[] sell = {"BBBB 3", "TTT 2"};

        System.out.println(solution(ings, menu, sell));
    }
}
