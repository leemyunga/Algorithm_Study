import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        
        for(int i = 2; i <= n;){
        	if(n%i==0){
        		map.put(i, i);
        		n/=i; 
        	}
        	else {
        		i++;
        	}
        }
        
        answer = new int[map.size()];
        for(Integer i : map.keySet()){
        	answer[index] = map.get(i);
        	index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}