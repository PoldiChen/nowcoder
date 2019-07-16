package question26jinzhi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/12 21:26
 **/
public class Main {

    private static int convertStrToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int charVal = convertCharToInt(str.charAt(i));
            result += charVal * Math.pow(26, str.length() - i - 1);
        }
        return result;
    }

    private static int convertCharToInt(char ch) {
        return Integer.valueOf(ch) - 97;
    }

    private static char convertIntToChar(int number) {
        char[] chars = Character.toChars(number+97);
        return chars[0];
    }

    private static String operation2(String operator, String str1, String str2) {
        String result = "";
        int power = 0;
        boolean jinwei = false;
        boolean jiewei = false;
        while (power < str1.length() && power < str2.length()) {
            char ch1 = str1.charAt(str1.length() - power - 1);
            char ch2 = str2.charAt(str2.length() - power - 1);
            int num1 = convertCharToInt(ch1);
            int num2 = convertCharToInt(ch2);
            if (operator.equals("ADD")) { // 加法
                int temp = num1 + num2;
                if (jinwei) {
                    temp += 1;
                    jinwei = false;
                }
                if (temp >= 26) {
                    temp -= 26;
                    jinwei = true;
                }
                char ch = convertIntToChar(temp);
                result = String.valueOf(ch) + result;
            } else { // 减法
                if (jiewei) {
                    num1 = num1 -1;
                    jiewei = false;
                }
                if (num1 < num2) {
                    num1 = num1 + 26;
                    jiewei = true;
                }
                int temp = num1 - num2;
                char ch = convertIntToChar(temp);
                result = String.valueOf(ch) + result;
            }
            power ++;

        }

        // TODO: 两个数的长度不同，结果再加上剩余没参与计算的部分

        if (str1.length() > power) {
            if (jinwei) {
                char ch = str1.charAt(str1.length() - power);
                int num = convertCharToInt(ch);
                num ++;
                ch = convertIntToChar(num);
                result = str1.substring(0, str1.length() - power) + ch + result;
            } else {
                result = str1.substring(0, str1.length() - 1) + result;
            }

        }
        if (str2.length() > power) {
            if (jinwei) {
                char ch = str2.charAt(str2.length() - power);
                int num = convertCharToInt(ch);
                num ++;
                ch = convertIntToChar(num);
                result = str2.substring(0, str2.length() - power) + ch + result;
            } else {
                result = str2.substring(0, str2.length() - 1) + result;
            }
        }

        if ((str1.length() == str2.length()) && jinwei) {
            result = "b" + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "a";
        List<String[]> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] strs = input.split(" ");
            list.add(strs);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String[] strs = (String[])iterator.next();
            if (strs[0].equals("ADD")) {
                result = operation2(strs[0], result, strs[1]);
                iterator.remove();
            }
        }

        for (String[] strs : list) {
            result = operation2(strs[0], result, strs[1]);
        }

        System.out.println(convertStrToInt(result));
    }

}
