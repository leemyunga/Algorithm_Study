class Solution {
    public int[] solution(int money) {
        // 잔 , 남는 돈
        int[] answer = {money/5500, money%5500};
        return answer;
    }
}