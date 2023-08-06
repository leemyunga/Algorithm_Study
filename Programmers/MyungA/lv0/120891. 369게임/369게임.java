class Solution {
    public int solution(int order) {
        int answer = 0;
		String str = String.valueOf(order);
		char[]  array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i]=='3' || array[i]=='6' || array[i]=='9') {
				answer +=1;
			}
		}
        
        return answer;
    }
}