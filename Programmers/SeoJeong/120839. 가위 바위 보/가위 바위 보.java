class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            int num = c - '0'; // 문자를 정수로 변환

            // 이기는 순서대로 추가
            if (num == 2) {
                answer.append('0'); // 바위(0)
            } else if (num == 0) {
                answer.append('5'); // 보(5)
            } else if (num == 5) {
                answer.append('2'); // 가위(2)
            }
        }

        return answer.toString();
    }
}
