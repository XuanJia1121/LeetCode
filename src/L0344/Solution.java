package L0344;

/***
 * EASY
 * Reverse String
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		reverseString("hannah".toCharArray());
	}
	
	public static void reverseString(char[] s) {
        int start = 0;
        int end =  s.length - 1;
        while (start != end && end > start) {
        	char sc = s[start];
        	char ec = s[end];
        	s[start++] = ec;
        	s[end--] = sc;
        }
    }
	
}
