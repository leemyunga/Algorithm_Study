class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        
        while(true){
            if(n>=fac){
                answer++;
                fac = fac * answer;
            }else{
                answer--;
                break;
            }
            
        }
        return answer;
    }
}