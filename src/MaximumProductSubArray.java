
public class MaximumProductSubArray {

	/*
	 * 
	 * Given an integer array nums, find the contiguous subarray within an array
	 * (containing at least one number) which has the largest product.
	 * 
	 * Example 1:
	 * 
	 * Input: [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: [-2,0,-1] Output: 0 Explanation: The result cannot be 2, because
	 * [-2,-1] is not a subarray.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = new int[] { -3, -4, -5 };
		if (nums == null || nums.length == 0) {
			System.out.println(0);
		}
		if (nums.length == 1) {
			System.out.println(nums[0]);
		}

		int maxProd = nums[0];
		int maxFromPrev = nums[0];
		int minFromPrev = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int currentMax = Math.max(nums[i], Math.max(nums[i] * maxFromPrev, nums[i] * minFromPrev));
			int currentMin = Math.min(nums[i], Math.min(nums[i] * maxFromPrev, nums[i] * minFromPrev));
			maxFromPrev = currentMax;
			minFromPrev = currentMin;
			maxProd = Math.max(maxProd, Math.max(maxFromPrev, minFromPrev));
		}

	}

}
