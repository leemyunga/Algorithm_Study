# 선택 정렬(Selection Sort)

- 배열에서 가장 작은 값을 선택하여 순차적으로 정렬하는 방법 
- 비교적 작은 배열에 적합하며, 큰 배열에는 비효율적임

<br>

### 선택 정렬 알고리즘 동작 단계
1. 배열을 순회하면서 가장 작은 값을 찾음
2. 가장 작은 값을 찾았다면 그 값을 배열의 맨 앞 원소와 교환
<br>*최소값이 이미 왼쪽 끝에 위치하면 아무런 작업도 하지 않음
3. 다음 위치에서부터 위의 과정을 반복하며 배열이 정렬될 때까지 반복

<br>

### 선택정렬 예시

```
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 가장 작은 값과 현재 위치의 값을 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

```

<br>

### 출력값

```
Original arr: [64, 25, 12, 22, 11]

Step 1: [11, 25, 12, 22, 64]
Step 2: [11, 12, 25, 22, 64]
Step 3: [11, 12, 22, 25, 64]
Step 4: [11, 12, 22, 25, 64]
```

<br>

### 시간 복잡도 - O(n^2)
<hr>

- 선택 정렬은 두 개의 반복문으로 구성
- (n * (n - 1)) / 2로 등차수열의 합 공식을 사용 

<br>

### 공간 복잡도 - O(1)
<hr>

- 선택 정렬은 주어진 배열에서 위치를 교환하여 정렬하는데 필요한 공간 외에 별도의 공간을 사용하지 않음 

<br><br>

### *선택 정렬은 입력 배열의 크기에 따라 시간이 제곱으로 증가하므로 비효율적임
