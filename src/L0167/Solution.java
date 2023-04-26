package L0167;

/***
 * Medium 
 * Two Sum II - Input array is sorted
 * @author 2008017
 *
 */
public class Solution {

	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		while (left != right) {
			int sum = numbers[left] + numbers[right];
			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				break;
			}
		}
		return new int[] { left + 1, right + 1 };
	}

}
