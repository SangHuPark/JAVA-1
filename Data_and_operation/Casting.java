
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; // 자동으로 1을 실수형으로 저장
		double b2 = (double) 1; // 수동으로(명시적으로) 1을 실수형으로 저장
		System.out.println(b); // b 에 1을 저장해도 double형 변수에 저장하면 1.0 으로 converting -> 이 경우 데이터 손실은 없
		
		// int c = 1.1; // 1.1 이라는 실수형을 int에 저장하면 데이터 손실이 일어나 convertin 불가. (오류 발생)
		double d = 1.1;
		int e = (int) 1.1; // 1.1 을 강제로 정수형으로 바꾼다는 의미
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1); // 정수 1을 문자열로 전환하여 저장
		System.out.println(f.getClass());
	}

}
