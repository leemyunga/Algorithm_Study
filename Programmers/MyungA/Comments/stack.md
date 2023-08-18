# Stack

### 문제
[Programmers][level 0] 컨트롤 제트 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120853) 

### 문제 설명

<p>숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 <code>s</code>가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>s</code>의 길이 ≤ 200</li>
<li>-1,000 &lt; <code>s</code>의 원소 중 숫자 &lt; 1,000</li>
<li><code>s</code>는 숫자, "Z", 공백으로 이루어져 있습니다.</li>
<li><code>s</code>에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.</li>
<li>연속된 공백은 주어지지 않습니다.</li>
<li>0을 제외하고는 0으로 시작하는 숫자는 없습니다.</li>
<li><code>s</code>는 "Z"로 시작하지 않습니다.</li>
<li><code>s</code>의 시작과 끝에는 공백이 없습니다.</li>
<li>"Z"가 연속해서 나오는 경우는 없습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"1 2 Z 3"</td>
<td>4</td>
</tr>
<tr>
<td>"10 20 30 40"</td>
<td>100</td>
</tr>
<tr>
<td>"10 Z 20 Z 1"</td>
<td>1</td>
</tr>
<tr>
<td>"10 Z 20 Z"</td>
<td>0</td>
</tr>
<tr>
<td>"-1 -2 -3 Z"</td>
<td>-3</td>
</tr>
</tbody>
      </table>
<hr>

### 나의 풀이
```
class Solution {
   public int solution(String s) {
	        int answer = 0;
	        
	        String[] str = s.split(" ");
	        
	         for (int i = 0; i < str.length; i++) {
				if (!str[i].equals("Z")) {
					answer += Integer.parseInt(str[i]);
				}else if(str[i].equals("Z")){
					answer -= Integer.parseInt(str[i-1]);
				}
			}
	        return answer;
	  }
}
```
### Stack
한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료 구조

Stack의 연산
  * pop(): 스택에서 가장 위에 있는 항목을 제거
  * push(item): item 하나를 스택의 가장 윗 부분에 추가
  * peek(): 스택의 가장 위에 있는 항목을 반환
  * isEmpty(): 스택이 비어 있을 때에 true를 반환

```
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}

```
