package L1929;

/***
 * EASY
 * Concatenation of Array
 * @author 2008017
 *
 */
public class Solution {
	
	public int[] getConcatenation(int[] nums) {
		if (nums == null || nums.length == 0)
			return nums;
		int len = nums.length;
		int[] rtn = new int[len * 2];
		for (int i = 0; i < len; i++) {
			rtn[i] = nums[i];
			rtn[i+len] = nums[i];
		}
		return rtn;
	}
	
}
