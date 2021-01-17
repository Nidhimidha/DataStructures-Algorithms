import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	/*
	 * 
	 * 
	 * Given n pairs of parentheses, write a function to generate all combinations
	 * of well-formed parentheses.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: n = 3 Output: ["((()))","(()())","(())()","()(())","()()()"] 
	 * 
	 * Example
	 * 2:
	 * 
	 * Input: n = 1 Output: ["()"]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= n <= 8
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> generateParenthesis(int n) {
		List<String> combination = new ArrayList<String>();
		generate(combination, n, "", 0, 0);
		return combination;
	}

	public void generate(List<String> combination, int max, String current_val, int numberOfOpen, int numberOfClose) {
		if (current_val.length() == max * 2) {
			combination.add(current_val);
			return;
		}

		if (numberOfOpen < max) {
			generate(combination, max, current_val + '(', numberOfOpen + 1, numberOfClose);
		}
		if (numberOfClose < numberOfOpen) {
			generate(combination, max, current_val + ')', numberOfOpen, numberOfClose + 1);
		}

	}

}
