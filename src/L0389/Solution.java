package L0389;

/**
 * EASY
 * Find the Difference
 * @author 2008017
 *
 */
public class Solution {
	
	public char findTheDifference(String s, String t) {
		if (s == null || s.length() == 0) return t.charAt(0);
		int sum = 0;
		char[] arrt = t.toCharArray();
		int arrtlen = arrt.length;
		for (int i = 0; i < arrtlen; i++) {
			sum += arrt[i];
		}
		char[] arrs = s.toCharArray();
		int arrslen = arrs.length;
		for (int i = 0; i < arrslen; i++) {
			sum -= arrs[i];
		}
		return (char) sum;
	}
	
}
