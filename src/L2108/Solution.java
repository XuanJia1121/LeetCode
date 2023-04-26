package L2108;


/***
 * EASY
 * Find First Palindromic String in the Array
 * @author 2008017
 *
 */
public class Solution {
	
	public String firstPalindrome(String[] words) {
        for (String str : words) {
        	char[] cArray = str.toCharArray();
        	int start = 0;
        	int end = cArray.length - 1;
        	boolean allCheck = true;
        	while (start != end && end > start) {
        		if (cArray[start++] != cArray[end--]) {
        			allCheck = false;
        			break;
        		} 
        	}
        	if (allCheck) {
        		return str;
        	} else {
        		continue;
        	}
        }
        return "";
    }
	
}
