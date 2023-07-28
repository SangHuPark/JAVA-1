class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // Error
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error, 즉 instance 변수는 instance를 통해서만 사용 가능
		Foo.classMethod();
//		Foo.instanceMethod(); // instance 소속이기 때문에 class를 통해서 접근하는 것은 불가.
		
		Foo f1 = new Foo(); // f1 내에 class 소속인 classVar와 classMethod를 가르키게 된다. 복사가 아니기 때문에 한 쪽에서 변경 시 같이 변경된다.
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
	}

}
