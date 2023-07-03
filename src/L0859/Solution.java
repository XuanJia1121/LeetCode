package L0859;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * EASY
 * Buddy Strings
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length()) return false; 
		char[] arr = s.toCharArray();
		if (s.equals(goal)) {
			Set<Character> set = new HashSet<>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			return set.size() < arr.length;
		}
		List<Integer> dif = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != goal.charAt(i)) {
				dif.add(i);
			}
		}
		return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1)) && s.charAt(dif.get(1)) == goal.charAt(dif.get(0));
    }
	
}
