class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// Overloading: 함수 중복, 같은 이름의 메서드이지만 형태가 달라 구분되어 사용하는 것.
	// 자식 클래스에서 사용 시, 부모가 가진 메서드에 기능을 추가하면서 부모가 가진 메서드와 이름이 같은 것과 함께 중복하여 공존하는 것. (상속과 관련 없음)
	public int sum(int v1, int v2, int v3) {
		// this: 자신이 속한 범위 내에서 탐색, 수행
		return this.sum(v1, v2) + v3;
	}
}

// 상속은 어떤 클래스가 있을 때 그 클래스가 가진 변수와 메서드를 상속, 확장하여 유지보수 효율성을 높이고 재사용성을 높이는 것.
class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	// Overriding: 부모 클래스가 가진 기능을 덮어쓰기한다. --> 기능을 추가할 수 있다. (함수 재정의)
	public int sum(int v1, int v2) {
		System.out.println("Call3!");
		// super: 부모 클래스 내 메서드를 계승, 발전하는 의미로 사용, super를 통해 같은 이름의 부모 클래스 소속 메서드를 호출할 수 있다.
		return super.sum(v1, v2);
	}
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3(); // Cal3에는 sum 함수가 없으나 Cal 클래스를 상속받아 확장하고 있어 Cal 클래스의 sum 함수를 찾고 그것을 사용.
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1));
	}

}

// 뺄셈 함수 minus를 추가하기 위해 Cal2 생성
// 다만 덧셈 함수 sum을 변경하고 싶을 때 Cal, Cal2 클래스 내 sum 함수 모두를 수정해야 하므로 이러한 함수가 늘어나면 인지하고 해결할 수준을 넘어선다.
// 즉, sum 함수의 중복이 이루어져 정리하고 싶어지므로 Cal 3 생성
class Cal2 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}