package javaFlowControl;

public class ArrayApp {

	public static void main(String[] args) {
		
		// sanghu, egoing, jinhuck
//		String users = "sanghu, egoing, jinhuck";
		String[] users = new String[3]; // 배열형 변수 선언 후 크기 지정
		users[0] = "sanghu";
		users[1] = "egoing";
		users[2] = "jinhuck";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
