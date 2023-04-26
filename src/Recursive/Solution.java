package Recursive;

/***
 * EASY 遞廻基本題
 * 
 * @author 2008017
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println("test1:" + test1(8));
		System.out.println("test2:" + test2(4));
	}

	/**
	 * 1+2+...+n
	 */
	public static int test1(int num) {
		if (num == 1) {
			return 1;
		}
		return num + test1(num - 1);
	}

	/***
	 * 1+4+9+16+....+n*n
	 */
	public static int test2(int num) {
		if (num == 1) {
			return 1;
		}
		return num * num + test2(num - 1);
	}

}
