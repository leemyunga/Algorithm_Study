class Solution {
    public String solution(String myString) {
        String answer = "";
        //문자열을 배열로 변환
        String[] arr = myString.split("");
        
        //반복문을 통해 전체 배열을 순환시켜준다.
        for(int i = 0; i < arr.length; i++){
            //만약 원소가 a가 아닌 경우 소문자로 변환
            if(!arr[i].equals("a")){
                arr[i] = arr[i].toLowerCase();
            }
            
            //만약 원소가 a인 경우 대문자로 변환
            if(arr[i].equals("a")){
                arr[i] = arr[i].toUpperCase();
            }
            
            //순차적으로 문자열 변수에 저장
            answer += arr[i];
        }
        
        return answer;
    }
}
