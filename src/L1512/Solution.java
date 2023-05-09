package L1512;

import java.util.HashMap;

/***
 * EASY
 * Number of Good Pairs
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		numIdenticalPairs(new int[] {1,2,3,1,1,3});
	}
	
	public static int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if (hs.containsKey(n)) {
                int k = hs.get(n);
                count += k;
                hs.put(n, k + 1);
            } else {
                hs.put(n, 1);
            }
        }
        return count;
	}
	
}
