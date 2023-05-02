package L0917;

/***
 * EASY
 * Reverse Only Letters
 * @author 2008017
 *
 */
public class Solution {
	
	public String reverseOnlyLetters(String s) {
		char[] array = s.toCharArray();
		int start = 0;
		int last = array.length - 1;
		while(last > start) {
			if (!valid(s.substring(start,start + 1))) {
				start++;
				continue;
			}
			if (!valid(s.substring(last,last + 1))) {
				last--;
				continue;
			}
			char tempStart = array[start];
			array[start++] = array[last];
			array[last--] = tempStart;
		}
		return new String(array);
	}
	
	public boolean valid(String s) {
		return s.matches("[a-z A-Z]");
	}
	
}
