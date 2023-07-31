import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        // Arrays.copyOfrange(복사할 배열, 시작 위치, 배열 크기)
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }
}