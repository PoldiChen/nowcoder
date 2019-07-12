package question21229;

/**
 * @author poldi.chen
 * @className Main
 * @description TODO
 * @date 2019/7/6 10:57
 **/
public class Main {

    public String getResult(long ulDataInput) {
        String result = "";
        while (ulDataInput > 1) {
            for (int i = 2; i < ulDataInput; i++) {
                if (ulDataInput % i == 0) {
                    result = result + i + " ";
                    ulDataInput = ulDataInput / i;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long number = 100;
        System.out.println(new Main().getResult(number));
    }
}
