class Solution {
    public String solution(String rsp) {
       String[] arr = rsp.split("");
	        String answer = "";
	        for (String string : arr) {
				if(string.equals("0")) {
					//가위는 2 바위는 0 보는 5로
					answer += "5";
				}else if(string.equals("2")) {
					answer += "0";
				}else {
					answer += "2";
				}
			}
	        return answer;
    }
}