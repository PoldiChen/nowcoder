package question21288;

import java.util.Scanner;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/4 10:24
 **/
public class Main {

    public String countLongCommonSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n][m];
        dp[0][0] = str1.charAt(0) == str2.charAt(0) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }
        for (int j = 1; j < m; j++) {
            if (str1.charAt(0) == str2.charAt(j)) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        int max = 0;
        String longestStr = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    longestStr = str1.substring(i-max+1, i+1);
                } else if (dp[i][j] == max) {
                    longestStr = n < m ? str1.substring(j-max+1, i+1) : str2.substring(j-max+1, j+1);
                }
            }
        }
        return longestStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
//        String str1 = "ujlzfqqscymxyooumhfwuokwvjnkboqwbsjktburxsazwrjltmmnuxsigpvsusgpztxodwfhagyzxpocvmladimtzfwwgkbarhmjthuubccwzvkgadrnpcr";
//        String str2 = "qmuwdtbmltlciaxogzjjktzyegefnkezoouvhbxxtnnctihybsnchumrxysynyhciezgbwjzljuhpgiiuwouyevymbhwsopcyhyhswhmdpdqajvpgitqxczkfegrqhgxlvykbhymnjjpgufdxccjacnfzxmejzrkywwazfiyuwmfbifhllebzojlqlqgpamzwawpgjaatgnrfpmlmgvsnlhufmvzrjwhmdwhxxiksqbwqgkakivvahjntcswdyllwjtwdyspae";
            System.out.println(new Main().countLongCommonSubstring(str1, str2));
        }

    }

}
