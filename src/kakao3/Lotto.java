package kakao3;

public class Lotto {
	
	public static void main (String[] arg) {
	
		int lottos[] = {0, 31, 1, 14, 12, 18};
		int win_nums[] = {31,10,45,1,6,19};
		int result[] = new int[2];
				
		result = solution(lottos, win_nums);
		System.out.println("result : [" + result[0] + "," + result[1] + "]");
		
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int result[] = new int[2];
		int temp = 0;
		int deletNum = 0;
		for(int i = 0 ; i < lottos.length ; i ++) {
			System.out.println("lottos["+i+"] : "+lottos[i]);
			for(int j = 0 ; j < win_nums.length ; j ++) {
				if(lottos[i] == win_nums[j]) {
					temp ++;
					 j = lottos.length;
				}
				
				if(lottos[i] == 0 ) {
					temp ++;
					deletNum++;
					j = lottos.length;
				}
			}
			
		}
		result[0] = 7 - temp;
		result[1] = 7 - temp + deletNum == 7 ? 6 : 7 - temp + deletNum;
		
		
		return result;
	}

	
	
	
	// 다른사람 코드 
	
	
	/*
	 * public int[] solution(int[] lottos, int[] win_nums) {
		int countR = 0;
	        int countZ = 0;
	        // for문을 이용하여 나의 로또 번호와 당첨 번호를 비교한다.
	        for(int i : lottos) {
	        	for(int j : win_nums) {
	        		if(i == j) countR++;
	        	}
	        	if(i == 0) countZ++;
	        }
	        // 최고 순위와 최저 순위를 계산한다.
	        int upResult = 7 - (countR + countZ) > 6 ? 6 : 7 - (countR + countZ);
	        int downResult = 7 - countR > 6 ? 6 : 7 - countR;
		int[] answer = {upResult, downResult};
	        return answer;
	    }
	
	*/
	
	
	
	
	
	
	
	
}
