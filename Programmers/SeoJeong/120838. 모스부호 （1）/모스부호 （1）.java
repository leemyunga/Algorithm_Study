class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] list = letter.split(" ");
        
        for (String word : list) {
			for (int i = 0; i < morse.length; i++) {
				if(word.equals(morse[i])) {
					answer += Character.toString(i+'a');
				}
			}
		}
        
        return answer;
    }
}