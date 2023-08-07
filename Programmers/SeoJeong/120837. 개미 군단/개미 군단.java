class Solution {
    public int solution(int hp) {
        
        int answer = 0;
        
        int first = hp / 5; 
        int HP = hp % 5; 
        
        int second = HP / 3; 
        HP = HP % 3;
        
        int third = HP;
        
        answer = first + second + third;
        
        return answer;
    }
}
