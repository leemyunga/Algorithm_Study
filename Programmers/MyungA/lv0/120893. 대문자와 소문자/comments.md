# [level 0] 대문자와 소문자

### Comments

나는 아스키코드를 활용하는 방식으로 문제를 풀었다. 
다른 사람들의 풀이를 보니 StringBuilder를 사용하는 경우가 종종 보여 활용하기 좋은 메서드 같이 정리 해둔다.

```
public static String solution(String my_string) {
    StringBuilder sb = new StringBuilder();
    for (char c : my_string.toCharArray()) {
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c + 32));
        } else {
            sb.append((char) (c - 32));
        }
    }
    return sb.toString();
}
```
### StringBuilder
문자열을 가변적으로 처리할 수 있도록 도와주는 클래스로 StringBuilder는 내부적으로 가변적인 char 배열을 사용하며, 문자열을 변경하는 작업은 기존 객체를 수정하여 수행된다. 이로 인해 문자열을 효율적으로 처리할 수 있으며, 큰 문자열을 빠르게 조작할 때 유용하다.


>**StringBuilder의 주요 메서드**
>
>**append(String str)** 문자열 뒤에 지정한 문자열을 추가 <br>
>**insert(int offset, String str)** 지정한 위치(offset)에 문자열을 삽입<br>
>**replace(int start, int end, String str)** 지정한 범위의 문자열을 새로운 문자열로 대체 <br>
>**delete(int start, int end)** 지정한 범위의 문자열을 삭제
>**reverse()** 문자열을 순서를 역순으로 반환<br>
>**toString()** StringBuilder 객체를 String 객체로 변환하여 반환
