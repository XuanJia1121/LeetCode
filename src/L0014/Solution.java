package L0014;

/***
 * EASY Longest Common Prefix
 * 
 * @author 2008017
 *
 */
public class Solution {

	public static void main(String[] args) {
		String[] strs = new String[] {"falower","fclow","flwaedr"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		String pre = strs[0];
		int index = 1;
		while (index < strs.length) {
			while (strs[index].indexOf(pre) != 0) {
				pre = pre.substring(0,pre.length() - 1);
			}
			index++;
		}
		return pre;
	}

}
