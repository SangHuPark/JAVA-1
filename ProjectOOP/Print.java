
class Print {
	public String delimiter;
	public Print(String delimiter) { // instance 생성시, JAVA는 클래스 네임과 같은 이름의 메서드가 있다면 그 메서드를 호출하도록 약속되어 있다. --> 초기화의 목적을 달성.
		this.delimiter = delimiter;
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}