class Solution {
    public int solution(int[] array, int n) {
        int temp = n;
        int index = 0;
        
        for(int i = 0; i<array.length; i++){
            if(temp>Math.abs(array[i]-n)) {
                temp = Math.abs(array[i]-n);
            	index = i;
            }
            if(temp == Math.abs(array[i]-n)){
                if(array[i]<array[index]){
                    index = i;
                }
            }
        }
        
        int answer = array[index];

        return answer;
    }
}