# [level 0] 숨어있는 숫자의 덧셈 (1)

### Comments

일단 문제를 보자마자 생각난건 아스키코드로 취급하면 되겠다는 생각!
문제는 어렵지 않게 풀었는데 의외로 다양한 방법들이 있어서 기록 해둔다. 

**1. 아스키 코드를 활용한 방법**
```
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }
        return answer;
    }
}
```
**2. Character.isDigit와 Character.getNumericValue 메서드 활용**
```
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }
}
```
**3. 정규식활용**
```
class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
                
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
			answer += Integer.valueOf(arr[i]); 
		}
        return answer;
    }
}
```
이 중 정규식을 활용하는 방식이 나에게 가자 낯선 방식이라 조금 더 정리

### 정규식 
> **정규식 활용**
>"[a-zA-Z]" 이 부분은 정규식 패턴으로 **[a-zA-Z]**는 **알파벳(대문자 또는 소문자)에 대응하는 정규식**이다.
> []는 문자 클래스(character class)를 나타내며, a-z는 알파벳 소문자를, A-Z는 알파벳 대문자를 의미한다.
> 따라서 이 정규식은 모든 알파벳을 매칭하여 빈 문자열("")로 replaceAll() 메서드를 통해 알파벳을 제거한 새로운 문자열을 반환한다. 즉, **알파벳이 아닌 문자**만 남게 된다. 
