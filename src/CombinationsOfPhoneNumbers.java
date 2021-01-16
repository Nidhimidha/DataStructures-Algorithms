import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationsOfPhoneNumbers {

	/*
	 * 
	 *
	 * Given a string containing digits from 2-9 inclusive, return all possible
	 * letter combinations that the number could represent. Return the answer in any
	 * order.
	 * 
	 * A mapping of digit to letters (just like on the telephone buttons) is given
	 * below. Note that 1 does not map to any letters.
	 * 
	 * Example 1:
	 * 
	 * Input: digits = "23" Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
	 * 
	 * Example 2:
	 * 
	 * Input: digits = "" Output: [] 
	 * 
	 * Example 3:
	 * 
	 * Input: digits = "2" Output: ["a","b","c"]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= digits.length <= 4 digits[i] is a digit in the range ['2', '9'].
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		letterCombinations("567");

	}

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if (digits == null || digits.length() == 0) {
			return result;
		}
		Map<Integer, List<Character>> letters = new HashMap<Integer, List<Character>>();
		letters.put(2, new ArrayList<Character>(Arrays.asList('a', 'b', 'c')));
		letters.put(3, new ArrayList<Character>(Arrays.asList('d', 'e', 'f')));
		letters.put(4, new ArrayList<Character>(Arrays.asList('g', 'h', 'i')));
		letters.put(5, new ArrayList<Character>(Arrays.asList('j', 'k', 'l')));
		letters.put(6, new ArrayList<Character>(Arrays.asList('m', 'n', 'o')));
		letters.put(7, new ArrayList<Character>(Arrays.asList('p', 'q', 'r', 's')));
		letters.put(8, new ArrayList<Character>(Arrays.asList('t', 'u', 'v')));
		letters.put(9, new ArrayList<Character>(Arrays.asList('w', 'x', 'y', 'z')));

		getRecursiveCombinations(result, digits, letters, "", 0);
		return result;

	}

	public static void getRecursiveCombinations(List<String> result, String digits,
			Map<Integer, List<Character>> letters, String current, int index) {
		if (index == digits.length()) {
			result.add(current);
			System.out.println(result);
			return;
		}

		List mapping = letters.get(digits.charAt(index) - '0');
		for (int i = 0; i < mapping.size(); i++) {
			getRecursiveCombinations(result, digits, letters, current + mapping.get(i), index + 1);
		}
	}
}
