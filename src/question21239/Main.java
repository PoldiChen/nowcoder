package question21239;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/7 20:16
 **/
public class Main {

    public int knapsack() {
        int[] w = {2, 3, 4, 5, 9};
        int[] v = {3, 4, 5, 8, 10};
//        int weight = 20;
        int[][] b = new int[6][21];

//        for (int i = 0; i < 5; i++) {
//            b[i][0] = 0;
//        }
//
//        for (int j = 0; j < 20; j++) {
//            b[0][j] = 0;
//        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <21; j++) {
                if (w[i-1] > j) {
                    b[i][j] = b[i-1][j];
                } else {
                    int value1 = b[i-1][j-w[i-1]] + v[i-1];
                    int value2 = b[i-1][j];
                    if (value1 > value2) {
                        b[i][j] = value1;
                    } else {
                        b[i][j] = value2;
                    }
                }
            }
        }

        return b[5][20];
    }

    public static void main(String[] args) {
        System.out.println(new Main().knapsack());
    }

}
