# 재귀란?

![](https://velog.velcdn.com/images/nodada/post/20ac5319-857c-403b-9e7f-706466e570f1/image.jpg)

재귀란, 인형 안에 작은 인형이 들어있고 그 안에 또 작은 인형이 계속해서 존재하는 마트로시카 인형과 같은 원리로, 함수 내부에서 자기 자신을 호출하여 동일한 작업을 반복 수행하는 함수이고, 알고리즘을 설계할 때 동일한 문제의 조금 더 작은 경우를 해결하는 방법. 

쉽게 말해서, 큰 문제를 작은 부분 문제로 분할해서 해결하는 프로그래밍 기법.

<hr>

## 재귀의 반복 개념

재귀 알고리즘이 실제로 작동하려면 범위가 더 좁은 하위 문제가 base case 에 도달해서 재귀함수가 끝날 수 있어야 함. 

재귀의 반복 개념은 두 개의 간단한 규칙으로 간추릴 수 있는데,

1. 하위 문제로의 분할 : 재귀의 호출은 같은 문제 내에 더 범위가 작은 값, 즉 하위 문제에 대해 이루어져야만 한다.
2. Base Case 도달 : 재귀함수 호출은 더 이상 분할되지 않는 base case 에 도달해야한다.

<hr>

## 예시 

### 팩토리얼 함수

팩토리얼 : 
* 정수 n에 대해서 1부터 n까지의 모든 양의 정수를 곱한 값
* 일반적으로 "n 팩토리얼"이라고 표기하며, n!로 나타낸다.
* 주어진 양의 정수에 대한 모든 경우의 수를 구하는 문제나, 확률 계산, 조합적인 문제 등에서 사용된다.

예시로 5! 를 계산해보자

 ```
 
 public static void main(String[] args) {
        int n = 5; // 계산할 팩토리얼 값
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }
}

// 재귀 사용 시
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) { // 탈출 조건
            return 1; // base case 에 도달할 때까지 자기 자신을 호출하면서 문제 해결
        } else { // 재귀 로직
            return factorial(n - 1); // 자기 자신을 다시 호출
        }
    }
    
// 일반 for문 사용 시
public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
```

#### 5! 계산 과정:

* n이 0인 경우: Base Case에 도달하여 1을 반환합니다.
* 그 외의 경우: 재귀적으로 factorial(n - 1)을 호출하여 문제를 더 작은 범위로 분할

factorial(5) 호출

5가 0이 아니므로 5 * factorial(4) 호출

4가 0이 아니므로 4 * factorial(3) 호출

3이 0이 아니므로 3 * factorial(2) 호출

2가 0이 아니므로 2 * factorial(1) 호출

1이 0이 아니므로 1 * factorial(0) 호출

0은 base case에 해당하므로 1 반환

계산된 값들을 거꾸로 조합하여 결과 도출:

5! = 5 × 4 × 3 × 2 × 1 = 120


<hr>

### 피보나치 수열

피보나치 수열 : 
* 각 항이 이전 두 항의 합으로 이루어지는 수열
* 0과 1로 시작하여 0, 1, 1, 2, 3, 5, 8, 13, ...과 같은 수열을 형성

```
// 재귀 사용 시 
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base Case: 0과 1의 경우 그대로 반환
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // 재귀적으로 이전 두 항의 합을 반환
        }
    }

// 일반 for 문 사용 시
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base Case: 0과 1의 경우 그대로 반환
        } else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2]; // 이전 두 항의 값을 더해서 현재 항의 값을 계산
            }

            return fib[n];
        }
    }



    public static void main(String[] args) {
        int n = 6; // 계산할 파보나치 수열의 항 번호
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}

```
재귀적으로 구현했을 때는 코드가 간결하고 직관적이다.
그렇지만 중복된 계산이 많아서 효율성이 낮고, 큰 입력값에 대해서 계산이 느릴 수 있다.

-> 피보나치 수열과 같이 중복 계산이 많이 발생하는 문제에 메모이제이션을 적용할 수 있음

<hr>

### 메모이제이션(Memoization)

함수가 호출될 때마다 함수의 입력 값을 기준으로 결과를 저장하고, 다음에 동일한 입력이 들어왔을 때 저장된 결과를 반환한다. 

=> 이를 통해 동일한 계산을 반복하지 않고 이전에 계산된 값을 활용하여 실행 시간을 단축할 수 있음

보완 시 코드

```
public class FibonacciWithMemoization {
    private static int[] memo; // 메모이제이션을 위한 배열

    public static int fibonacci(int n) {
        if (memo[n] != -1) {
            return memo[n]; // 이미 계산한 값이 있다면 그 값을 반환
        }

        if (n <= 1) {
            return n; // Base Case: 0과 1의 경우 그대로 반환
        } else {
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2); // 계산한 값을 저장
            return memo[n];
        }
    }

    public static void main(String[] args) {
        int n = 6; // 계산할 파보나치 수열의 항 번호
        memo = new int[n + 1];
        Arrays.fill(memo, -1); // 메모이제이션 배열 초기화

        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}

```

<hr>

### 응용 문제 : 하노이의 탑

규칙 
1. 한 번에 하나씩 이동해야 한다.
2. 작은 원반 위에 큰 원반을 올릴 수 없다.

⇒ 보통 이 조건에서 ‘최소 이동횟수’를 구하거나, ‘최소의 이동횟수로 옮길 때 원반을 옮기는 순서’ 등을 구하는 것이 하노이의 탑 문제로 나온다고 한다.

설명 : https://shoark7.github.io/programming/algorithm/tower-of-hanoi 

![](https://velog.velcdn.com/images/nodada/post/0b331596-b549-4500-9bc3-282d3cb4f216/image.png)

3개의 막대가 있고, 첫 번째 막대(여기서는 ‘A’)에 5개의 원반이 쌓여 있다. 각 원반의 크기는 모두 다르고, 아래에서부터 위로 갈수록 점점 작아진다.
우리의 목표는 막대 ‘A’에 쌓여 있는 원반들을 그 순서를 지키면서 그대로 ‘C’로 옮기는 것이다.(‘B’도 상관 없다.)

![](https://velog.velcdn.com/images/nodada/post/dcf4db2f-23e4-4020-a76c-0e3f069d92fc/image.png)

이때 원반을 옮기는 몇 가지 조건이 따른다.

한 번에 움직일 수 있는 원반은 기둥 위에 놓인 원반 하나뿐이다.
어떤 원반 위에 그보다 더 큰 원반을 쌓을 수 없다.


이 조건 하에서 ‘최소의 이동횟수로 옮기는 가짓수’를 구하거나, ‘최소의 이동횟수로 옮길 때 각 원반을 옮기는 순서’ 등을 구하는 것이 하노이의 탑 문제가 된다.

hanoi(N): 원반의 개수 N을 입력 받아 모든 원반을 'C' 막대에 옮기는 각 움직임을 출력한다.

![](https://velog.velcdn.com/images/nodada/post/f323bfb4-078a-4476-b334-09014fc2b7fd/image.png)



## 장단점

장점:

1. 복잡한 문제를 더 작은 부분 문제로 나누어 해결할 수 있어 코드가 간결하고 가독성이 좋음.
2. 몇 가지 알고리즘과 문제 유형에 대해서는 다른 접근 방식보다 재귀가 더 직관적이고 자연스러울 수 있음.
3. 분할 정복 알고리즘과 잘 어울려 효율적인 문제 해결이 가능.

단점:

1. 잘못 구현하면 무한 재귀에 빠져 프로그램이 정지할 수 있습니다. 따라서 종료 조건을 확실히 설정해야 함.
2. 재귀 호출은 함수 호출과정에서 스택을 사용하므로, 깊은 재귀 호출이 일어날 경우스택 오버플로우가 발생할 수 있음.
3. 일부 경우에는 반복문보다 성능이 떨어질 수 있음.

해결하기 위한 방법 : 메모이제이션 , 다이나믹 프로그래밍 , 반복문 사용
