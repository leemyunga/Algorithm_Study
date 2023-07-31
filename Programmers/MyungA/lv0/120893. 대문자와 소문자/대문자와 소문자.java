class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (c >= 'A' && c <= 'Z') {
                charArr[i] = (char) (c + 32);
            } else {
                charArr[i] = (char) (c - 32);
            }
        }
        String answer = String.valueOf(charArr);
        return answer;
    }
}