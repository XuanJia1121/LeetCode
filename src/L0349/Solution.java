package L0349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * EASY
 * Intersection of Two Arrays
 * @author 2008017
 *
 */

//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.

public class Solution {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int num : nums2) {
			if (set.contains(num) && (!list.contains(num)))
				list.add(num);
		}
		int[] rtn = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			rtn[i] = list.get(i);
		}
		return rtn;
	}
	
}
