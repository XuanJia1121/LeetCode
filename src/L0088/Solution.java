package L0088;
 
/***
 * EASY
 * Merge Sorted Array  Two Pointer
 * @author 2008017
 *
 */
public class Solution {

	public static void main(String[] args) {
		
		merge(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
		
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int point = m + n - 1;
		while(m > 0 && n > 0) {
			if (nums1[m - 1] < nums2[n - 1]) {
				nums1[point--] = nums2[--n];
			} else {
				nums1[point--] = nums1[--m];
			}
		}
		if (m == 0) {
			for (int i = n - 1; i >= 0; i--) {
				nums1[point--] = nums2[i];
			}
		} 
    }
	
	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		for (int point = m + n - 1, a1 = m - 1, a2 = n - 1; a2 >= 0; point--) {
			if (a1 >= 0 && nums1[a1] > nums2[a2]) {
				nums1[point] = nums1[a1--];
			} else {
				nums1[point] = nums2[a2--];
			}
		}
	}
	
}
