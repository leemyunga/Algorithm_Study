class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int[] new_list = new int[num_list.length];
        
        for (int i = 0; i < num_list.length; i++) {
        	new_list[num_list.length - 1 - i] = num_list[i];
		}
        
        answer = new_list;
        
        return answer;
    }
}