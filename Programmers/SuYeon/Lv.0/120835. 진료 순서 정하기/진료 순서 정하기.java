import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
        int[] emergency2 = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(emergency2);        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < emergency2.length; i++) {
			list.add(emergency2[i]);
		}
        Collections.reverse(list);
        
        for (int i = 0; i < emergency.length; i++) {
    		answer[i] = list.indexOf(emergency[i])+1;
		}
        
        return answer;
    }
}