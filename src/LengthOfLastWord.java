
public class LengthOfLastWord {

	/*
	 * 
	 * 
	 * Given a string s consists of some words separated by spaces, return the
	 * length of the last word in the string. If the last word does not exist,
	 * return 0.
	 * 
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "Hello World" Output: 5 
	 * 
	 * Example 2:
	 * 
	 * Input: s = " " Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of only English letters and spaces ' '.
	 */

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));

	}

	public static int lengthOfLastWord(String s) {
		if (s == null) {
			return 0;
		}
		String[] arr = s.split("\\s");
		if (arr != null && arr.length != 0 && arr[arr.length - 1] != null) {
			String a = arr[arr.length - 1];
			return a.length();
		} else {
			return 0;
		}
	}

}
