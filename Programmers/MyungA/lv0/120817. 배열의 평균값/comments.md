# [level 0] 문자 반복 출력하기 

### Comments

주어진 String매개별수를 char[]로 바꾸고 길이에 n을 곱해 새로운 char[]을 준비 후 순서대로 값을 채웠는데 그 과정에서 for문을 삼중으로 돌리게 됐다.
전체 배열에 매개변수 배열을 순서대로 n번 만큼 반복하기 위함이었는데 다른 사람들의 풀이를 보니 n번 for문을 돌리는 대신 repeat(n)을 사용해서 n번 만큼 사용하는 걸 알 수 있었다.

즉 코드를 아래 처럼 단순하게 변경이 가능 했다.
```
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}
```
메서드를 사용하여 짧게 만드는 것이 꼭 좋은 코드는 아니지만 
for문은 크기가 커지면 성능상의 문제로 시간초과가 발생할 수 있고 다른 배열일 때 보다 String 배열일 때 활용할 수 있는 메서드도 많으니 알아두면 좋을 것 같다.

<br>

### Comments
#
처음에 String.valueOf(answerArr) 대신 answerArr.toString을 썼는데 내가 원한 결과가 아니라 메모리 주소값 같은게 튀어나왔다.
관련해서 찾아보니 내가 toString에 대해 잘못 생각하고 있던게 좀 있어 정리 추가 한다. 

> **배열을 문자형으로 변환하는 방법** <br>
> 
> 배열을 **toString()** 메서드로 변환하면, 해당 배열의 실제 내용 대신 **배열의 타입과 해시 코드**가 포함된 문자열이 반환된다.<br>
> 따라서 answerArr.toString()은 실제 배열의 내용이 아니라 해당 배열의 타입과 해시 코드를 문자열로 표현한 값이 반환된다.<br>
> 
> 예를 들어 char[] answerArr = {'a', 'b', 'c'};와 같은 배열이 있다면 answerArr.toString()은 [C@7c30a502이 반환한다.<br>
> 
> 배열을 문자열로 변환하기 위해서는 **String.valueOf(answerArr)**와 같이 **String 클래스의 정적 메서드를 사용하거나,** <br>
> **new String(answerArr);와 같이 String 클래스의 생성자를 사용하는 것**이 적절하다.
