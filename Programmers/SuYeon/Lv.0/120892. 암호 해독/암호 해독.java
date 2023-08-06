class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        char[] list = cipher.toCharArray();
		
		for (int i = code-1; i < list.length; i = i+code) {
			answer += Character.toString(list[i]); 
		}
        
        return answer;
    }
}