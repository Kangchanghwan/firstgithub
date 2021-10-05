package enumPractice;

public class PowerSwitchMain {

	public static void main(String[] args) {
		
		PowerSwitch powerSwitch = PowerSwitch.OFF;
		displayByPowerSwitch(powerSwitch);
	}
	
	public static void displayByPowerSwitch(PowerSwitch powerSwitch) {
		
		if(powerSwitch == powerSwitch.ON) {
			System.out.println("전원을 ON 합니다.");
		}else {
			System.out.println("전원을 OFF 합니다.");
		}
		
	}

}
