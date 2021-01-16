
public class SmallestMissingPositiveNumber {

	/*
	 * Given an unsorted integer array nums, find the smallest missing positive
	 * integer.
	 * 
	 * Follow up: Could you implement an algorithm that runs in O(n) time and uses
	 * constant extra space.?
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,0] Output: 3 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,4,-1,1] Output: 2 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [7,8,9,11,12] Output: 1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= nums.length <= 300 -231 <= nums[i] <= 231 - 1
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] { 9, 7, -1 }));

	}

	public static int firstMissingPositive(int[] nums) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			int swapIndex = nums[i] - 1;
			while (nums[i] > 0 && nums[i] <= length && nums[i] != nums[swapIndex]) {

				int temp = nums[i];
				nums[i] = nums[swapIndex];
				nums[swapIndex] = temp;

				swapIndex = nums[i] - 1;
			}
		}

		for (int i = 0; i < length; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return length + 1;
	}

}
