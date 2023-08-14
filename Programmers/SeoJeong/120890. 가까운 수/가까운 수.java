class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for (int num : array) {
            int diff = Math.abs(n - num);
            if (diff < minDiff) {
                answer = num;
                minDiff = diff;
            } else if (diff == minDiff && num < answer) {
                answer = num;
            }
        }
        
        return answer;
    }
}
