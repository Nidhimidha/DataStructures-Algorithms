import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	// Problem:
	// Given an array nums of n integers, are there elements a, b, c in nums 
	// such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
	// Notice that the solution set must not contain duplicate triplets.

	/*
	 * Example 1:
	 * 
	 * Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]] Example 2:
	 * 
	 * Input: nums = [] Output: [] Example 3:
	 * 
	 * Input: nums = [0] Output: []
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= nums.length <= 3000 -105 <= nums[i] <= 105
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(arr);
		for (List<Integer> obj : result) {
			for (Integer innerObj : obj) {
				System.out.print(innerObj + ",");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums); // -4,-1,-1,0,1,2
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				if (nums[i] + nums[j] + nums[k] > 0) {
					k--;
				} else if (nums[i] + nums[j] + nums[k] < 0) {
					j++;
				} else if (nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> obj = new ArrayList<Integer>();
					obj.add(nums[i]);
					obj.add(nums[j]);
					obj.add(nums[k]);
					result.add(obj);
					j++;
					k--;
				}
			}
		}
		return result;
	}
}
