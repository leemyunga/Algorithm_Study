class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] array = answer.toCharArray();
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        answer = String.valueOf(array);
        
        return answer;
    }
}