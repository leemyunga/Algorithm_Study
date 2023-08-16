### Comments
for문 1개로 구현하는 효율적인 코드가 있어서 가져와봄

<br>

```
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
}
```

<br>

> int[n][m]
* 배열 행,열이 헷갈려서 한참 헤맸음
* n이 행이고, m이 열
