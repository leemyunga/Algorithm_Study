## **하노이 탑 알고리즘은 재귀함수의 대표적인 알고리즘 중 하나**

<br>

#### **동작방식**

![다운로드](https://github.com/leemyunga/Algorithm_Study/assets/131157645/86848c59-3679-45d3-a65e-0cdc33ea47f6)
  
세 개의 기둥 중 하나의 기둥에 지름이 서로 다른 여러 개의 원판들이 크기순으로 쌓여 있음

<br><br>

![다운로드 (1)](https://github.com/leemyunga/Algorithm_Study/assets/131157645/6c59a77b-5dfa-4546-8b20-601fda5c27b0)

  
이 원판들을 다른 기둥으로 옮기는 과정

<br>

#### **규칙**

-   한 번에 하나의 원판만 옮길 수 있음
-   큰 원판 위에 작은 원판을 올릴 수 없음
-   중간 단계로 사용할 수 있는 보조 기둥을 활용할 수 있음

<br>

#### **동작방식 예시**

-   n-1개의 원판을 보조 기둥으로 옮김
-   가장 큰 원판을 목표 기둥으로 옮김
-   보조 기둥에 있는 n-1개의 원판을 목표 기둥으로 옮김

![다운로드 (2)](https://github.com/leemyunga/Algorithm_Study/assets/131157645/443d412a-f1fd-46e2-94e1-589bd491b055)
<br>

#### **하노이 예시**

-   구현코드

```
public class HanoiTower {
    public static void main(String[] args) {
        int num = 3;
        
        solveHanoi(num, 'A', 'B', 'C');
    }
    
    public static void solveHanoi(int num, char start, char to, char via) {
        if (n == 1) {
            System.out.println(num + "번 원반을 "+ start +"에서 " + to + "로 이동");
            return;
        }
        
        solveHanoi(n - 1, start, via, to);
        System.out.println(num + "번 원반을 "+ start +"에서 " + to + "로 이동");
        solveHanoi(n - 1, via, to, start);
    }
}
```

<br>

-   출력문

```
1번 원반을 A에서 C로 이동
2번 원반을 A에서 B로 이동
1번 원반을 C에서 B로 이동
3번 원반을 A에서 C로 이동
1번 원반을 B에서 A로 이동
2번 원반을 B에서 C로 이동
1번 원반을 A에서 C로 이동
```

<br>

#### **시간복잡도**

-   하노이의 탑 문제의 시간복잡도는 **O(2^n)** 
-   원반의 개수를 n이라고 할 때, 최소한의 이동 횟수는 2^n - 1
-   재귀적인 구조 때문에 지수적으로 증가하는 시간복잡도를 가지게 됨

<br>

#### **공간복잡도**

-   하노이의 탑 알고리즘은 주로 재귀적인 방식으로 구현됨
-   재귀 호출을 사용할 때 각 호출마다 스택에 메모리가 할당되므로, 재귀의 깊이가 n에 비례
-   재귀 스택에 필요한 공간 복잡도는 **O(n)**
-   추가적으로 알고리즘의 진행에 필요한 변수나 데이터 구조에 따라 공간이 추가로 소요될 수도 있음

<br>

> 참고자료 [https://shoark7.github.io/programming/algorithm/tower-of-hanoi](https://shoark7.github.io/programming/algorithm/tower-of-hanoi)
