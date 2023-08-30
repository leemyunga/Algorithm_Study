# [level 0] 최댓값 만들기 (2)

### Comments
Math.max를 잘 활용한 코드가 있어서 가져와봄

<br>

```
class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }
        return answer;
    }
}
```

<br>

> 코드가 간편해 보여서 가져왔으나 찾아보니 Math 매서드를 사용하면 무거운 연산이 된다고 함
