package L0509;

/***
 * EASY
 * Fibonacci Number
 * @author 2008017
 *
 */
public class Solution {
	
	public int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	
	public int fibDB(int n) {
		if (n == 0 || n == 1)
			return n;
		int[] array = new int [n + 1];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[n];
	}
	
}
