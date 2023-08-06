class Solution {
    public int solution(int n, int t) {
        int answer = n;
/*
        for(int i=0; i<t; i++){
            answer *= 2;
        }
*/
        
        answer = n * (int)Math.pow(2, t);
        
        return answer;
    }
}