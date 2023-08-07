class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        int n = numbers.length;
        
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        double answer = sum / n;
        return answer;
    }
}




