class Solution {
    public int solution(int n) {
        int answer = 1;
		int slice = 6;
        
		while (slice%n != 0) {
			slice+=6;
			answer++;
		}
        
        return answer;
    }
}