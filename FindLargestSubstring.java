import java.util.HashMap;

/**
 * @author Gurukannan
 *
 * @ProblemNote
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class FindLargestSubstring {
    public int lengthOfLargestSubstring(String s) {
    if (s == null || s.isEmpty()) {
        return 0;
    }

    int maxLength = 0;
    int start = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int end = 0; end < s.length(); end++){
        char currentChar = s.charAt(end);

        if (map.containsKey(currentChar)){
            start = Math.max(start,map.get(currentChar)+1);

        }
        map.put(currentChar,end);
        maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
}
    public static void main(String[] args) {
        FindLargestSubstring findLargestSubstring = new FindLargestSubstring();
        System.out.println(findLargestSubstring.lengthOfLargestSubstring("abcabcbb"));
    }
}
