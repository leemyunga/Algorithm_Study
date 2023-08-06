import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";        
        
        StringBuffer reverse = new StringBuffer(my_string).reverse();
        answer = reverse.toString();
        
        return answer;
    }
}