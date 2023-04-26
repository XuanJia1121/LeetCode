package L1332;

/***
 * EASY
 * Remove Palindromic Subsequences
 * @author 2008017
 *
 */

//Input: s = "ababa"
//Output: 1
//Explanation: s is already a palindrome, so its entirety can be removed in a single step.

public class Solution {
	
	public int removePalindromeSub(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start++) != s.charAt(end--)) {
				return 2;
			}
		}
		return 1;
    }
	
}
