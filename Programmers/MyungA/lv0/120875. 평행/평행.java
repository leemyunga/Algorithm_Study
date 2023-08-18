class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] a = new int[2];
        int[] b = new int[2];

        for(int i=0;i<3;i++){
            a[0]=dots[3][0]-dots[i][0];
            a[1]=dots[3][1]-dots[i][1];
            b[0]=dots[(i+1)%3][0]-dots[(i+2)%3][0];
            b[1]=dots[(i+1)%3][1]-dots[(i+2)%3][1];

            if((float)a[1]/a[0]==(float)b[1]/b[0]){
                answer=1;
                break;
            } 
        }

        return answer;
    }
}