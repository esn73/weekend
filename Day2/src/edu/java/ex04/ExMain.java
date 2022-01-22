package edu.java.ex04;

import java.util.HashMap;
import java.util.Map;

// Java.lang 패키지의 클래스 이름들은 import 없이 사용가능
// 같은 패키지의 클래스 이름들은 import 없이 사용 가능. time

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
		System.out.println(t1);//println메서드는 객체의 toString() 메서드가 리턴하는 문자열을 콘솔에 출력함. t1객체가 자동으로 toString메서드를 호출
//		System.out.println(t1.hour); //참조연산자-변수이름으로 찾아감 
//		System.out.println(t1.minute);
//		System.out.println(t1.second);
		
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
		
		
		Time t2 = new Time(14, 49, 30.0);// 파라미터를 갖는 생성자
		//int %d, .3f-?소숫점 뒷자리 개수 \n 다음줄
		
		System.out.printf("%d:%d:%.3f\n",
				t2.getHour(), t2.getMinute(), t2.getSecond());
		//System.out.printf("%d:%d:%.3f\n", t2.hour, t2.minute, t2.second);
//		String.format(format, args);
		
		Time t3 = new Time(3, 6, 0.0);
		System.out.printf("%d:%d:%.3f\n",
				t3.getHour(), t3.getMinute(), t3.getSecond());
//		System.out.printf("%d:%d%.3f\n", t3.hour, t3.minute, t3.second);
		// %d: digit(10진수), %f: floating-point(실수), %s: String(문자열)
		
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		Time t4 = new Time(15, 50, 0.0);
		Time t5 = new Time(15, 50, 0.0);
		System.out.println(t4 == t5); // 주소를 호출해서 비교false -> equals
		System.out.println(t4.equals(t5)); // 연산자를 호출해서 비교 -> true
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("a", "한");
		map2.put("a", "글"); // 원소 1개 글로 덮어씌움
		System.out.println(map2);
		
		
		Map<Time, String> map = new HashMap<>();
		map.put(t4, "adc");
		map.put(t5, "def"); // 원소2개
		System.out.println(map);
		
	}

	
}
