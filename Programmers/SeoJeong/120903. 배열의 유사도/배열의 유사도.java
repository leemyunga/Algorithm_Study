class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // 1. for문에서 배열 값 꺼내주고 
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
    			// 2. 같은게 있으면 1 증가
                 if(s1[i].equals(s2[j])) {
                    answer += 1;
                }
			}
		}
        
        return answer;
    }
}