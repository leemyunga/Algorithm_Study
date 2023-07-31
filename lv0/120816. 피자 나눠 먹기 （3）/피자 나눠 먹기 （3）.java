class Solution {
    public int solution(int slice, int n) {
    	 int answer = 1;
    	
    	while (true) {
    		if(((slice*answer)/n)>0) {
        		break;
        	}else {
        		answer += 1;
        	}
        }
    	 
          return answer;
	}
}