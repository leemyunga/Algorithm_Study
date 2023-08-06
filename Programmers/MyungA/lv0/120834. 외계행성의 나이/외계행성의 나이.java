class Solution {
    public String solution(int age) {
        String answer="";
        String temp= Integer.toString(age); 
            for(int i=0; i<temp.length(); i++) {
                // 숫자 0의 아스키 코드 : 48, a의 아스키 코드 : 97 -> 차이 49
                answer+= (char)(temp.charAt(i)+49);
            }
            return answer;
    }
}