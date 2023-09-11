import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answ = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                answ.add(numbers[i] + numbers[j]);
            }
        }
        
        answ = answ.stream().distinct().collect(Collectors.toList());
        
        int[] answer = new int[answ.size()];
        
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}