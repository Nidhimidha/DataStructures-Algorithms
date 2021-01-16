import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	/*
	 * 
	 * 
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "()" Output: true 
	 * 
	 * Example 2:
	 * 
	 * Input: s = "()[]{}" Output: true 
	 * 
	 * Example 3:
	 * 
	 * Input: s = "(]" Output: false 
	 * 
	 * Example 4:
	 * 
	 * Input: s = "([)]" Output: false 
	 * 
	 * Example 5:
	 * 
	 * Input: s = "{[]}" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static HashMap<Character, Character> mappings;

	public ValidParenthesis() {
		mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0)
			return false;
		Stack<Character> openings = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mappings.containsKey(c)) {
				char topElement = openings.empty() ? '#' : openings.pop();
				if (topElement != mappings.get(c)) {
					return false;
				}
			} else {
				openings.push(c);
			}
		}
		return openings.isEmpty();
	}

}
