class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.toLowerCase(); 
        pat = pat.toLowerCase();

        int patLength = pat.length();
        int myStringLength = myString.length();

        for (int i = 0; i <= myStringLength - patLength; i++) {
            if (myString.substring(i, i + patLength).equals(pat)) {
                return 1; 
            }
        }

        return 0; 
    }
}
