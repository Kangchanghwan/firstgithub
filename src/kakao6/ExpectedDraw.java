package kakao6;

public class ExpectedDraw {
	
	public static void main(String args[]) {
		
		int n = 2048;
		int a = 1506;
		int b = 1507;
		int ans = 0;
		
		while(a != b) {
			
			a = a/2 +1;
			b = b/2 +1;
			
			ans++;
			
		}
		System.out.println(ans);
		
	}

}
