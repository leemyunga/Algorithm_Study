class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int number = array[0];
        int temp = 0;
        
        for(int i = 0; i<array.length-1; i++){
            if(array[i] < array[i+1]){
                index = i+1;
                number = array[i+1];
            }
        }
        int[] answer = {number,index};
        return answer;
    }
}