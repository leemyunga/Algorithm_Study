class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] list = my_string.toCharArray();
        
        for (int i = 0; i < list.length; i++) {
        	int cnt = 0;
			while (cnt < n) {
				answer += list[i];
				cnt++;				
			}
		}
        
        return answer;
    }
}