class Solution {
    public int solution(int n) {
        int piecesPerPizza = 7;  // 피자 조각 수
        
        int pizzasNeeded = (n + piecesPerPizza - 1) / piecesPerPizza;

        
        return pizzasNeeded;
    }
}
