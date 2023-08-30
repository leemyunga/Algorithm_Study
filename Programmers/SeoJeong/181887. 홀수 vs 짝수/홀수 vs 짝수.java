class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // 홀수 
                odd += num_list[i];
            } else { // 짝수 
                even += num_list[i];
            }
        }

        return Math.max(odd, even);
    }
}
