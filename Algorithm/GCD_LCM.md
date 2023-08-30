# 최대공약수(GCD) & 최소공배수(LCM)

### 정의
#
#### 최대공약수 (GCD : Greatest Common Divisor)
* 두 수의 공통된 약수 중에서 가장 큰 수

#### 최소공배수 (LCM: Least Common Multiple)
* 두 수의 공통된 배수 중에서 가장 작은 수

### 구현
# 

#### [Programmers] [level 1] 최대공약수와 최소공배수  [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12940) 
 
#### 문제 설명

<p>두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.</p>

<h5>제한 사항</h5>

<ul>
<li>두 수는 1이상 1000000이하의 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>m</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>3</td>
<td>12</td>
<td>[3, 12]</td>
</tr>
<tr>
<td>2</td>
<td>5</td>
<td>[1, 10]</td>
</tr>
</tbody>
      </table>

#### 풀이

```
class Solution {
    public int[] solution(int n, int m) {

        int max = 1;

        for(int i=1; i <=n && i <= m; i++){
            if((n%i == 0) && (m%i == 0)){
                max= i;
            }
        }

        int min = (n*m)/max;

        int[] answer = {max,min};
        return answer;
    }
}
```

### 유클리드 호제법/알고리즘 Euclidean Algorithm
- 두 수의 최대공약수(GCD)를 찾기 위한 알고리즘
- 큰 수를 작은 수로 나누어 떨어지게 하여 수를 반복적으로 취하여 나머지가 0이 될 때까지 작동하는 방법으로 이때 작은 수가 최대공약수가 된다.  

> #### 호제법 
>  두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘

#### 유클리드 호제법을 이용하여 최대공약수 구하는 방식
- 큰 수를 작은 수로 나눈 나머지를 반복적으로 취하여 나머지가 0이 될 때까지 **재귀적**으로 작동하여 최대공약수를 구하는 방식

##### 재귀 방식으로 구현
- b가 0이라면 a가 최대 공약수가 되며, 그렇지 않으면 b와 a%b 의 최대 공약수를 구한다. 이를 재귀적으로 반복하여 최대공약수를 구할 수 있다. 

```
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
```

### 최소공배수(LCM) 구현
- 최대공약수를 구하는 함수를 기반으로 최소공배ㄹ수를 구할 수 있다. 
- 최소공배수는 두수의 곱에 최대 공약수를 나눈 값과 같다.

```
public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
}

```

### 참고 문제
#
#### [level 2] N개의 최소공배수 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12953) 

#### 문제 설명

<p>두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요. </p>

<h5>제한 사항</h5>

<ul>
<li>arr은 길이 1이상, 15이하인 배열입니다.</li>
<li>arr의 원소는 100 이하인 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>arr</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[2,6,8,14]</td>
<td>168</td>
</tr>
<tr>
<td>[1,2,3]</td>
<td>6</td>
</tr>
</tbody>
      </table>

### 구현
```
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public static int lcm (int a, int b){
        return (a*b) / gcd(a,b);
    }

    public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
    }
}
```
