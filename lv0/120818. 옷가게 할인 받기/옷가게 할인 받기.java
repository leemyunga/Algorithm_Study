class Solution {
    public int solution(int price) {
    	
    	if(100000<=price&&price<300000){
    		return (int) (price*0.95); 
    	}
    	if(300000<=price&&price<500000){
    		return (int) (price*0.9); 
    	}
    	if(500000<=price){
    		return (int) (price*0.8); 
    	}
    	
        return price;
    }
}