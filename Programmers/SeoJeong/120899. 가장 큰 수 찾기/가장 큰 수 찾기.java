class Solution {
    public int[] solution(int[] array) {
        int maxNum = Integer.MIN_VALUE; 
        int maxIndex = -1; 

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxIndex = i;
            }
        }

        int[] answer = {maxNum, maxIndex};
        return answer;
    }
}
