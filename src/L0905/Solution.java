package L0905;

/***
 * EASY
 * Sort Array By Parity
 * @author 2008017
 *
 */
public class Solution {
	
	public int[] sortArrayByParity(int[] nums) {
        if (nums.length <= 1) return nums;
        int start = 0;
        int end = nums.length-1;
        while (start != end && end > start) {
        	int left = nums[start];
        	int right = nums[end];
        	if (left % 2 == 1 && right % 2 == 0) {
        		int odd = nums[end];
        		nums[end--] = nums[start];
        		nums[start++] = odd;
        	} else if(left % 2 == 0) {
        		start++;
        	} else if (right % 2 == 1) {
        		end--;
        	}
        }
        return nums;
    }
	
}
