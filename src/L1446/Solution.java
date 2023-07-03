package L1446;

/***
 * EASY
 * Consecutive Characters
 * @author 2008017
 *
 */
public class Solution {
	
	public int maxPower(String s) {
		int len = s.toCharArray().length;
		char c = s.charAt(0);
		int strLen = 0;
		int strLenTemp = 0;
		for (int i = 0; i < len; i++) {
			if (c == s.charAt(i)) {
				strLenTemp++;
			} else {
				strLenTemp = 1;
				c = s.charAt(i);
			}
			strLen = Math.max(strLen,strLenTemp);
		}
		return strLen;
	}
	
}
