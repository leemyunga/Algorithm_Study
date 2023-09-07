class Solution {
    public String solution(int n) {
        
        char[] watermelon = new char[n];
        
        for(int i=0; i<n; i++) {
            if(i%2 == 0) watermelon[i] = '수';
            else watermelon[i] = '박';
        }
        
        String answer = String.valueOf(watermelon);
        return answer;
    }
}