import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        
/*                
        int[] answer = {};
        int j = 0;
        if(n%2 == 0){
            answer = new int[n/2];
        }else {
            answer = new int[n/2+1];
        }
        
        for(int i=1; i<=n; i++){
            answer[j] = i;
            i++;
            j++;
        }
*/
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++){
            if(i%2 == 1) {
            	answer.add(i);
            }
        }
                
        return answer;
    }
}