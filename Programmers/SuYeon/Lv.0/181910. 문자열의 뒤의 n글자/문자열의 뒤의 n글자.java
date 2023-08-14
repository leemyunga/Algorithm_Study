class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
/*		
		char[] cha_str = my_string.toCharArray();		

        for(int i=my_string.length()-n; i<my_string.length(); i++){
        	answer += cha_str[i];
        }
*/        
        
        answer = my_string.substring(my_string.length()-n);
        
        return answer;
    }
}