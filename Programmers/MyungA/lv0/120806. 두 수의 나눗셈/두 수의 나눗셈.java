class Solution {
    public int solution(int num1, int num2) {
        float fnum1 = num1;
        float fnum2 = num2;
        
        float fanswer = (fnum1/fnum2)*1000;
        int answer = (int)fanswer;
        return answer;
    }
}