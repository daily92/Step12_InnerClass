package test.main;
/*
 *  Ŭ���� �ȿ� Ŭ���� inner class
 *  �޼ҵ� �ȿ� Ŭ���� local inner class
 */
public class MainClass02 {
	public static void main(String[] args) {
		// �޼ҵ� ���ο����� Ŭ������ ������ �� �ִ�.
		// Local Inner Class
		class White {
			public void say() {
				System.out.println("�ȳ� ���� White ��~");
			}
		}
		
		White w= new White();
		w.say();
	}
}
