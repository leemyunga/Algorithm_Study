# [level 0] 문자 반복 출력

### Comments
반복작업을 간편하게 할 수 있는 repeat 매서드가 있어 가져와봄

<br>

```
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        String[] str = my_string.split("");

        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
```
