class Solution {
    public int[] solution(int n) {
        int length = (n + 1) / 2; // 홀수 개수를 계산하여 배열 길이 설정
        int[] answer = new int[length];
        
        int num = 1; // 첫 번째 홀수
        for (int i = 0; i < length; i++) {
            answer[i] = num;
            num += 2; // 다음 홀수로 이동
        }
        
        return answer;
    }
}

