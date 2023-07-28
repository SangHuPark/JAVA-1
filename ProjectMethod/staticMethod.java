class Print {
	public String delimiter;
	public void a() { // void형은 return 값이 없다는 뜻
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}
public class staticMethod {
	
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		// instance
		Print t1 = new Print();
		t1.delimiter = "-"; // t1이라는 Print 클래스의 instance에 delimiter에 -를 저장하면
		t1.a(); // 위 주석 처럼 instance 내 함수 호출 시 매번 인자를 전달하지 않고 호출만 하여 사용하더라도 t1.delimiter의 값이 전달된다.
		t1.b();
		Print.c("&"); // a라는 method는 static이 없는 즉, instance 소속이기 때문에 클래스를 통해 호출 불가하다.
		
		Print t2 = new Print();
		t1.delimiter = "*";
		t1.a();
		t1.b();
	}

}
