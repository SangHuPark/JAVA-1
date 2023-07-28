class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	void print() {
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend : "+ getDividend1() );
		System.out.println("Dividend : "+ getDividend2() );
		System.out.println("Dividend : "+ getDividend3() );
	}
	
	private double getDividend1() {
		return getIncome() * 0.5;
	}
	private double getDividend2() {
		return getIncome() * 0.3;
	}
	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}

}

public class AccountingClassApp {
	
	public static void main(String[] args) {
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		// anotherVariable = ...;
//		// anotherMethod = ...;
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
		
		Accounting a1 = new Accounting(); // Class 이름 앞에 new를 붙여 만들어진 것을 Instance라 한다. 이때 클래스에서는 static이 사용되어서는 안된다.
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}

}
