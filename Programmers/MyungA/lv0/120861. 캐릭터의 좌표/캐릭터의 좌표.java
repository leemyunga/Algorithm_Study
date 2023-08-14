class Solution {
   	public int[] solution(String[] keyinput, int[] board) {
					
        int x = 0;
        int y = 0;
        
        int maxX = board[0]/2;
		int maxY = board[1]/2;
        
        for(int i = 0; i < keyinput.length; i++){
        	switch (keyinput[i]) {
        	
				case "right":
					if ( x == maxX) {
						break;
					}else {
						x += 1;
						break;
					}
					
				case "left":
					if ( x == -1*maxX) {
						break;
					}else {
						x -= 1;
						break;
					}
				case "up":
					if ( y == maxY) {
						break;
					}else {
						y += 1;
						break;
					}
				case "down":
					if ( y == -1*maxY) {
						break;
					}else {
						y -= 1;
						break;
					}
	
				default:
					break;
			}
        }
        int[] answer = {x,y};
        return answer;
    }
}