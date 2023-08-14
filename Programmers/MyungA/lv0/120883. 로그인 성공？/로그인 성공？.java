class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] info : db) {
            if(info[0].equals(id_pw[0]) && info[1].equals(id_pw[1])) {
                answer = "login";
                break;
            }
            else if(info[0].equals(id_pw[0]) && !(info[1].equals(id_pw[1]))) {
                answer = "wrong pw";
                break;
            }
            else {
                answer = "fail";
            }
        }
        return answer;
    }
}