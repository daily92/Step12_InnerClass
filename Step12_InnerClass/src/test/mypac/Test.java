package test.mypac;
/*
 *  Ŭ���� �ȿ� Ŭ������ ���� �� �� �ִ�.
 */
public class Test {
	/*
	 *  class �ȿ��� ������ ���� �͵��� ������ �� �ִ�.
	 *  	1. field
	 *  	2. Constructor	������
	 *  	3. Method	
	 *  	4. Class **		Ŭ���� �ȿ� Ŭ������ ���� �� �� �ִ�.
	 */
	
	// White type ��ü�� �����ؼ� ������ �ִ� �޼ҵ�
	public White getWhite() {
		return new White();
	}
	
	// Black type ��ü�� �����ؼ� ������ �ִ� �޼ҵ�
	public Black getBlack() {
		return new Black();
	}
	
	// ���� Ŭ���� 
	public class White{
		public void say() {
			System.out.println("�ȳ� �� ����̾�!");
		}
	}
	// ���� Ŭ���� 
	public class Black{
		public void say() {
			System.out.println("�ȳ� �� �˵��̾�!");
		}
	}
}
