import java.util.Arrays;

class Solution {
  public long solution(long n) {
		String input = ""+ n;
		int size = input.length();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = input.charAt(i)- '0';
		}
		Arrays.sort(nums);
		StringBuilder sb = new StringBuilder();
		for (int i = size - 1; i >= 0; i--) {
			sb.append(nums[i]);
		}
		long answer = Long.parseLong(sb.toString());
		return answer;
  }
}