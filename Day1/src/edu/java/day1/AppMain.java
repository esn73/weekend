package edu.java.day1; // 소스코드 컴파일이 저장된 폴더
/**
 * 
 * @author knit
 *
 */

public class AppMain {
	
/**
 * 
 * @param args
 */
	public static void main(String[] args) { //메인메서드 public static-수식어 순서변경가능 void-리턴타입 수식어+리턴타입
		// 파라미터-지역변수 아규먼트(argument) 값 메서드를 호출할때  / args-자바런타임이 실행(호출)할때 값을 채움
		System.out.println("Hello, Java!"); // 문장(statement) 클래스.변수.메서드() 클래스엔 static만 접근가능
		System.out.println();
		
		int x = 1;
		int y = 2;
		int z = x + y;
		MySystem.out.println("");
		

	}

}


class MySystem {
	public static MyPrinter out = new MyPrinter(); // 멤버변수 생성자
}

class MyPrinter { //메서드
	public void println() {}
	public void println(String s) {
		//overloading
	}
}


