package kakao1;

public class MainApp {

	public static void main(String[] args) {
		
		// 비트연산
		
		int n = 5; // 변의 길
		int[] arr1 = {9, 20, 28, 18, 11}; // 주어진 값 
		int[] arr2 = {30, 1, 21, 17, 28}; // 주어진 값 2	
		
	
		// 결과 값 ["#####","# # #", "### #", "# ##", "#####"]
		
		String[] result = new String[n]; // 결과를 하나씩 담을 배
		
	
		
		for(int i = 0 ; i < n ; i ++) { 
			int arr = arr1[i] | arr2[i]; //주어진값 1과 2를 비트연산 and를 사용하여 정수값 구한다. 
			int targetbit = 1; // 비트연산을 사용하기위해 초기값 1로 설
			String resultString = ""; // 비트연산한 값을 저장하기 위한 string 변수 선
			for(int j = 0; j < n ; j++) {
				resultString = ((arr & targetbit) > 0 ? "#" : " ") + resultString; 
				// arr 과 targetbit를 and 연산하여 그값이 0보다 크면 # 아니면 공백을 채우는 람다
				targetbit = targetbit << 1 ;
				//targetbit를 쉬프트 연산을 하여 왼쪽으로 1칸 이동 즉 1 - > 4 - > 8 이런
			}
		result[i] = resultString;  // 결과값을 배열에 넣는
		System.out.print(", " + result[i]); // 출
		}
		

	}

}
