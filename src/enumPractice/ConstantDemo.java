package enumPractice;

enum Fruit{
	APPLE, PEACH, BANANA;
	Fruit(){ // enum은  생선자를  가질수 있으나 private만을 허용험.
	 System.out.println("Call Constructor" + this);	
	}
}
enum Company{
	COOGLE("blue"), APPLE("pink"), ORACLE("yellow");
	public String color;
	Company(String color){ 
		System.out.println("Call Const " + this);
		this.color = color;
	}
	String getColor() { // enum은 메소드도 사용할 수 있다.
		return this.color;
	 }
}


public class ConstantDemo {

	//enum 은 열거형(enumerated type)이라고 부른다. 열거은 서로 연관된 상수들의 집합이라고 할 수 있다.
	
	public static void main(String[] arg) {
		
		System.out.println("Fruit APPLE : " + Fruit.APPLE + "형태는? " +Fruit.APPLE.getClass().getName());
		//가지고 있는 값은 APLLE 
		System.out.println("Company APPLE : " + Company.APPLE + "형태는? : " + Company.APPLE.getClass().getName());
	
		//가지고 있는 값은 APLLE 
		
		if(Fruit.APPLE.toString().equals(Company.APPLE.toString())) {
			System.out.println("둘이 가지고 있는 값이 같다.");
		} // 값을 비교 형변환 오류발생.. equals 사용하여 비교하거나 형태를같게해줌.
		// 다르게 말하면 서로 다른상수 그룹에 대란 비교를컴파일 시점에서 차단할 수있음,
		
		if((Object)Fruit.APPLE == (Object)Company.APPLE) {
			System.out.println("upcasting after compair");
		} //형 변환했으나 주소비교만될뿐 값 비교는 Equals 사용이 불가피.
		
		Company type = Company.APPLE;
		switch (type) {
		case APPLE:
			System.out.println(57 + "kcal"+ Company.APPLE.getColor());
			break;
		case COOGLE:
			System.out.println(57 + "kcal"+ Company.COOGLE.getColor());
			break;
		case ORACLE:
			System.out.println(57 + "kcal"+ Company.ORACLE.getColor());
			break;
		default:
			break;
		}
		
		for(Company c : Company.values()) {
			System.out.println(c + " ," + c.getColor());
		}
		
	}
	// enum은 상수집합 class로써 메소드 생성자를 가질 수 있다. 따라서 다양하게 이용할 수 있다.
	
}
