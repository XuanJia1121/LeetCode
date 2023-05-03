package L2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * EASY
 * Find Target Indices After Sorting Array
 * @author 2008017
 *
 */
public class Solution {
	
	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
			}
		}
		return list;
	}
	
}
