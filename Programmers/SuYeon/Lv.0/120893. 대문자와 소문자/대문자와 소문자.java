class Solution {
    public String solution(String my_string) {
        String answer = "";
		
		StringBuilder sb = new StringBuilder();
		char[] list = my_string.toCharArray();
		
		for (int i = 0; i < list.length; i++) {
			if(Character.isUpperCase(list[i])) {
				sb.append(Character.toLowerCase(list[i]));
			}else {
				sb.append(Character.toUpperCase(list[i]));
			}
			
			answer = sb.toString();
		}
        
        return answer;
    }
}