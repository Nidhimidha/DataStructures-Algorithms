
public class MergedSortedArray {

	/*
	 * 
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
	 * one sorted array.
	 * 
	 * The number of elements initialized in nums1 and nums2 are m and n
	 * respectively. You may assume that nums1 has enough space (size that is equal
	 * to m + n) to hold additional elements from nums2.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
	 * [1,2,2,3,5,6] 
	 * 
	 * Example 2:
	 * 
	 * Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= n, m <= 200 1 <= n + m <= 200 nums1.length == m + n nums2.length == n
	 * -109 <= nums1[i], nums2[i] <= 109
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		merge1(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
		merge2(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);

	}

	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		int[] returnArray = new int[nums1.length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < returnArray.length; k++) {
			if (nums1[i] <= nums2[j] && k <= m) {
				returnArray[k] = nums1[i];
				i++;
			} else {
				returnArray[k] = nums2[j];
				j++;
			}
		}
		nums1 = null;
		nums1 = new int[returnArray.length];
		for (int l = 0; l < returnArray.length; l++) {
			nums1[l] = returnArray[l];
		}
		System.out.println(nums1);
	}

	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		int index = nums1.length - 1;
		while (index >= 0) {
			if (m < 0) {
				nums1[index] = nums2[n];
				n--;
			} else if (n < 0) {
				nums1[index] = nums1[m];
				m--;
			} else if (nums1[m] < nums2[n]) {
				nums1[index] = nums2[n];
				n--;
			} else {
				nums1[index] = nums1[m--];
			}

			index--;
		}
		System.out.println(nums1);
	}
}
