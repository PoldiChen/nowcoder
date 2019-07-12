package question21227;

import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/4 10:04
 **/
public class Main {

    public static String getStr(String str) {
        if (str.length() < 8) {
            while (str.length() < 8) {
                str = str + "0";
            }
        } else {
            str = str.substring(0, 8);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = getStr(str);
        System.out.println(str);
    }
}
