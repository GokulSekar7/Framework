package javaChallengeQnA;

import java.util.ArrayList;
import java.util.List;

//Given a string array words, 
//return an array of all characters that show up in all strings within the words (including duplicates). 
//You may return the answer in any order.
//		 
//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]

public class Program19 {

	public static void main(String[] args) {

		String[] words = { "bella", "label", "roller" };
		String[] words_ = { "cool", "lock", "cook" };

		Program19 find = new Program19();
		find.findCharacters(words);
		find.findCharacters(words_);

	}

	public void findCharacters(String[] words) {

		List<String> stringList = new ArrayList<String>();

		if (words.length > 1) {
			String firstWord = words[0];

			for (int j = 0; j < firstWord.length(); j++) {
				char currentChar = firstWord.charAt(j);
				boolean isCommon = true;

				for (int i = 1; i < words.length; i++) {
					if (words[i].contains(String.valueOf(currentChar))) {
						words[i] = words[i].replaceFirst(String.valueOf(currentChar), "");
					} else {
						isCommon = false;
						break;
					}
				}

				if (isCommon) {
					stringList.add(String.valueOf(currentChar));
				}
			}
		}

		System.out.println(stringList);
	}

}
