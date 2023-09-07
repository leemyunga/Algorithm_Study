class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        
        int[] answer = new int[arr.length-1];
        int minIdx = 0; 
        
        for(int i=0; i<arr.length; i++) {
            if(arr[minIdx] > arr[i]) minIdx = i;
        }
        
        for(int i=minIdx+1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        
        for(int i=0; i<arr.length-1; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}