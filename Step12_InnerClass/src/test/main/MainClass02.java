package test.main;
/*
 *  클래스 안에 클래스 inner class
 *  메소드 안에 클래스 local inner class
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 메소드 내부에서도 클래스를 정의할 수 있다.
		// Local Inner Class
		class White {
			public void say() {
				System.out.println("안녕 나는 White 야~");
			}
		}
		
		White w= new White();
		w.say();
	}
}
