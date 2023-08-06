import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        int[] list = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0; i<list.length; i++){
        	char age2 = (char) (list[i]+97);
            answer += Character.toString(age2);
        }    
        
        return answer;
    }
}