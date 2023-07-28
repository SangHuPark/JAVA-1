package javaFlowControl;

public class AuthApp {

	public static void main(String[] args) {
		
		String id = "SangHu";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		// if(inputId == id) { --> == 란 같은 곳을 가르키고 있는지 비교하는 것. 원시(primitive) 데이터 타입은 같은 곳을 가르킴
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");	
		} else {
			System.out.println("Who are you?");
		}
	}

}
