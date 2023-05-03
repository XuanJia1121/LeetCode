package L2540;

/***
 * EASY
 * Minimum Common Value
 * @author 2008017
 *
 */
public class Solution {
	
	public int getCommon(int[] nums1, int[] nums2) {
		int p1 = 0;
		int p2 = 0;
		while (p1 < nums1.length && p2 < nums2.length) {
			if (nums1[p1] == nums2[p2]) return nums1[p1];
			if (nums1[p1] > nums2[p2]) {
				p2++;
				continue;
			}
			if (nums1[p1] < nums2[p2]) {
				p1++;
				continue;
			}
		}
		return -1;
	}
	
}
