import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWordInSentence {

	public static void main(String[] args) {
		mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit" });

	}

	public static void mostCommonWord(String paragraph, String[] banned) {
		Map<String, Integer> words = new HashMap<String, Integer>();
		Set<String> bannedWords = new HashSet<String>();
		for (String word : banned) {
			bannedWords.add(word);
		}

		for (String word : paragraph.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase().split(" ")) {
			if (!bannedWords.contains(word)) {
				words.put(word, words.getOrDefault(word, 0) + 1); // if word exists, add 1 to the index it has, else 0
																	// is the default index to that word, and add 1 to
																	// it
			}
		}
		
		String result="";
		for (String word: words.keySet()) {
			if(result.equals("") || words.get(word)>words.get(result)) {
				result = word;
			}
		}
		System.out.println(result);
	}

}
