package L0268;

import java.util.Arrays;

/***
 * EASY
 * Missing Number
 * @author 2008017
 *
 */
public class Solution {
	
	public int missingNumber(int[] nums) {
		int size = nums.length;
		Arrays.sort(nums);
		for (int i = size - 1; i >= 0; i--) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return 0;
	}
	
}
