package L0977;

/***
 * EASY
 * Squares of a Sorted Array
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		sortedSquares(new int[] {-4,-1,0,3,10});
	}
	
	public static int[] sortedSquares(int[] nums) {
        int[] rtn = new int[nums.length];
        int startPointer = 0;
        int endPointer = nums.length - 1;
        int index = endPointer;
        while (index >= 0) {
        	if (Math.abs(nums[startPointer]) < Math.abs(nums[endPointer])) {
        		rtn[index--] = Math.abs(nums[endPointer]*nums[endPointer]);
        		endPointer--;
        	} else {
        		rtn[index--] = Math.abs(nums[startPointer]*nums[startPointer]);
        		startPointer++;
        	}
        }
        return rtn;
    }
	
}
