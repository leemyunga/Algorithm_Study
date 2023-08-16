class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c)); 
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c)); 
            } else {
                answer.append(c); 
            }
        }

        return answer.toString();
    }
}
