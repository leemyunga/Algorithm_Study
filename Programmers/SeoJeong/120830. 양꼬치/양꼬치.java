class Solution {
    public int solution(int n, int k) {
        int yang = 12000;
        int drink = 2000;
        
        int yangCost = yang * n;
        int drinkCost = drink * k;
        
        int freeDrink = n / 10;
        drinkCost -= 2000 * freeDrink;
        
        int answer = yangCost + drinkCost;
        return answer;
    }
}

