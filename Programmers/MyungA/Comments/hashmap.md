# HashMap 활용

### 문제
[Programmars][level 0] 진료 순서 정하기 - [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120835) 

### 문제 설명

<p>외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 <code>emergency</code>가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>중복된 원소는 없습니다.</li>
<li>1 ≤ <code>emergency</code>의 길이 ≤ 10</li>
<li>1 ≤ <code>emergency</code>의 원소 ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>emergency</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[3, 76, 24]</td>
<td>[3, 1, 2]</td>
</tr>
<tr>
<td>[1, 2, 3, 4, 5, 6, 7]</td>
<td>[7, 6, 5, 4, 3, 2, 1]</td>
</tr>
<tr>
<td>[30, 10, 23, 6, 100]</td>
<td>[2, 4, 3, 5, 1]</td>
</tr>
</tbody>
      </table>
<hr>

### 나의 답안

```
  import java.util.Arrays;

  class Solution {
      public int[] solution(int[] emergency) {
          int[] answer = new int[emergency.length];
          int[] newArr = Arrays.copyOfRange(emergency, 0, emergency.length);

          Arrays.sort(emergency);
          for (int i = 0; i < newArr.length; i++) {
              for (int j = 0; j < emergency.length; j++) {
                  if(newArr[i] == emergency[j]) {
                      answer[i] = emergency.length-j;
                  }
              }
          }
          return answer;
      }
  }
```

### HashMap을 이용한 풀이
```
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        Arrays.sort(emergencySort);
        int size = emergency.length;
        for(int i = 0; i<emergencySort.length; i++){
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}
```

### HashMap
* Java Collections Framework에 속한 구현체 클래스로 Map 인터페이스를 구현한 함수
* key, value 형태로 데이터를저장
* key 값의 hashCode를 index로 Araay에 값을 저장하기 때문에 검색속도는 매우 빠름
* key 값은 중복이 되지 않고, value 값은 허용

### HashMap 메서드
* clear() 
  * HashMap에 저장된 모든 객체를 제거한다. 
  * ex) map.clear();
* containsKey(Object Key)
  * HashMap에 지정된 키(Key)가 포함되어 있는지 알려준다. 
* containsValue(Object Value)
  * HashMap에 지정된 값(Value)가 포함되어 있는지 알려준다. 
* get(Object Key)
  * 지정된 Key 의 값을 반환한다. 
* isEmpty
  * HashMap이 비어있는지 확인한다.
* keySet()
  * HashMap에 저장된 모든 키가 저장된 Set을 반환한다.
* put(Object Key, Object Value)
  * HashMap에 키와 값을 저장.
* remove(Object Key)
  * HashMap에서 지정된 키로 지정된 값을 제거한다.
* size()
  * HashMap에 저장된 요소의 개수를 반환한다. 

### 이중for문 대신 HashMap을 사용하는 이유
* HashMap은 시간복잡도 측면에서 이중 for문을 통한 탐색보다 효율적디다.
	* **이중for문** 시간복잡도 : O(N^2)
    * **HashMap** 시간복잡도 : O(NlogN) or O(n)
* HashMap을 사용하면 값을 키로, 해당 값의 인덱스를 값으로 매핑시키는 것이 가능하다 . 따라서, HashMap을 사용하여 원소의 값을 키로 하고, 해당 값의 인덱스를 값으로 매핑하는 방식으로 알고리즘을 개선하면 성능을 향상시킬 수 있다. 
  

### 같이 참고하면 좋을 문제
배열의 크기가 정해지지 않을때, 자동으로 중복제거가 되었으면 할 때 무엇을 사용하면 좋을지 생각해 보기
[Programmars][level 0] 소인수분해 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120852) 
