package kakao7;

import java.util.HashMap;


public class Multi_levelToothbrushSales {
	
	
	
	public static void main (String arg[]) {
		HashMap<String, Person> personMap = new HashMap<>();
		
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] refferral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		int[] result = new int[enroll.length];
	
		for(String name : enroll) {
			personMap.put(name, new Person(name, null , 0));
		}
		for(int i = 0 ; i <enroll.length ; i++) {
			if (refferral[i].equals("-")) continue;
			personMap.get(enroll[i]).parent = personMap.get(refferral[i]);
		} // enroll의 수만큼 반복하여 하이픈(-)인경우 포문을 넘어가고
	 // 아닌경우 personMap에서 이름을 키로가진 Person 객체의 parent를 refferral 에 기입된 순서대로 대입.
		
		for(int i = 0 ; i < seller.length ; i ++) {
			personMap.get(seller[i]).calcProfit(amount[i]*100);
			//포문을 돌려  seller를 키로 가진 펄슨객채에 판매수량 x 100을 한 값을 대입.
		}
		for(int i = 0; i < result.length ; i ++ ) {
			result[i] = personMap.get(enroll[i]).profit;
			System.out.println("result [" + i + "] = " + result[i]);
		}
		
		
	
	}
	
}


class Person {
	
	String name;
	Person parent;
	int profit;
	
	public Person(String name, Person parent, int profit) {
		this.name = name;
		this.parent = parent;
		this.profit = profit;
	 }
	public void calcProfit(int profit) {
		int profitToParent = profit / 10 ;
		// 매개변수 profit을 10으로 나눈 값을 부모에게 줄 금액에 대
		this.profit += profit - profitToParent;
		// 셍성자의 객체의 profit에 부모에게 줄 프로핏을 빼주
		if(this.parent != null && profitToParent >= 1) {
			this.parent.calcProfit(profitToParent);
			// 부모가 있거나 수수료의 값이 1 이상인경우 재귀함수를 이용하여 그 부모에게 다시 넘겨줌.
		}
	}
	
	
}