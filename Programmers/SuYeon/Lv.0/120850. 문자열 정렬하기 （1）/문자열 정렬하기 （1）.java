import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
		
		String intStr = my_string.replaceAll("[^\\d]", "");
		answer = new int[intStr.length()];
		
		for (int i = 0; i < intStr.length(); i++) {
			answer[i] = intStr.charAt(i) - '0';
		}

        Arrays.sort(answer);
		
        return answer;
    }
}