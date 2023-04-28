package L0541;

/***
 * EASY
 * Reverse String II
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(reverseStrRe("abcdefg",1));
	}
	
	public static String reverseStrRe(String s, int k) {
		if (s.length() >= 2 * k) {
			String temp = s.substring(0, k);
			return new StringBuilder(temp).reverse().toString() + s.substring(k, 2 * k) + reverseStrRe(s.substring(2 * k),k);
		} else {
			if (s.length() >= k) {
				String temp = s.substring(0, k);
				return new StringBuilder(temp).reverse().toString() + s.substring(k);
			} else {
				return new StringBuilder(s).reverse().toString();
			}
		}
	}
	
	public String reverseStr(String s, int k) {
		int end = s.length() - 1;
		int index = 0;
		StringBuilder rtn = new StringBuilder();
		while (index <= end) {
			if (end - index + 1 >= 2 * k) {
				rtn.append(reverse(s.substring(index,index + 2 * k),k));
				index += 2 * k;
			} else {
				rtn.append(reverse(s.substring(index,s.length()),k));
				break;
			}
		}
		return rtn.toString();
	}
	
	public String reverse(String s,int k) {
		int start = 0;
		int end = k > s.length() ? s.length() - 1 : k - 1;
		char[] arr = s.toCharArray();
		while (end > start) {
			char temp = arr[end];
			arr[end--] = arr[start];
			arr[start++] = temp;
		}
		return new String(arr);
	}
	
}
