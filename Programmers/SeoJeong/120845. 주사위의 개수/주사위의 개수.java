class Solution {
    public int solution(int[] box, int n) {
        int min = Math.min(Math.min(box[0], box[1]), box[2]); 

        int max = (box[0] / n) * (box[1] / n) * (box[2] / n); 
        return max;
    }
}
