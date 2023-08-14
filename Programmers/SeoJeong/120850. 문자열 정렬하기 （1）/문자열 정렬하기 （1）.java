import java.util.*;


class Solution {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0'; 
                numbers.add(num); 
            }
        }

        Collections.sort(numbers); 

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i); 
        }

        return answer;
    }
}
