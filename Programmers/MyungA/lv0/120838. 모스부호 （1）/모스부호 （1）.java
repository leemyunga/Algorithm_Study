class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        String[] morseLetter = letter.split(" ");

        for (int i = 0; i < morseLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(morseLetter[i])) { 
                    answer += Character.toString(j + 'a');
                }
            }
        }
        return answer;
    }
}
