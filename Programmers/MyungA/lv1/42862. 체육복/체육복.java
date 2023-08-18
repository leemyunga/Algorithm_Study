import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for (int l : lost) {
            lostSet.add(l);
        }
        
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
                answer++;
            } else {
                reserveSet.add(r);
            }
        }
        
        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
                answer++;
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
                answer++;
            }
        }
        
        return answer;
    }
}
