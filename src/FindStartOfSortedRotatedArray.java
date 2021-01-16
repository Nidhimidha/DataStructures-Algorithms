
public class FindStartOfSortedRotatedArray {

	/*
	 * 
	 * 
	 * You are given an integer array nums sorted in ascending order (with distinct
	 * values), and an integer target.
	 * 
	 * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e.,
	 * [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	 * 
	 * Find the index where that rotated array begins
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], Output: 4 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1],  Output: 1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 5000 -104 <= nums[i] <= 104 All values of nums are
	 * unique. nums is guaranteed to be rotated at some pivot. 
	 */
	
	
	public static void main(String[] args) {
		System.out.println(search(new int[] {4,5,6,7,0,1,2},0));

	}

    public static  int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<right) {
        	int middle = left + (right-left)/2;
        	
        	if (middle > 0 && nums[middle]<nums[middle-1]) {
        		return nums[middle];
        	} else if (nums[left]<=nums[middle] && nums[middle]> nums[right]) {
        		left = middle+1;
        	} else {
        		right = middle -1;
        	}
        }
        return nums[left];
        
    }
}
