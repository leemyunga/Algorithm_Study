# Merge Sort 병합 정렬

### 정의
#
* 효율적인 정렬 알고리즘으로 분할 정복(divide and conquer) 전략을 사용
*  큰 배열을 작은 배열로 분할하고, 각각을 정렬한 뒤 병합하여 전체 배열을 정렬

<br/>

### 동작 방식
#
1. 배열을 반으로 분할
2. 각 부분 배열을 재귀적으로 정렬
3. 정렬된 부분 배열을 하나의 정렬된 배열 병합

![](https://velog.velcdn.com/images/leema0927/post/a113d97e-4962-4daa-a410-f257d75ebfbc/image.png)
![](https://velog.velcdn.com/images/leema0927/post/6756945d-957b-4715-b972-200f667be98f/image.png)


<br/>

### 의사코드
#
```
procedure mergeSort(arr: array of elements)

    // 만약 배열의 길이가 0또는 1이라면 분할이 더이상 필요 없음
    if arr.length <= 1:
        return arr

    // 배열을 반으로 분할
    mid = arr.length / 2

    // 분할한 정렬을 정렬
    left = mergeSort(arr[0:mid])
    right = mergeSort(arr[mid:])
    return merge(left, right)

    // 정렬된 부분 배열을 하나의 정렬된 배열 병합
    merge(left, right):
        result = []
        while left.length > 0 and right.length > 0:
            if left[0] < right[0]:
                result.append(left[0])
                left = left[1:]
            else:
                result.append(right[0])
                right = right[1:]
        if left.length > 0:
            result.extend(left)
        if right.length > 0:
            result.extend(right)
        return result
end procedure
```

<br/>

### 구현
#
```
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
```

<br/>

### 상세 예시
#
* 입력 배열: [38, 27, 43, 3, 9, 82, 10]

1. **분할(Divide)** : 배열을 반으로 분할합니다.
   - 원래 배열: [38, 27, 43, 3, 9, 82, 10]
   - 분할된 부분 배열: [38, 27, 43] | [3, 9, 82, 10]

2. **재귀적으로 부분 배열 정렬**:
   - 첫 번째 부분 배열 [38, 27, 43]:
     1. 분할: [38] | [27, 43]
     2. 첫 번째 부분 배열 정렬: [38]
     3. 두 번째 부분 배열 정렬: [27, 43]
     4. 병합: [27, 38, 43]
   - 두 번째 부분 배열 [3, 9, 82, 10]:
     1. 분할: [3, 9] | [82, 10]
     2. 첫 번째 부분 배열 정렬: [3, 9]
     3. 두 번째 부분 배열 정렬: [10, 82]
     4. 병합: [3, 9, 10, 82]

3. **부분 배열 병합(Conquer)** : 정렬된 부분 배열을 병합하여 전체 배열을 정렬합니다.
   - 첫 번째 부분 배열 [27, 38, 43]와 두 번째 부분 배열 [3, 9, 10, 82]를 병합:
     1. 인덱스 0에서부터 비교하여 작은 값부터 결과 배열에 추가합니다.
     2. 결과 배열: [3, 9, 10, 27, 38, 43, 82]

* 정렬 배열 : [3, 9, 10, 27, 38, 43, 82]

<br>

### 복잡도
# 
* **시간 복잡도** 
    * 최선, 평균, 최악 모두 O(n log n)
    * 분할하는 단계는 log n번 수행되며 분할 횟수(log n)와 각 분할 단계의 병합 시간(O(n))을 곱해주면 전체 시간 복잡도가 O(n log n)이 된다.
* **공간 복잡도**
  * O(n) (추가 배열 사용)
  * 추가적인 배열을 사용하여 부분 배열을 병합하기 때문에 공간 복잡도가 O(n)이 된다.
* 병합 정렬은 입력 배열의 크기가 크더라도 일정한 시간 복잡도를 유지하며, 안정적인 성능을 가지는 정렬 알고리즘이다.

<br>
<br>
<br>

<footer>
<hr>
참고 자료 

* https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html <br/>
* https://www.daleseo.com/sort-merge/ <br/>

</footer>
