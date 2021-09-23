package kakao4;

public class DeletMate {

	public static void main (String args[]) {
	
		String s = "caacdkfblkdjbkldfbssddaaccbboorrsdvsdlvkdslbkfdaa";
		int result = 0;
		StringBuffer sTemp = new StringBuffer();
		sTemp.append(s);
		
		int i = 0;
		while(result == 0) {
			
			if(sTemp.charAt(i) == sTemp.charAt(i + 1)) {
				sTemp = sTemp.delete(i , i + 2);
				i = -1;
			}
			System.out.println("sTemp length : " + sTemp.length()+" i val :" + 
								i );
		if(sTemp.toString().equals("") || i  +  2 == sTemp.length() )
			result = 1;
			System.out.println( "Stemp : " + sTemp.toString());
			i++;
		}
		result = sTemp.toString().equals("")?1:0;
		System.out.println("result : " + result);
	}
	
	
	
	/*import java.util.Stack;
	 
	public class Solution {
	    public static int solution(String s) {
	        Stack<character> stack = new Stack<>();
	         
	        for(char c : s.toCharArray()) 
	          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
	          else stack.push(c);
	         
	        return stack.isEmpty() ? 1 : 0;
	    }
	}
 	*/ 
	//스텍을 이용한 문제 였다..... 하하 현
}
