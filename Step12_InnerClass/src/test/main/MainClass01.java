package test.main;

import test.mypac.Test;
import test.mypac.Test.Black;
import test.mypac.Test.White;

public class MainClass01 {
	// static �޼ҵ�
	public static void main(String[] args) {
		Test t= new Test();
		
		White w= t.getWhite();
		w.say();
		
		Black b= t.getBlack();
		b.say();
		//main �޼ҵ� ���̶�� Ư���� ��Ȳ�� �־ static �־�� ���� => ����!!
		//=> �� Test.java �� �޼ҵ带 �����
		//Test.java ���� White Ŭ������ static ���̸� new White() ����
		//White white= new White();
	}
}
