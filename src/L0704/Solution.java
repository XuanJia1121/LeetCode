package L0704;

/***
 * EASY
 * Binary Search
 * @author 2008017
 *
 */
public class Solution {
	
	public int search_twoPointer(int[] nums, int target) {
		int start = 0;
		int last = nums.length - 1;
		while (last > start) {
			if (nums[start] == target) return start;
			if (nums[last] == target) return last;
			start++;
			last--;
		}
		if (nums[start] == target)return start;
		return -1;
    }
	
	public int search_Binary_Search(int[] nums, int target) {
		int start = 0;
		int last = nums.length - 1;
		while (start <= last) {
			int mid = (start + last) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (target > nums[mid]) {
				start = mid + 1;
			}
			if (target < nums[mid]) {
				last = mid - 1;
			}
		}
		return -1;
    }
	
}
