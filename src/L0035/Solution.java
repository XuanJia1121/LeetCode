package L0035;

/***
 * EASY 
 * Search Insert Position
 * @author 2008017
 *
 */
public class Solution {

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int first = 0;
		int last = nums.length - 1;
		int mid = -1;
		while (first <= last) {
			mid = (first + last) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				last = mid - 1;
			}
			if (nums[mid] < target) {
				first = mid + 1;
			}
		}
		return first;
	}
	
}
