class Solution {
    public int solution(int hp) {
        int answer = 0;
/*        
        int result = hp/5;
        answer += result;
        
        if(hp%5 >= 3) {
        	result = hp%5/3;
            answer += result;
        }
        
        if(hp%5%3 > 0) {
        	result = hp%5%3/1;
            answer += result;     
        }
*/
        
        answer = (hp/5) + ((hp%5) / 3) + ((hp%5) % 3);
        
        return answer;
    }
}