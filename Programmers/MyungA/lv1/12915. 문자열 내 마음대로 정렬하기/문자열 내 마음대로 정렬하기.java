import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    return s1.compareTo(s2); // 인덱스 n의 문자가 같으면 전체 문자열을 비교
                } else {
                    return c1 - c2; // 인덱스 n의 문자를 비교
                }
            }
        });

        return strings;
    }

}