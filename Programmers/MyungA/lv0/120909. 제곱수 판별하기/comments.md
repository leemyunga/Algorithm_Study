# [level 0] 제곱수 판별하기

### Comments
내 코드는 하나하나 비교해서 답을 찾았는데 활용할 수 있는 Math 클래스가 있어서 기록

### Math.sqrt() 
```
class Solution {
    public int solution(int n) {
        int answer = 0;
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
```
> #### Math 클래스
>
> **Math.abs(x)** : 주어진 숫자 x의 절댓값을 반환
> **Math.max(a, b)** : 두 개의 숫자 a와 b 중 큰 값을 반환
> **Math.min(a, b)** : 두 개의 숫자 a와 b 중 작은 값을 반환
> **Math.round(x)** : 주어진 숫자 x를 반올림하여 가장 가까운 정수를 반환
> **Math.ceil(x)** : 주어진 숫자 x보다 크거나 같은 가장 작은 정수를 반환
> **Math.floor(x)** : 주어진 숫자 x보다 작거나 같은 가장 큰 정수를 반환
> **Math.sqrt(x)** : 주어진 숫자 x의 제곱근을 반환
> **Math.pow(x, y)** : x의 y 거듭제곱을 계산하여 반환
> **Math.random()** : 0 이상 1 미만의 무작위 double 형태의 값을 반환
