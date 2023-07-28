import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt"); // PrintWriter 메서드를 p1에 복사한 이유는
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt"); // new PrintWriter(); 는 클래스 내 constructor가 있어야 하는 것이고 이것이 컨스트럭터 선언
		p2.write("Hello 2");
		p2.close();
		
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
	}

}