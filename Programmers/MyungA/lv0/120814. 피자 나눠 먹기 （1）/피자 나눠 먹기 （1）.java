class Solution {
    public int solution(int n) {
    	
    	int answer = 1;
    	
    	while(true) {
    		if(((answer*7)/n)>0) {
	    		break;
	    	}else {
	    		answer += 1;
	    	}
    	}
        return answer;
    }
}
