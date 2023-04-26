package L0053;

/***
 * EASY Maximum Subarray
 * 
 * @author 2008017
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(f(7));
	}

	public static int f(int num) {
		if (num == 1)
			return 1;
		return num + f(num - 1);
	}

}
