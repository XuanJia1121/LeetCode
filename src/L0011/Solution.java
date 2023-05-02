package L0011;

/***
 * Medium
 * Container With Most Water
 * @author 2008017
 *
 */
public class Solution {
	
	public int maxArea(int[] height) {
		int maxSize = 0;
		int left = 0;
		int right = height.length - 1;
		while (right > left) {
			int size = (right - left) * Math.min(height[left], height[right]);
			maxSize = Math.max(maxSize, size);
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxSize;
	}
	
}
