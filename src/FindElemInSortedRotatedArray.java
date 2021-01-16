
public class FindElemInSortedRotatedArray {

	/*
	 * 
	 * 
	 * You are given an integer array nums sorted in ascending order (with distinct
	 * values), and an integer target.
	 * 
	 * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e.,
	 * [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	 * 
	 * If target is found in the array return its index, otherwise, return -1.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1], target = 0 Output: -1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 5000 -104 <= nums[i] <= 104 All values of nums are
	 * unique. nums is guaranteed to be rotated at some pivot. -104 <= target <= 104
	 */

	
	public static void main(String[] args) {
		System.out.println(search(new int[] { 5, 1, 3, 4 }, 5));

	}

	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int middle = left + (right - left) / 2;

			if (middle != 0 && nums[middle] < nums[middle - 1]) {
				start = middle;
				break;
			} else if (nums[left] <= nums[middle] && nums[middle] > nums[right]) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
			start = left;
		}

		left = 0;
		right = nums.length - 1;

		while (left <= right) {
			if (target == nums[start]) {
				return start;
			} else if (start != 0 && nums[left] <= target && target <= nums[start - 1]) {
				start = start - 1;
			} else if (target > nums[start] && target <= nums[right]) {
				start = start + 1;
			} else {
				return -1;
			}
		}
		return -1;

	}
}
