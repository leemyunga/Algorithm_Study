import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> line = new ArrayList<>();
        
        for (int i = 0; i < 500; i++) {
            line.add(0);
        }
        
        for (int i = 0; i < 3; i++) {
            for (int k = lines[i][0]; k < lines[i][1]; k++) {
                line.set(100 + k, line.get(100 + k) + 1);
            }
        }
        
        for (int j = 0; j < 206; j++) {
            if (line.get(j) > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}