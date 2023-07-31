import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int temp = 0;
        if (numbers[0]<0 && numbers[1]<0){
            temp = numbers[0]*numbers[1];
        }
        int answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        if(answer<0){
            return answer;
        }
        
        return temp>=answer ? temp : answer;
    }
}