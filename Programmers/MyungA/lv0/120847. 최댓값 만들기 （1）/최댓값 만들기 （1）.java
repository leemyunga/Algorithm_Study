import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        
        Arrays.sort(numbers);
        int a = numbers[len-1];
        int b = numbers[len-2];
        return a*b;
    }
}
