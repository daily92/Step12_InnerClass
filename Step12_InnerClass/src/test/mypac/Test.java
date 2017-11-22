package test.mypac;
/*
 *  클래스 안에 클래스를 정의 할 수 있다.
 */
public class Test {
	/*
	 *  class 안에는 다음과 같은 것들을 정의할 수 있다.
	 *  	1. field
	 *  	2. Constructor	생성자
	 *  	3. Method	
	 *  	4. Class **		클래스 안에 클래스를 정의 할 수 있다.
	 */
	
	// White type 객체를 생성해서 리턴해 주는 메소드
	public White getWhite() {
		return new White();
	}
	
	// Black type 객체를 생성해서 리턴해 주는 메소드
	public Black getBlack() {
		return new Black();
	}
	
	// 내부 클래스 
	public class White{
		public void say() {
			System.out.println("안녕 난 흰둥이야!");
		}
	}
	// 내부 클래스 
	public class Black{
		public void say() {
			System.out.println("안녕 난 검둥이야!");
		}
	}
}
