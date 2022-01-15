package edu.java.control;

public class ControlMain {

	public static void main(String[] args) {
		// Control statement(제어문): 조건문(if, switch), 반복문(for, while, do-while)
		
		int x = 0;
		int y = 10;
		
		if (x > 0) {
			System.out.println("양수");;
		}else if (x==0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		
		
		if (x > 0) {
			//(1)
		}else {
			//(2)
			if (x == 0) {
		} else {
			
		}
	}

		if (x > 0 && y > 0) {
			// TODO
		}
		
		if(x > 0) { // 위랑 같은 코드
			if (y > 0) {
				// TODO
			}
		}
		
		
	}
}






// 자바스크립트 var x = 0; (0)없고 1은 있고 그외 2이상은 나머지
// if (x){ 자바는 boolean 타입만 올수있음
//}else {
//}