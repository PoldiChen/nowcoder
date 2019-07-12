package question21307;

import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/12 15:54
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Integer.valueOf(str.charAt(i)) >= 65 && Integer.valueOf(str.charAt(i)) <= 90) {
                    result ++;
                }
            }
            System.out.println(result);
        }
    }
}
