class Solution {
    public boolean solution(int x) {
        int originalX = x;
        int digitSum = 0;

        // 자릿수 합 계산
        while (x > 0) {
            digitSum += x % 10;
            x /= 10;
        }

        // x가 자릿수 합으로 나누어지는지 확인
        return originalX % digitSum == 0;
    }
}
