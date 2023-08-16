class Solution {
    public int solution(String str1, String str2) {
        // 없는 상황을 기본값으로
        int answer = 2;
        
        if(str1.contains(str2)){
            answer = 1;
        }
        return answer;
    }
}