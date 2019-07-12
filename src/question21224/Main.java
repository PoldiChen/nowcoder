package question21224;

import java.util.Scanner;

public class Main {

    public int countLastWordLength(String str) {
    	str = str.trim();
    	int result = 0;
    	int lastIndex = str.length()-1;
    	while (lastIndex > 0) {
    		char ch = str.charAt(lastIndex);
    		if (ch == ' ') {
    			return result;
			} else {
    			result ++;
    			lastIndex --;
			}
		}
    	return str.length();
    }

    public static void main(String[] args) {
    	String str = new Scanner(System.in).nextLine();
    	System.out.println(new Main().countLastWordLength(str));
	}

}

