package edu.java.method;

// 함수 (function): 기능을 담당하는 순서대로 작성되 문장들의 배열.
// 메서드(method): 객체가 가지고 있는 함수. 클래스 안에서만 생성가능.
// Java는 메서드만 선언/사용 가능. 
// Java는 메서드는 클래스 안에서만 선언 가능.
// Java는 메서드 안에서 내부 메서드를 선언할 수 없음.

// stack: FILO(First In, Last Out) 첫번째로 만든 함수는 가장 마지막에 지워짐.
// queue : FIFO(First In, First Out)

public class MethodMain { // 메인은 객체가 없어도 호출됨

	public static void main(String[] args) { // 메서드 안에는 메서드를 호출할 수 x, 클래스 안에서 메서드 선언, 호출 가능
		// print(); //메서드는 객체없이 호출이 안됌
		int hour = 15;
		int min = 48;
		
		// 메서드 호출
		// parameter(파라미터): argument 메서드를 호출하는 곳에서 전달하는 값.
		print(hour, min); 
		System.out.println(hour + ":"+ min);
		
		MethodMain obj = new MethodMain(); // 지역 변수 obj에 첫번째 객체의 주소값이 저장
		System.out.println(obj);
		obj = new MethodMain(); // 지역 변수 obj의 값이 두번 째 객체의 주소 값으로 변경
		// 첫번째 객체를 가리키는 변수가 없어짐.
		// -> Garbage collector가 동작해서 사용되지 않는 객체를 Heap에서 삭제
		System.out.println(obj);
		
//		print(15,48);
//		
//		class A {
//			public void t() {}
//		}
//		A a = new A();
//		a.t();
	}
	
	// 메서드 선언(정의)declaration
	public static final void print(int hour, int min) { // static은 메인에서 사용하기 위해서 붙임 final 상수 변환 x override도 할 수 X
														// 파라미터 안에 변수는 메인 print안에서 가져옴 메서드가 끝나서 되돌아가서 계산
		hour += 1;
		min ++;
		System.out.println(hour + ":" + min); // {} body가 있으면 추상메서드를 사용할 수 없음
	}
	
	public void print() {}

} // JavaScript: 기능 - 함수, 메서드
