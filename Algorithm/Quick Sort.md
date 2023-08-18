# Quick Sort

### 퀵 정렬
#
* 기준키(Pivot)를 기준으로 작거나 같은 값을 지닌 데이터는 앞으로, 큰 값을 지닌 데이터는 뒤로 가도록 하여 작은 값을 갖는 데이터와 큰 값을 갖는 데이터로 분리해가며 정렬하는 대표적인 분할 정복 알고리즘


> 분할정복이란 ?
문제를 더 작은 하위 문제로 나눈 후 , 각 하위 문제를 해결하여 전체 문제를 해결하는 방법론

> 장점 - 대규모의 복잡한 문제를 해결할 때 유용



<br/>

### 동작 방식
#
1. Pivot 선택: 배열 중 하나의 원소를 선택하여 피벗으로 정함 

2. 파티션(Partition): 배열을 pivot값을 기준으로 두 부분으로 나눠줌. 왼쪽은 pivot 보다 작은 값, 오른 쪽 부분은 pivot 보다 큰 값 ( 여기서 pivot 의 최종 위치를 찾을 수 있게 됨 )

3. 정렬 (Align) : pivot 값을 제외하고, 좌우 배열을 다시 정렬함

4. 분할 정복 반복 (Repeat) : 나눠진 배열에 대해 퀵 소트 수행함. 

5. 결합 (Combine) : 정렬된 배열들을 합쳐서 전체 배열을 정렬된 상태로 만들어줌

<br/>

### 예시
#
* 초기상태가 [5,2,1,6,4,8,3,7,9] 일 때

1. 우선 pivot 값을 설정한다.

2. pivot 값보다 작은값을 찾다가 큰 값을 만나면 그 원소를 A라 둔다.

3. 이번엔 방향을 반대로 해서 pivot 값보다 큰 값을 찾다가 작은 값을 만나면 B라 둔다.

4. A와 B의 위치가 교차되지 않는다면 A와 B 두 값을 교환하여 배치한다.

5. 2번~4번을 반복한다.

6. 그러다가 A와 B가 교차되는 순간이 되면, Pivot값과 B값을 교환하여 배치하고,

     교환된 pivot값은 정렬 완료 시키며 남은 배열들을 1번~7번으로 반복한다.

' 
1회전 : [5,2,1,6,4,8,3,7,9]

=> [5,2,1,3,4,8,6,7,9]

=> [4,2,1,3,5,8,6,7,9]

2회전 : [4,2,1,3,5,8,6,7,9]

=> [3,2,1,4,5,7,6,8,9]

3회전 : [3,2,1,4,5,7,6,8,9]

=> [1,2,3,4,5,6,7,8,9]

=> 정렬완료!
'

<br/>



### 구현
#
```
public static void main(String[] args) {
        int[] array = {5, 2, 1, 6, 4, 8, 3, 7, 9};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

public void quickSort(int[] arr, int left, int right) {
    
   // left 가 right 보다 크거나 같으면 정렬 범위가 하나 이하니까 리턴
    if (left >= right) {
        return;
    }
 
    // pivot 선택
    int pivot = arr[right];
    
    int sortedIndex = left;
    for (int i = left; i < right; i++) {
        if (arr[i] <= pivot) {
            swap(arr, i, sortedIndex);
            sortedIndex++;
        }
    }
    swap(arr, sortedIndex, right);
    quickSort(arr, left, sortedIndex - 1);
    quickSort(arr, sortedIndex + 1, right);
}

private void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}


```

<br>

### 시간 복잡도
#

* 최선의 경우 : O(n log n) => 각 하위 문제의 크기가 기존 크기의 딱 절반으로 나뉘어지는 경우 
* 평균의 경우 : O(n) => pivot 을 랜덤하게 선택한 경우
* 최악의 경우 : O(n2) => pivot 을 설정했지만, 나머지 값들이 pivot 의 왼쪽이나 오른쪽 한 군데로만 몰려버리는 경우

<br>


### 장단점

## 장점

-  속도가 빠르다.

-  추가 메모리 공간이 필요하지 않다.

-  한 번 결정된 pivot의 위치는 변하지 않기 때문에 효율적이다.

-  불 필요한 이동이 없고, 먼 거리의 데이터를 교환할 수 있다.


## 단점

- 정렬된 데이터에서는 오히려 수행시간이 오래걸린다.

(ex) [1,2,3,4,5,6,7,8,9,10] 의 정렬된 배열이 있을 때, 

1을 pivot으로 둔다면, 자신 보다 작은 값을 찾기 위해 10까지 탐색하지만 10까지가도 없으니까 다시 돌아와서 1만 정렬한다. 이것을 10번 반복하게 될 것이다. 그러면 O(n2) 의 시간이 걸리는것이다!!!

<br>

<br>
<br>

<footer>


</footer>
