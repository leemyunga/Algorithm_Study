class Solution {
    public int solution(int[] num_list) {
        int product = 1; 
        int sum = 0;    

        for (int num : num_list) {
            product *= num; 
            sum += num; 
        }

        int squaredSum = sum * sum; 

        if (product < squaredSum) {
            return 1; 
        } else {
            return 0;
        }
    }
}
