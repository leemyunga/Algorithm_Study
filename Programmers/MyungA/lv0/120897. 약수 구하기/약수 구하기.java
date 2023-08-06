class Solution {
    public int[] solution(int n) {
         int k = 0;
	        
	        for(int i = 1; i <= n; i++){
	            if((n%i)==0){
	                k +=1;
	            }
	        }
	        
	        int[] answer = new int[k];
	        
	        for(int i=0; i<k;){
	            for(int j=1; j<=n; j++){
	                if(n%j==0){
	                    answer[i]=j;
	                    i++;
	                }
	            }
	        }
	        return answer;
	    }
}