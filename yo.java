import java.util.ArrayList;
import java.util.List;

// Time complexity is O(N)
// Space complexity is O(1)
// This solution is submitted on leetcode

public class BigN81LetterCasePermutation {
	class Solution {
		public List<String> letterCasePermutation(String S) {
			List<String> result = new ArrayList<>();
			if (S == null || S.length() == 0) {
				result.add("");
				return result;
			}

			List<String> fin = letterCasePermutation(S.substring(1));
			for (String str : fin) {
				if (Character.isLetter(S.charAt(0))) {
					result.add(S.substring(0, 1).toLowerCase() + str);
					result.add(S.substring(0, 1).toUpperCase() + str);
				} else {
					result.add(S.substring(0, 1) + str);
				}
			}
			return result;
		}
	}
}