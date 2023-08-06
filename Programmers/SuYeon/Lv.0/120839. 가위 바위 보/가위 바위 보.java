class Solution {
    public StringBuilder solution(String rsp) {
        StringBuilder sb = new StringBuilder();
		
		char[] list = rsp.toCharArray();
		
		for (int i = 0; i < list.length; i++) {
			if(Character.toString(list[i]).equals("2")) {
				sb.append("0");
			}else if(Character.toString(list[i]).equals("0")) {
				sb.append("5");				
			}else {
				sb.append("2");	
			}
				
		}
        
        return sb;
    }
}