class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        
        s = s.toLowerCase(); 

        int pCount = 0;
        int yCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}
