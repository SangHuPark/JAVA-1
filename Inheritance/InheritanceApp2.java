class Cla {
	int v1, v2;
	Cla(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}

class Cla3 extends Cla {

	Cla3(int v1, int v2) {
		// 여기서 super는 부모 클래스 생성자를 호출
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		Cla c = new Cla(2,1);
		
		Cla3 c3 = new Cla3(2, 1);
		System.out.println(c3.sum()); // 부모의 sum을 찾아 3 반환
		System.out.println(c3.minus()); // 자식 클래스 내 minus를 실행해 1 반환
	}

}

/*
 * Polymorphism: 상속을 하면서 기능이 늘어나다보면 클래스 간의 호환성이 떨어져 클래스를 다른 클래스로 교체하는 것이 어려워진다.
 * 				이를 위 자식 클래스를 부모 클래스로서 동작하도록 규제하는 것이 다형성. Polymorphism 
 * Access Modifiers: public, default, protected, private 네 가지로 분류되는 접근 제어자
 * 					사용자들이 아무거나 건들이지 못하도록 권한에 따라 조작할 수 있도록 규제하는 것.
 * Final: 자신의 클래스를 다른 사용자가 상속, Overriding, 변수의 수정 등을 못하게 하는 것.
 * Abstract: Final과 반대로 클래스를 상속하려는 사용자에게 특정한 메서드를 꼭 구현하도록 강제하는 것. Abstract Class className { 
 */