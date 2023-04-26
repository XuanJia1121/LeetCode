package L0001;

import java.util.HashMap;
import java.util.Map;

/***
 * EASY
 * Two Sum
 * @author 2008017
 *
 */
public class Solution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int less = target - nums[i];
			if (map.containsKey(less)) {
				return new int[] {map.get(less),i};
			} else {
				map.put(nums[i], i);
			}
		}
		return null;
	}

}
