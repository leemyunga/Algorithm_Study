class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];
        int i = 0;
        
        for(String word : strlist){ 
			  answer[i] = word.length(); 
			  i++; 
		  }
        
        return answer;
    }
}