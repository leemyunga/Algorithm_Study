class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
		
		int cnt = 0;
		int num = num_list.length/n;

		answer = new int[num][n];
				
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[cnt];
				cnt++;
			}
		}


        return answer;
    }
}