class Solution {
    public int solution(int[] array) {
        int result=0;
		        int max=0;
		        for(int i=0; i<array.length; i++) {
		            if(array[i]>max) {
		                max=array[i];
		            }
		        }
		        
		        int[] cnt=new int[max+1]; 
		        
		        for(int j=0; j<array.length; j++) {            
		            cnt[array[j]]++;
		        }
		        
		        int cntMax=0;
		        for(int m=0; m<cnt.length; m++) {
		            if(cnt[m]>cntMax) {
		                cntMax=cnt[m];
		                result=m;
		            }
		        }                                            
		        
		        int rep=0;
		        for(int n=0; n<cnt.length; n++) {    
		            if(cntMax==cnt[n]) {
		                rep++;
		            }
		        }
		        
		        if(rep!=1) {
		            result=-1;
		        } 
		        return result;
    }
}