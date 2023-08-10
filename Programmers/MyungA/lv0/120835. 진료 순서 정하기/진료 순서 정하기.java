import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] newArr = Arrays.copyOfRange(emergency, 0, emergency.length);
        
        Arrays.sort(emergency);
        for (int i = 0; i < newArr.length; i++) {
        	for (int j = 0; j < emergency.length; j++) {
				if(newArr[i] == emergency[j]) {
					answer[i] = emergency.length-j;
				}
			}
		}
        return answer;
    }
}