class Solution {
    public int solution(String num_str) {
        int answer = 0;
		
		char[] num = num_str.toCharArray();
		
		for (int i = 0; i < num.length; i++) {
			answer += Integer.parseInt(String.valueOf(num[i]));
		}
        
        return answer;
    }
}