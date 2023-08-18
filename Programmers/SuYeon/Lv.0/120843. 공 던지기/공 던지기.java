class Solution {
    public int solution(int[] numbers, int k) {
        int answer = -1;
        int num = numbers.length;
        
        for(int i=1; i<=k; i++){
            answer += 2;
            if(answer == (num+1)){
                answer = 1;
            }else if(answer == (num+2)){
                answer = 2;
            }
            
        }
        
        return answer;
    }
}