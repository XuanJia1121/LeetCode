package L2418;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * EASY
 * Sort the People
 * @author 2008017
 *
 */
public class Solution {
	
	public String[] sortPeople(String[] names, int[] heights) {
		int index = 0;
		Map<Integer, String> map = new HashMap<>();
		while (index < names.length) {
			map.put(heights[index], names[index]);
			index++;
		}
		Arrays.sort(heights);
		String[] rtn = new String[names.length];
		index = 0;
		for (int i = heights.length - 1; i >= 0; i--) {
			rtn[index++] = map.get(heights[i]);
		}
		return rtn;
	}
	
}
