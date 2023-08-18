class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
		char[] chaArr = rny_string.toCharArray();
		
		for (int i = 0; i < rny_string.length(); i++) {
			if(chaArr[i] == 'm') {
				answer +=  "rn";
			}else {
				answer += chaArr[i];
			}			
		}
        
        return answer;
    }
}