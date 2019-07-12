package question21228;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/4 23:49
 **/
public class Main {


    private static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("A", 10);
        map.put("B", 11);
        map.put("C", 12);
        map.put("D", 13);
        map.put("E", 14);
        map.put("F", 15);
    }

    public int convertHex(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int index = 0;
        int result = 0;
        while (index <= str.length()-3) {
            int val;
            String ch = str.substring(str.length()-index-1, str.length());
            if (map.containsKey(ch)) {
                val = map.get(ch);
            } else {
                val = Integer.parseInt(ch);
            }
            result += val * Math.pow(16, index);
            index ++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(new Main().convertHex(str));
    }
}
