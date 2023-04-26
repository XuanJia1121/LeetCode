package L0026;

/***
 * EASY Remove Duplicates from Sorted Array
 * 
 * @author 2008017
 *
 */
public class Solution {

	public int removeDuplicates(int[] nums) {
		int index = 0;
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 && nums[i] == num) {
				index++;
			} else if (nums[i] != num) {
				num = nums[i];
				nums[index] = num;
				index++;
			}
		}
		return index;
	}

}
