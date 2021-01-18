
public class NextPermutation {

	public static void main(String[] args) {
		nextPermutation(new int[] { 6, 2, 1, 5, 4, 3, 0 });

	}

	public static void nextPermutation(int[] nums) {
		// {6,2,1,5,4,3,0} idea here is starting from n-1 to k where k is the first
		// number which doesn't follow descending order. hence, we find 1
		// now we have to find l, where l is the least number larger than k in the range
		// of n-1 to k+1. which is 3.
		// replace k will l. hence replace 1 with 3. new array => {6,2,3,5,4,1,0}
		// next step is reversing the portion of array that falls in range k+1 to n-1,
		// after which array is {6,2,3,0,1,4,5} which is the next permutation.

		if (nums == null || nums.length == 0) {
			return;
		}
		int k = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				k = i;
				break;
			}
		}
		if (k != nums.length - 1) {
			int l = k;
			for (int i = nums.length - 1; i > k; i--) {
				if (nums[i] > nums[k]) {
					l = i;
					break;
				}
			}
			int temp = nums[l];
			nums[l] = nums[k];
			nums[k] = temp;
		} else {
			k = -1;
		}
		for (int i = nums.length - 1; i > k; i--) {
			int temp1 = nums[i];
			nums[i] = nums[k + 1];
			nums[k + 1] = temp1;
			k++;
		}

		System.out.println(nums);
	}

}
