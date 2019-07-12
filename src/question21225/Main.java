package question21225;

import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/3 10:24
 **/
public class Main {

    public int countTimes(String str, char ch) {
        int result = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch) {
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String chStr = scanner.nextLine();
        char ch = chStr.toLowerCase().charAt(0);
        System.out.println(new Main().countTimes(str, ch));
    }
}
