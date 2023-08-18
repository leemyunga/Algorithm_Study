import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;       

        List<Integer>  positive = new ArrayList<Integer>();
        List<Integer>  negative  = new ArrayList<Integer>();
		
		for(int i=0; i<numbers.length; i++){
            if(numbers[i]>0){
            	positive.add(numbers[i]);
            }else if(numbers[i]<0){
            	negative.add(numbers[i]);
            }
        }
		
		Collections.sort(positive,Collections.reverseOrder());
		Collections.sort(negative,Collections.reverseOrder());
		
		if(positive.size() >= 2 && negative.size() >= 2) {
			if(positive.get(0)*positive.get(1) > negative.get(0)*negative.get(1)) {
				answer = positive.get(0)*positive.get(1);
			}else if(positive.get(0)*positive.get(1) < negative.get(0)*negative.get(1)) {
				answer = negative.get(0)*negative.get(1);
			}
		}else if(positive.size() >= 2&&negative.size() <2) {
			answer = positive.get(0)*positive.get(1);
		}else if(positive.size() < 2&&negative.size() >= 2) {
			answer = negative.get(0)*negative.get(1);
		}else {
			answer = numbers[0]*numbers[1];
		}
		
        return answer;
    }
}