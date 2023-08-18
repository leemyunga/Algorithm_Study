class Solution {
    public int solution(int a, int b) {
        int score = 0; 
        
        if (a % 2 == 1 && b % 2 == 1) {
            score = a * a + b * b; 
        } else if (a % 2 == 1 || b % 2 == 1) {
            score = 2 * (a + b); 
        } else {
            int other = a - b; 
            if (other < 0) {
                other = -other; 
            }
            score = other; 
        }
        
        return score;
    }
}
