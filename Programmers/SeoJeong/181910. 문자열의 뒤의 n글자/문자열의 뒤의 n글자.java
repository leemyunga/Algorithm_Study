class Solution {
    public String solution(String my_string, int n) {
        int start = Math.max(my_string.length() - n, 0);
        String answer = my_string.substring(start); 
        return answer;
    }
}
