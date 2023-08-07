class Solution {
    public int solution(int slice, int n) {
        
        int answer = 0;
        
        // 사람이 10명인데 조각이 7개면 2판을 시켜야함
        // 피자 조각 남아도 상관없으니까 그냥 다 먹을 수만 있으면 됨        
        if(n % slice != 0){ 
            // 나머지가 있을 경우에는 판 수 추가 하나 해야됨
            answer = n/slice+1; 
        } else {
            answer = n/slice;
            
        }
        
        
        return answer;
    }
}