class Solution {
    public int[][] solution(int n) {
        int[][] answer = hanoi(n, 1, 2, 3);
        return answer;
    }
    
    public int[][] hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            int[][] move = {{from, to}};
            return move;
        } else {
            int[][] part1 = hanoi(n - 1, from, to, via);
            int[][] part2 = {{from, to}};
            int[][] part3 = hanoi(n - 1, via, from, to);
            
            int[][] result = new int[part1.length + part2.length + part3.length][2];
            int index = 0;
            for (int[] move : part1) {
                result[index++] = move;
            }
            for (int[] move : part2) {
                result[index++] = move;
            }
            for (int[] move : part3) {
                result[index++] = move;
            }
            return result;
        }
    }
}
