package L2000;

/***
 * EASY
 * Reverse Prefix of Word
 * @author 2008017
 *
 */
public class Solution {
	
	
	public String reversePrefix(String word, char ch) {
		int index = 0;
		char[] cArray = word.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] == ch) {
				index = i;
				break;
			}
		}
		return reverse(cArray,index);
	}
	
	public String reverse(char[] cArray,int index) {
		for (int s = 0, e = index; s != e && e > s; s++, e--) {
			char temp = cArray[e];
			cArray[e] = cArray[s];
			cArray[s] = temp;
		}
		return new String(cArray);
	}
	
}
