class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multiplication = 1;
        int addition = 0;
        
        for(int i=0; i<num_list.length; i++){
            multiplication *= num_list[i];
            addition += num_list[i];
        }
        
        if(multiplication<Math.pow(addition,2)){
            answer = 1;
        }else {
            answer = 0;
        }
        
        return answer;
    }
}