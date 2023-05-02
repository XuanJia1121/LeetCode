package L1855;

/***
 * Medium
 * Maximum Distance Between a Pair of Values
 * @author 2008017
 *
 * [55,30,5,4,2], nums2 = [100,20,10,10,5] The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4), and (4,4) 
 * The maximum distance is 2 with pair (2,4).
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(maxDistance(new int[] {55,30,5,4,2},new int[] {100,20,10,10,5}));
	}
	
	public static int maxDistance(int[] nums1, int[] nums2) {
		int maxSize = 0;
		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				i++;
			} else {
				maxSize = Math.max(maxSize, j-i);
				j++;
			} 
		}
		return maxSize;
	}
	
	//Time Limit Exceeded
	public static int maxDistance_Fail(int[] nums1, int[] nums2) {
		int maxSize = 0; 
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0;j < nums2.length;j++) {
				if (nums1[i] > nums2[j] || i > j) continue;
				maxSize = Math.max(maxSize,j-i);
			}
		}
		return maxSize;
	}
	
}
