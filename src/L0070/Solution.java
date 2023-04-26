package L0070;

/***
 * EASY
 * Climbing Stairs
 * @author 2008017
 *
 */
public class Solution {
	
	public int climbStairs(int n) {
		if (n == 1 || n == 2)
			return n;
		int[] rtn = new int[n + 1];
		rtn[0] = 1;
		rtn[1] = 2;
		for (int i = 2;i <= n - 1;i++) {
			rtn[i] = rtn[i - 1] + rtn[i - 2];
		}
		return rtn[n - 1];
	}
	
}
