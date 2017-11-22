package test.main;

import test.mypac.Test;
import test.mypac.Test.Black;
import test.mypac.Test.White;

public class MainClass01 {
	// static 메소드
	public static void main(String[] args) {
		Test t= new Test();
		
		White w= t.getWhite();
		w.say();
		
		Black b= t.getBlack();
		b.say();
		//main 메소드 안이라는 특별한 상황이 있어서 static 있어야 가능 => 복잡!!
		//=> 걍 Test.java 에 메소드를 만들어
		//Test.java 에서 White 클래스에 static 붙이면 new White() 가능
		//White white= new White();
	}
}
