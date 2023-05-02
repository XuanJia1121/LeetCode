package L0345;

/***
 * 
 * EASY
 * Reverse Vowels of a String
 * @author 2008017
 *
 */
public class Solution {
	
	public String reverseVowels(String s) {
		char[] array = s.toCharArray();
		int start = 0;
		int last = array.length - 1;
		while (last > start) {
			if (!valid(s.substring(start,start+1))) {
				start++;
				continue;
			}
			if (!valid(s.substring(last,last+1))) {
				last--;
				continue;
			}
			char tempStart = array[start];
			array[start++] = array[last];
			array[last--] = tempStart;
		}
		return new String(array);
    }
	
	public boolean valid(String c) {
		if (c.equalsIgnoreCase("a")|| c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) {
			return true;
		} else {
			return false;
		}
	}
	
}
