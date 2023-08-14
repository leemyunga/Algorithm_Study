class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                cnt++;
            }
        }
        
        answer = new int[cnt];
        cnt = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[cnt] = numlist[i];
                cnt++;
            }
        }
        
        return answer;
    }
}