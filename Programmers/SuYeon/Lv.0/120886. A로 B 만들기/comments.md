# [level 0] A로 B 만들기

### Comments
나는 String을 char[]로 만들어서 정렬한 후 String으로 변환해 equals로 비교해서 문제를 풀었는데 아래 코드는 중복된 문자를 제거해서 문자열의 길이를 세는 방법으로 품

<br>

```
class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
    }
}
```

<br>

> replaceFirst
public String replaceFirst(String regex, String replacement);

* 처음으로 만나는 패턴만 대치
