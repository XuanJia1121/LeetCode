package L0075;

/***
 * EASY
 * Sort Colors
 * @author 2008017
 *
 */
public class Solution {
	
	public void sortColors(int[] nums) {
		bubbleSort(nums);
	}
	
	public void bubbleSort(int[] nums) {
		boolean isChange = false;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					isChange = true;
				}
			}
			if (isChange) {
				isChange = false;
			} else {
				break;
			}
		}
	}
	
}
