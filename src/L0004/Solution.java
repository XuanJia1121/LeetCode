package L0004;

/***
 * Hard
 * Median of Two Sorted Arrays
 * @author 2008017
 *
 */
public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] rtn = new int[nums1.length + nums2.length];
		int len = rtn.length;
		int index1 = 0;
		int index2 = 0;
		int mainIndex = 0;
		while (index1 < nums1.length && index2 < nums2.length) {
			if (nums1[index1] <= nums2[index2]) {
				rtn[mainIndex++] = nums1[index1++];
			} else {
				rtn[mainIndex++] = nums2[index2++];
			}
		}
		if (index1 < nums1.length) {
			while (index1 < nums1.length) {
				rtn[mainIndex++] = nums1[index1++];
			}
		}
		if (index2 < nums2.length) {
			while (index2 < nums2.length) {
				rtn[mainIndex++] = nums2[index2++];
			}
		}
		if (len % 2 == 0) {
			return (double) (rtn[len/2] + rtn[len/2-1]) / 2;
		} else {
			return (double) rtn[len/2];
		}
	}
	
}
