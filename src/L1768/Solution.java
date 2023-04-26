package L1768;

/***
 * EASY
 * Merge Strings Alternately
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(mergeAlternately("abcz","efg"));
	}
	
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
        int size1 = 0;
        int size2 = 0;
        while (size1 < word1.length() && size2 < word2.length()) {
        	sb.append(word1.substring(size1, ++size1));
        	sb.append(word2.substring(size2, ++size2));
        }
        if (size1 >= word1.length()) {
        	sb.append(word2.substring(size2));
        }
        if (size2 >= word2.length()) {
        	sb.append(word1.substring(size1));
        }
        return sb.toString();
    }
	
}
