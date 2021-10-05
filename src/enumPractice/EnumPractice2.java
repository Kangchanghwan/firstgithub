package enumPractice;


public class EnumPractice2 {
	
	
	public static void main(String arg[]) {
		
		for(Direction d : Direction.values()) {
			System.out.printf("%s = %d%n" , d.name() , d.getValue());
		}
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.of(1);
		
		System.out.printf("d1= %s , %d%n", d1.name(), d1.getValue());
		System.out.printf("d1= %s , %d%n", d2.name(), d2.getValue());
		System.out.println(Direction.EAST.rotate(1));
		System.out.println(Direction.EAST.rotate(2));
		System.out.println(Direction.EAST.rotate(-1));
		System.out.println(Direction.EAST.rotate(-2));
		System.out.println(Direction.EAST.rotate(-55));
	}

}

enum Direction {
	EAST (1, ">") , SOUTH(2,"V") , WEST(3,"<") , NORTH(4,"^");
	// 속성을 가진 필드 지
	private static final Direction[] DIR_ARR = Direction.values();
	//Drection 배열을 가지는 상수 DIR_ARR 는 Direction 값들을 초기값으로 가진다.
	private final int value;
	private final String symbol;
	
	Direction (int value ,String symbol){
		this.value = value;
		this.symbol = symbol;
	} //Direction 생성자이며 private 이다.
	
	public int getValue() {return this.value;} // private이기 때문에 값을 꺼내올 메서드이다.

	public String getSymbol() { return this.symbol;}

	// 가지고 있는 객체배열 중 인수를 받아 반환하는 매서드.
	public static Direction of (int dir) {
	if( dir < 1 || dir > 4) {
		throw new IllegalArgumentException("Invalid value : " + dir);
		}
	return DIR_ARR[dir - 1];
		
	}
	//방향을 회전시키는 메서드 num의 값만큼 90도씩 시계방향으로 회전된다.
	public Direction rotate(int num) {
		num = num %4 ;
		if(num < 0) num += 4 ; // num이 음수떄는 시계반다방향으로 회전.
		return DIR_ARR[(value - 1 +num)];
	}
	public String toString () {
		return name () + getSymbol();
	}
}


