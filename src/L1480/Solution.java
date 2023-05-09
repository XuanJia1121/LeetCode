package L1480;

/***
 * EASY
 * Running Sum of 1d Array
 * @author 2008017
 *
 */
public class Solution {
	
	public int[] runningSum(int[] nums) {
		if (nums == null || nums.length == 0) return nums;
		int last = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] += last;
			last = nums[i];
		}
		return nums;
    }
	
}
