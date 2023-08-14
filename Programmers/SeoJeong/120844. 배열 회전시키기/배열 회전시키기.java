class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] rotated = new int[n];

        if (direction.equals("right")) {
            for (int i = 0; i < n; i++) {
                rotated[(i + 1) % n] = numbers[i];
            }
        } else if (direction.equals("left")) {
            for (int i = 0; i < n; i++) {
                rotated[i] = numbers[(i + 1) % n];
            }
        }

        return rotated;
    }
}
