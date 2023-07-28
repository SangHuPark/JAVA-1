package javaFlowControl;

public class LoopArray {

	public static void main(String[] args) {
		/*
		 * <li>sanghu</li>
		 * <li>egoing</li>
		 * <li>jinhuck</li>
		 */
		
		String[] users = new String[3];
		users[0] = "sanghu";
		users[1] = "egoing";
		users[2] = "jinhuck";

		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i]+",");
		}
	}

}
