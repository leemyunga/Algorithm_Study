# [level 0] 외계행성의 나이

### Comments
문자열 작업 시 자주 사용하는 StringBuilder와 StringBuffer 비교

<br>

```
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while(age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }
}
```

<br>

### 공통점
* String 보다 저장공간 덜 차지 → GC(가비지 컬렉션) 작업 줄어듬
* 두 클래스 모두 주요 메서드는 같음

<br>

### 차이점
| StringBuffer              | StringBuilder            |
|--------------------------|-------------------------|
| 단일 스레드에서 안전하지 않음 | 단일 스레드에서 안전 |
| 멀티 스레드에서 안전(여러 스레드 접근 불가) | 멀티 스레드에서 안전하지 않음 |
| 성능 및 속도 ↓ | 성능 및 속도 ↑ |
