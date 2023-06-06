package L1502;

import java.util.Arrays;

/***
 * EASY
 * Can Make Arithmetic Progression From Sequence
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int less = Integer.MIN_VALUE;
		for (int i = 0; i < len - 1; i++) {
			if (i == 0) {
				less = arr[i] - arr[i + 1];
				continue;
			}
			if (arr[i] - arr[i + 1] != less)
				return false;
		}
		return true;
    }
	
}
