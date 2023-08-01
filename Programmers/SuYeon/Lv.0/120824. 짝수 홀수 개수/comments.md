# [level 0] 짝수 홀수 개수

### Comments
생각지도 못한 효율적인 코드가 있어서 가져와봄

<br>

```
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
```

<br>

>#### 짝수일 때 answer[0] 증가, 홀수일 때 answer[1] 증가
