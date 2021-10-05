package Calculator;

import java.util.HashMap;
import java.util.Map;

//interface Calculator {
//	double calculate(double num1, double  num2);
//}
// 인터페이스를 정의
//class DivideCalculator implements Calculator{
//	@Override
//	public double calculate(double num1, double num2) {
//		// TODO Auto-generated method stub
//		return num1 / num2;
//	}
//} 인터페이스 임플하여 사
//class MinusCalculator implements Calculator{
//	@Override
//	public double calculate(double num1, double num2) {
//		// TODO Auto-generated method stub
//		return num1 - num2;
//	}
//}
//class PlusCalculator implements Calculator{
//	@Override
//	public double calculate(double num1, double num2) {
//		// TODO Auto-generated method stub
//		return num1 + num2;
//	}
//}
//class MultiplyCalulator implements Calculator{
//	@Override
//	public double calculate(double num1, double num2) {
//		// TODO Auto-generated method stub
//		return num1 * num2;
//	}
//}

enum Calculator {
	PLUS {
		public double calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
		}
	},
	MINUS {
		public double calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
		}
	},
	MULTIPLY {
		public double calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;}
	},
	DIVIDE {
		public double calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 / num2;}
	};
	
	public abstract double calculate(double num1, double num2);
	
	
}

class CalculatorMapping{
	private static Map <String , Calculator> calculatorMap = new HashMap<>();
	static {
		calculatorMap.put("+", Calculator.PLUS);
		calculatorMap.put("-",Calculator.MINUS);
		calculatorMap.put("*", Calculator.MULTIPLY);
		calculatorMap.put("/", Calculator.DIVIDE);
	}
	public static Calculator geCalculator(String operator) {
		return calculatorMap.get(operator);
	}
}


public class WithoutIfCalculator {
//우아한 테크코스 문자열 계산기를 if문 없이 해결하기 단위 테스트
//문제 3 + 2 * 4 / 10 문자열을 space 기준으로 split하고 계산(사칙연산 우선순위는 무시한다.)
	
	
	public static void main(String arg[]) {
		String calc = "3 + 2 * 5 / 10 ";
		String[] cArr = calc.trim().split(" ");
		double result  =  Double.parseDouble(cArr[0]);
		
		for(int i = 1; i < cArr.length ; i += 2) {
			String operator = cArr[i];
			double num = Double.parseDouble(cArr[i+1]);
			result = calculate(operator, result, num);
		}
//		
//		for(int i = 0 ; i < cArr.length ; i ++) {
//			
//			switch (cArr[i]) {
//			case "+":
//				result += Integer.parseInt(cArr[i + 1]);
//				i++;
//				break;
//			case "-":         
//				result -= Integer.parseInt(cArr[i + 1]);
//				i++;
//				break;	
//			case "/":
//				result /= Integer.parseInt(cArr[i + 1]);
//				i++;
//				break;
//			case "*":
//				result *= Integer.parseInt(cArr[i + 1]);
//				i++;
//				break;
//			default:
//				break;
//			}
//			System.out.println("result : " + result);	
//		}enum을 사용하지 않았을 경우 위같이 사용한다.
		System.out.println("result : " + result );
		 
	}

private static double calculate(String operator, double result, double num) {
	// TODO Auto-generated method stub
	return CalculatorMapping.geCalculator(operator).calculate(result, num);
}
	
}
