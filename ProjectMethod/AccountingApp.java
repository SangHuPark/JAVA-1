class Accounting {
	public double valueOfSupply;
		
	public static double vatRate = 0.1; // 어떤 인스턴스던 부가가치세율은 고정으로 적용되기 때문에 이럴 경우 인스턴스 소속보다는 클래스 소속으로 처리하는게 좋다. 왜냐면 인스턴스형으로하면 인스턴스를 만들때마다 메모리에 이 변수의 자리 또한 할당되기 때문
		
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		return this.valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return this.valueOfSupply + getVAT();
	}
}
public class AccountingApp {
	
	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0); // Accounting a1은 인스턴스형 변수.
//		a1.valueOfSupply  = 10000.0; // 인스턴스 선언 시 매번 지정해야 하기 때문에 생성자로 변경
		
		Accounting a2 = new Accounting(20000.0);
//		a2.valueOfSupply  = 20000.0;
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());

	}

}
