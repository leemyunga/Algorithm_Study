import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
		
		answer = IntStream.rangeClosed(start, end).toArray();
        
        return answer;
    }
}