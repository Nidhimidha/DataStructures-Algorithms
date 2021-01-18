import java.util.ArrayList;
import java.util.List;

public class PermutationsOfListVals {

	/*
	 * 
	 * Given an array nums of distinct integers, return all the possible
	 * permutations. You can return the answer in any order.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3] Output:
	 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]] 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [0,1] Output: [[0,1],[1,0]] 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1] Output: [[1]]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 6 -10 <= nums[i] <= 10 All the integers of nums are
	 * unique.
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(permute(new int[] { 1, 2, 3 }));

	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) {
			return res;
		}
		boolean[] used = new boolean[nums.length];
		List<Integer> permutation = new ArrayList();
		helper(nums, res, permutation, used);
		return res;

	}

	private static void helper(int[] nums, List<List<Integer>> res, List<Integer> permutation, boolean[] used) {
		if (permutation.size() == nums.length) {
			res.add(new ArrayList<>(permutation));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			permutation.add(nums[i]);
			helper(nums, res, permutation, used);
			permutation.remove(permutation.size() - 1); // need to remove the number already added to the permutation
			used[i] = false;
		}

	}

}
