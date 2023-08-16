class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] isComposite = new boolean[n + 1];
        
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        for (int i = 4; i <= n; i++) {
            if (isComposite[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}
