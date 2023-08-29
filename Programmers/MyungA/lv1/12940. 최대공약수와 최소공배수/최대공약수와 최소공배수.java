class Solution {
    public int[] solution(int n, int m) {

        int max = 1;

        for(int i=1; i <=n && i <= m; i++){
            if((n%i == 0) && (m%i == 0)){
                max= i;
            }
        }

        int min = (n*m)/max;

        int[] answer = {max,min};
        return answer;
    }
}