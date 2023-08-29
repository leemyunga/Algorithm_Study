class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
		
		int[] answer = new int[arr.length];
		
        for (int i = arr.length-1; i >= 0 ; i--) {
			answer[answer.length-i-1] = Integer.parseInt(arr[i]);
		}
            
		
        
        return answer;
    }
}