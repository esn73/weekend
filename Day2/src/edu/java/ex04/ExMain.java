package edu.java.ex04;

// Java.lang 패키지의 클래스 이름들은 import 없이 사용가능
// 같은 패키지의 클래스 이름들은 import 없이 사용 가능.

public class ExMain {
	
	public static void main(String[] args) {
		// 클래스(class): 객체가 가져야 되는 속성(데이터)과 기능을 정의한 데이터 타입.설계도
		// 만들어진게 객체 -> 실제로 만들어진게 인스턴스
		// 속성: 멤버 변수(member variable), 필드(field), 프로퍼티(property)
		// 기능: 메서드(method)
		String s1 = "Hello, Java!";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s2 = "Good afternoon!";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		int hour = 14;
		int minute = 18;
		double second = 31.5;
		
		Time t1 = new Time(); // 기본 생성자(default constructor) default생성자가 자동으로 만들어져있음 -> 생성자를 하나도 안만들어면 자동으로 생성
		System.out.println(t1);
		System.out.println(t1.hour); //참조연산자-변수이름으로 찾아감 
		System.out.println(t1.minute);
		System.out.println(t1.second);
		
		Time t2 = new Time(14, 49, 30.0);// 파라미터를 갖는 생성자
		//int %d, .3f-?소숫점 뒷자리 개수 \n 다음줄
		System.out.printf("%d:%d:%.3f\n", t2.hour, t2.minute, t2.second);
//		String.format(format, args);
		
		Time t3 = new Time(3, 6, 0.0);
		System.out.printf("%d:%d%.3f\n", t3.hour, t3.minute, t3.second);
		// %d: digit(10진수), %f: floating-point(실수), %s: String(문자열)
	}

	
}
