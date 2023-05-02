package L0763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * Medium
 * Partition Labels
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(partitionLabels("abcdafeefezzzxx").toString());
	}
	
	public static List<Integer> partitionLabels(String s) {
		List<Integer> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		int start = 0;
		int last = 0;
		for (int i = 0; i < s.length(); i++) {
			last = Math.max(last, map.get(s.charAt(i)));
			if (i == last) {
				list.add(last - start + 1);
				start = last + 1;
			}
		}
		return list;
	}
	
}
