class Solution {
    public String solution(String my_string, int n) {
      char [] answerArr = new char[my_string.toCharArray().length*n];
		
		for (int i = 0; i < answerArr.length;) {
			for (int j=0; j<my_string.toCharArray().length;j++) {
				for(int k=1; k<=n; k++) {
					answerArr[i]=my_string.toCharArray()[j];
					i++;
				}
			}	
		}
		
		String answer = String.valueOf(answerArr);
        return answer;
    }
}