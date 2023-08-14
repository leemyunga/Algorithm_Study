class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int shareIdx = 1;
        for(int i = share +1; i<=balls; i++){
            answer *= i;
            answer /= shareIdx;
            shareIdx++;
        }
        return (int)answer;
    }
}