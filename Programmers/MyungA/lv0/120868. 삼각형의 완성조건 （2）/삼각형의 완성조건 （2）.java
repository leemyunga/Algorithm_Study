class Solution {
    public int solution(int[] sides) {
        int longEdge = Math.max(sides[0], sides[1]);
        int shortEdge = Math.min(sides[0], sides[1]);

        int max = longEdge + shortEdge;
        int min = longEdge - shortEdge;

        return max - min - 1;
    }
}