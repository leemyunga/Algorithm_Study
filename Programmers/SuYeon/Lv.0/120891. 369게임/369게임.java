import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
		
		int[] list = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] == 3 | list[i] == 6 | list[i] == 9) {
				answer++;
			}
		}
        
        return answer;
    }
}