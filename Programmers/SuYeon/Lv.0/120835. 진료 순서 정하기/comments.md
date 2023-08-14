# [level 0] 진료 순서 정하기

### Comments
나는 sort와 reverse를 사용하여 역순으로 정렬한 list를 하나 더 만들어서 순서를 구했는데<br>
list를 하나씩 비교하여 index를 구하는 방법이 있었음.

<br>

```
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
```
