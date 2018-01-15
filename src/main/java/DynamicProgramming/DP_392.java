package DynamicProgramming;

/**
Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.
 * @author superball
 * @time 2018年1月16日上午12:03:23
 */
public class DP_392 {
	public static void main(String[] args) {
		DP_392 main = new DP_392();
		System.out.println(main.isSubsequence("ab", "eeaeeebe"));
	}

	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		int i = t.indexOf((s.charAt(0)));
		if (i < 0) {
			return false;
		}
		return isSubsequence(s.substring(1, s.length()), t.substring(i + 1, t.length()));
	}
}
