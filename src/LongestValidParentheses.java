import java.util.Stack;

public class LongestValidParentheses {

	/*
	 * 
	 * 
	 * Given a string containing just the characters '(' and ')', find the length of
	 * the longest valid (well-formed) parentheses substring.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "(()" Output: 2 Explanation: The longest valid parentheses
	 * substring is "()".
	 * 
	 * Example 2:
	 * 
	 * Input: s = ")()())" Output: 4 Explanation: The longest valid parentheses
	 * substring is "()()".
	 * 
	 * Example 3:
	 * 
	 * Input: s = "" Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= s.length <= 3 * 104 s[i] is '(', or ')'.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()())"));

	}

	/*
	 * Initially push -1 on to stack When ( is encountered, push index to the stack
	 * 
	 * When ) is encountered, pop from the stack After pop, if stack is empty, push
	 * index on to the stack After pop, if stack is not empty, calculate max by
	 * subtracting top of stack from the index
	 * 
	 * 
	 */

	public static int longestValidParentheses(String s) {
		if (s == null || s == "") {
			return 0;
		}
		int max = 0;
		Stack<Integer> parens = new Stack();
		parens.push(-1);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				parens.push(i);
			} else if (c == ')') {
				parens.pop();
				if (parens.size() != 0) {
					int topMostElem = parens.get(parens.size() - 1);
					if (max < i - topMostElem) {
						max = i - topMostElem;
					}
				} else {
					parens.push(i);
				}
			}
		}
		return max;
	}

}
