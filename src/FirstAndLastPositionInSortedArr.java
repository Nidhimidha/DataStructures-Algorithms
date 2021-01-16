
public class FirstAndLastPositionInSortedArr {

	/*
	 * 
	 * 
	 * Given an array of integers nums sorted in ascending order, find the starting
	 * and ending position of a given target value.
	 * 
	 * If target is not found in the array, return [-1, -1].
	 * 
	 * Follow up: Could you write an algorithm with O(log n) runtime complexity?
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1] 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [], target = 0 Output: [-1,-1]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= nums.length <= 105 -109 <= nums[i] <= 109 nums is a non-decreasing
	 * array. -109 <= target <= 109
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(searchRange(new int[] { 5, 7, 7, 8, 8, 8, 8, 8, 10 }, 8));

	}

	public static int[] searchRange(int[] nums, int target) {
		int result[] = new int[2];
		result[0] = findLeftIndex(nums, target);
		result[1] = findRightIndex(nums, target);
		return result;
	}

	static int findLeftIndex(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int index = -1;
		while (left <= right) {
			int midpoint = left + (right - left) / 2;
			if (nums[midpoint] >= target) {
				right = midpoint - 1;
			} else {
				left = midpoint + 1;
			}
			if (nums[midpoint] == target) {
				index = midpoint;
			}
		}
		return index;
	}

	static int findRightIndex(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int index = -1;
		while (left <= right) {
			int midpoint = left + (right - left) / 2;
			if (nums[midpoint] <= target) {
				left = midpoint + 1;
			} else {
				right = right - 1;
			}
			if (nums[midpoint] == target) {
				index = midpoint;
			}
		}
		return index;
	}

}
