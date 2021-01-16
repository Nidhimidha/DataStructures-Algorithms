
public class MaximumSumSubArray {

	/*
	 * 
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has
	 * the largest sum = 6. 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1] Output: 1 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [0] Output: 0 
	 * 
	 * Example 4:
	 * 
	 * Input: nums = [-1] Output: -1 
	 * 
	 * Example 5:
	 * 
	 * Input: nums = [-100000] Output: -100000
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 3 * 104 -105 <= nums[i] <= 105
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 5, 7, -3, -5 };
		if (nums == null || nums.length == 0) {
			System.out.println(0);
		}
		if (nums.length == 1) {
			System.out.println(nums[0]);
		}

		int maxSum = nums[0];
		int maxFromPrev = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxFromPrev = Math.max(nums[i], nums[i] + maxFromPrev);

			maxSum = Math.max(maxSum, maxFromPrev);
		}
		System.out.println(maxSum);
	}

}
