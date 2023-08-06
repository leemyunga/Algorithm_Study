class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = num+"";
        String strK = k+"";
        
        answer = str.indexOf(strK);
        if (answer!= -1){
            answer += 1;
        }
        
        return answer;
    }
}