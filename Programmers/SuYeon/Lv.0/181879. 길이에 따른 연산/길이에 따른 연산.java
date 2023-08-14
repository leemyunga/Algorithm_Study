class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list.length >= 11){
                answer += num_list[i];
            }else if(num_list.length <= 10){
                answer *= num_list[i];
            }
        }
        
        if(num_list.length >= 11){
            answer -= 1;
        }
        
        return answer;
    }
}