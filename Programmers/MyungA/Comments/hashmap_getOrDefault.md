# HashMap 활용

### 문제
[Programmars][level 1] 완주하지 못한 선수 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42576) 

### 문제 설명

<p>수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.</p>

<p>마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.</p>

<h5>제한사항</h5>

<ul>
<li>마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.</li>
<li>completion의 길이는 participant의 길이보다 1 작습니다.</li>
<li>참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.</li>
<li>참가자 중에는 동명이인이 있을 수 있습니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>participant</th>
<th>completion</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>["leo", "kiki", "eden"]</td>
<td>["eden", "kiki"]</td>
<td>"leo"</td>
</tr>
<tr>
<td>["marina", "josipa", "nikola", "vinko", "filipa"]</td>
<td>["josipa", "filipa", "marina", "nikola"]</td>
<td>"vinko"</td>
</tr>
<tr>
<td>["mislav", "stanko", "mislav", "ana"]</td>
<td>["stanko", "ana", "mislav"]</td>
<td>"mislav"</td>
</tr>
</tbody>
      </table>

<hr>

### 나의 답안

세번째 테스트에서 오류

```
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm =new HashMap<String, Integer>();
		
		for (int i = 0; i < participant.length; i++) {
			hm.put(participant[i], 0);
		}
		
		for (int i = 0; i < completion.length; i++) {
			if(hm.containsKey(completion[i])) {
				hm.replace(completion[i], 1);
			}
		}
		
		String answer = "";
		
		for (String string : participant) {
            System.out.println(string+"="+hm.get(string));
			if (hm.get(string) == 0) {
				answer = string;
			}
		}
		
        
        return answer;
    }
}

```




```
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // participant 배열에 있는 선수들을 해시맵에 추가하며 중복된 이름은 카운트
        for (String player : participant) {
            // getOrDefault 메서드를 사용하여 선수가 이미 해시맵에 있는지 확인하고, 없다면 0으로 초기화
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        // completion 배열에 있는 선수들을 해시맵에서 찾아서 value 감소
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }
            
        // value의 의미 
        // 0:완주
        // 1: 해당 key의 미완자 1명
        // 2: 해당 key의 미완자 2명
            
        // 완주하지 못한 선수를 찾기 위한 변수 초기화
        String answer = "";

        // 해시맵의 키셋을 반복하면서 카운트가 1 이상인 선수 찾기
        for (String key : hm.keySet()) {
            if (hm.get(key) > 0) {
                answer = key; // 완주하지 못한 선수를 저장
                break; // 선수를 찾았으므로 루프 종료
            }
        }

        // 완주하지 못한 선수의 이름 반환
        return answer;
    }
}
```

#### getOrDefault 메서드
* Java의 Map 인터페이스에서 사용할 수 있는 유용한 메서드 중 하나
* 특정 키에 대한 값을 반환. 만약 그 키가 존재하지 않으면 기본 값을 반환
* getOrDefault(Object key, V defaultValue)
  * key: 값을 가져올 키
  * defaultValue: 키가 존재하지 않을 경우 반환할 기본 값
  * ex) hm.getOrDefault(player, 0)
