class Solution {
    public int solution(int num, int k) {
        int answer = 0;		
		
		String num_string = String.valueOf(num);
		String k_string = String.valueOf(k);
		
		if(num_string.indexOf(k_string) == -1) {
			answer = -1;
		}else {
			answer = num_string.indexOf(k_string) + 1;
		}
		
        return answer;
    }
}