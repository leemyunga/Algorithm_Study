# Selection Sort

### 정의
#
* 선택 정렬은 가장 간단한 정렬 알고리즘 중 하나
* 리스트에서 가장 작은 원소를 찾아 정렬되지 않은 부분의 맨 앞으로 이동시키는 과정을 반복하여 정렬하는 알고리즘

<br/>

### 동작 방식
#
1. 주어진 리스트에서 최솟값을 탐색
2. 최솟값을 맨 앞 원소와 교환
3. 맨 앞 원소를 제외한 나머지 리스트에서 다시 최솟값을 탐색
4. 맨 앞 원소 다음 위치와 교환
5. 이러한 과정을 리스트의 크기만큼 반복합니다.
6. 이러한 과정을 통해 리스트의 원소들이 하나씩 정렬되어 가장 작은 원소부터 차례대로 정렬된 리스트 출력

### 의사 코드
#
```
// 입력: 정렬하고자 하는 배열 arr
procedure selectionSort(arr: array of elements)
    
    // 배열의 길이를 n에 저장
    n = length of arr
    
    // i를 0부터 n-1까지 반복하며 선택 정렬 수행
    for i from 0 to n - 1
        
        // 최솟값을 가리킬 인덱스 minIdx를 i로 초기화
        minIdx = i
        
        // i+1부터 n까지 반복하며 최솟값을 찾음
        for j from i + 1 to n
            
            // 현재 인덱스의 값이 최솟값보다 작으면
            if arr[j] < arr[minIdx]
               
                // 최솟값을 가리키는 인덱스 minIdx를 j로 업데이트
                minIdx = j
                
        // arr[i]와 arr[minIdx]를 교환 (최솟값을 맨 앞으로 이동)
        swap arr[i] with arr[minIdx]
    end for
end procedure

```
<br>

> **Pseudocode 의사코드**<br>
> 
> 컴퓨터 프로그램이나 알고리즘의 동작을 자연어로 간략하게 설명하는 것으로 프로그래밍 언어의 문법이나 세부 구현과는 독립적으로 **알고리즘이나 로직의 아이디어를 표현하는 방식**. <br>
> 의사코드는 프로그래머가 알고리즘의 개요를 이해하고 구현하기 전에 논리적으로 검증하고 설계하기 위해 사용 <br>
> * procedure : 프로시저(함수)의 시작 <br>
> * for : 반복문 <br>
> * if : 조건문 <br>
> * swap : 두 원소를 교환하는 동작

<br>

### 구현
#
```
public class SelectionSort {

     // 입력: 정렬하고자 하는 배열 arr
    public static void selectionSort(int[] arr) {

        // 배열의 길이를 n에 저장
        int n = arr.length;

        // i를 0부터 n-1까지 반복하며 선택 정렬 수행
        for (int i = 0; i < n - 1; i++) {

            // 최솟값을 가리킬 인덱스 minIdx를 i로 초기화
            int minIdx = i;

            // i+1부터 n까지 반복하며 최솟값을 찾음
            for (int j = i + 1; j < n; j++) {

                // 현재 인덱스의 값이 최솟값보다 작으면
                if (arr[j] < arr[minIdx]) {

                    // 최솟값을 가리키는 인덱스 minIdx를 j로 업데이트
                    minIdx = j;
                }
            }

            // arr[i]와 arr[minIdx]를 교환 (최솟값을 맨 앞으로 이동)
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

```

<br>

### 상세 예시
#
* 입력 배열 : [64, 25, 12, 22, 11]
* 단계별 배열 

|  단계  |  0  |  1  |  2  |  3  | 4  |  최솟값  |  정렬 후 배열  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:-------:|:-------------:|
|  1  |  64 | 25 | 12 | 22 | 11  |  11  |  11  25  12  22  64  |
|  2  |  11 | 25 | 12 | 22 | 64  |  12  |  11  12  25  22  64  |
|  3  |  11 | 12 | 25 | 22 | 64  |  22  |  11  12  22  25  64  |
|  4  |  11 | 12 | 22 | 25 | 64  |  25  |  11  12  22  25  64  |
|  5  |  11 | 12 | 22 | 25 | 64  |  64  |  11  12  22  25  64  |

* 정렬 배열 : [11, 12, 22, 25, 64]

<br>

### 복잡도
#
* Time Complexity 시간 복잡도
  * 선택 정렬은 반복문을 이용하여 배열을 순회하면서 매 단계마다 최솟값을 찾아 앞으로 이동하는 과정을 반복 
  * 주어진 배열의 길이를 n이라고 할 때, 선택 정렬의 시간 복잡도는 **O(n^2)**
  *  외부 반복문은 n번, 내부 반복문은 최대 n-1, n-2, ..., 2, 1번 실행
  *  이중 반복문 구조 때문에 선택 정렬은 입력 크기가 커질수록 성능이 하락

* Space Complexity 공간 복잡도
  * 선택 정렬의 공간 복잡도는 **O(1)**
  * 정렬을 위해 배열 외에 다른 데이터 구조를 사용하지 않기 때문에 입력 크기와 상관없이 일정한 공간만을 사용

<br>
<br>
<br>

<footer>
<hr>
참고 자료 

* https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html <br/>
* https://ssdragon.tistory.com/110 <br/>

</footer>
