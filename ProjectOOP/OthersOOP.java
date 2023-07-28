import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// 사용한 class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt"); // new 로 인해 뒤에 따라오는 클래스는 data.txt에 저장하겠다는 상태를 저장한 FileWriter라는 클래스의 복제본(instance)이 생기는 것.
		f1.write("Hello");
		f1.write(" Java");

		
		FileWriter f2 = new FileWriter("data2.txt"); // f1 과는 다른 복제본(instance)
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close();
	}

}
