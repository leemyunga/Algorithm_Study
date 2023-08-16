class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            int digit = age % 10; 
            char alphabet = (char) (digit + 'a'); 
            answer.insert(0, alphabet); 
            age /= 10; 
        }

        return answer.toString();
    }
}
