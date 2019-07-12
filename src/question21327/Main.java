package question21327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/12 16:18
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }
        list.remove(0);
        for (String str : list) {
            if (str.length() < 8) {
                while (str.length() < 8) {
                    str += "0";
                }
                System.out.println(str);
            } else if (str.length() > 8) {
                while (str.length() > 8) {
                    System.out.println(str.substring(0, 8));
                    str = str.substring(8);
                }
                if (!str.equals("")) {
                    while (str.length() < 8) {
                        str += "0";
                    }
                    System.out.println(str);
                }
            } else {
                System.out.println(str);
            }
        }
    }
}
