import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
		
		char[] char_be = before.toCharArray();
		char[] char_af = after.toCharArray();
		
		Arrays.sort(char_be);
		Arrays.sort(char_af);
		
		before = String.valueOf(char_be);
		after = String.valueOf(char_af);
		
		if(before.equals(after)) {
			answer = 1;
		}else {
			answer = 0;
		}
		
        return answer;
    }
}