class Solution {
    public int solution(int[] array) {
         int answer = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {
			str += array[i];
		}
        
        
        String[] strArr = str.split("");
        
        for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("7")) {
				answer += 1;
			}
		}
        return answer;
    }
}