package Sorting;

/***
 * 
 * @author 2008017
 *
 */
public class Testing {
	
	public static void main(String[] args) {
		int[] nums = new int[] {4,3,2,1};
		insertionSort(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	public static void bubbleSort(int[] nums) {
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
	
	public static void selectionSort(int[] arr) {
        int minIndex = 0; //紀錄最小值位置索引
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void insertionSort(final int[] array) {
	    for (int i = 1; i < array.length; ++i) {
	        final int temp = array[i];
	 
	        int j = i - 1;
	 
	        while (j >= 0 && temp < array[j]) {
	            array[j + 1] = array[j--];
	        }
	 
	        array[j + 1] = temp;
	    }
	}
	
	
}
