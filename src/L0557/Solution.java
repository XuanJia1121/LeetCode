package L0557;


/***
 * EASY
 * Reverse Words in a String III
 * @author 2008017
 *
 */
public class Solution {
	
	public String reverseWords(String s) {
        String[] sarray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < sarray.length;i++) {
        	char[] cArray = sarray[i].toCharArray();
        	int size = cArray.length -1;
        	while (size >= 0) {
        		sb.append(cArray[size--]);
        	}
        	if (i != sarray.length -1) {
        		sb.append(" ");
        	}
        }
        return sb.toString();
    }
	
}
