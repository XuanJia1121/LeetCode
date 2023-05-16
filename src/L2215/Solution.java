package L2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * EASY
 * Find the Difference of Two Arrays
 * @author 2008017
 *
 */
public class Solution {
	
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for (int i : nums1) set1.add(i);
		for (int i : nums2) set2.add(i);
		
		List<List<Integer>> resultList = new ArrayList<>();       
		resultList.add(new ArrayList<>());
		resultList.add(new ArrayList<>());
		
		for (int i : set1) {
			if (!set2.contains(i)) resultList.get(0).add(i);
		}
		
		for (int i : set2) {
			if (!set1.contains(i)) resultList.get(1).add(i);
		}
		
		return resultList;
		
	}
	
}
