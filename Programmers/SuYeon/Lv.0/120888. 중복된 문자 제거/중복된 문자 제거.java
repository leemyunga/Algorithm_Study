import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
		Set<Character> set = new HashSet<Character>();
		
		for (Character word : my_string.toCharArray()) {
			if(set.add(word)) {
				answer += Character.toString(word);
			}
		}
        
        return answer;
    }
}