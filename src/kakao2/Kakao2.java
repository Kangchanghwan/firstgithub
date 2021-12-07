package kakao2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kakao2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	//	1	1S2D*3T	37	1^1 * 2 + 2^2 * 2 + 3^3
	//	2	1D2S#10S	9	1^2 + 2^1 * (-1) + 10^1
	//	3	1D2S0T	3	1^2 + 2^1 + 0^3
	//	4	1S*2T*3S	23	1^1 * 2 * 2 + 2^3 * 2 + 3^1
	//	5	1D#2S*3S	5	1^2 * (-1) * 2 + 2^1 * 2 + 3^1
	//	6	1T2D3D#	-4	1^3 + 2^2 + 3^2 * (-1)
	//	7	1D2S3T*	59	1^2 + 2^1 * 2 + 3^3 * 
	// 최대 가질수 있는 길이 4글자 ..
		
		StringBuffer strBuffer = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		//strBuffer.append(scan.next());
		strBuffer.append("1S2D*3T");
		int result = 0;
		int secondStart = 0;
		int thirdStart = 0;
		int num = 0;
		int pow = 0;
		int option = 0;
		
		String first = strBuffer.substring(0,4);
		
		for(int i = 0 ; i < first.length() ; i++ ) {
			char cur = first.charAt(i);
			if(0 <= Character.getNumericValue(cur) && Character.getNumericValue(cur) >= 9 ) {
				num = cur - '0';
				if(num == 1 && Character.getNumericValue(first.charAt(i+1)) == 0) {
					num = 10;
					i--;
					
				}
			}
			System.out.println("int i :" + i);
			if( i == 1 || i == 2) {
				switch(cur) {
			
					case 'S' :
						result = num;
						break;
					case 'D' :
						result = num*num;
						break;
					case 'T' :
						result = num*num*num;
						break;
				}
				num = 0;
			}
			if(i == 2 || i == 3) {
			
				switch(cur) {
			
					case '*':
						result *= 2;
						break;
					case '#':
						result *= -2;
						break;
				}
			
			}
			System.out.println(result);
		}
		
	}	

}
