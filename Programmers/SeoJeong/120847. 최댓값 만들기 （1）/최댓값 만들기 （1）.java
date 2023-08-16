class Solution {
    public int solution(int[] numbers) {
        int answer = 0; // 최댓값 초기화
        
        // i * j 
        // i 를 numbers 의 길이까지 증가시킴 (첫번째 원소)
         for (int i = 0; i < numbers.length; i++) {
            /* 
            j는 두번째 원소 .. int j = 0; 이렇게 하면 중복되는 곱셈 발생함 
            배열 중에 두개의 원소를 곱해야하는데 j도 0부터 하면 3*3 같은 중복이 
            발생하니까 안 되는 거임
            그래서 i=0 일 때, j=1 부터 시작하도록 만들어준다      
            */
            for (int j = i+1; j < numbers.length; j++) {
                int iproductj = numbers[i] * numbers[j];
                // Math.max 사용 -> 큰 값 반환
                // 반복문 통해서 최댓값을 갱신해줌 
                answer = Math.max(answer, iproductj); 
            }
        }        
        
        
        return answer;
    }
}
/*
간단한게 있었다.. 배열 원소 중에서 최댓값이랑 두 번째로 큰 값 찾아줘버리면 된다..

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers); // 배열 정렬

        // 배열 길이 끝이랑 끝에서 두 번째 값 곲해주기
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}


*/
