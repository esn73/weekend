package edu.java.operator;

import java.util.Scanner;

/**
 * 단위 환산 프로그램: cm -> feet inch. (예) 170cm = ? ft ? in
 * 1 inch = 2.54 cm
 * 1 feet(foot) = 12 inch
 * 변환할 cm를 실수로 입력받고 feet와 inch로 변환한 값을 출력
 * 
 * @author knit
 *
 */

public class OperatorMain {
	// 멤버 변수(member variable)
	// 생성자호출OperatorMain때, static이 붙을경우 main이 실행되기전에
	public static final double CM_PER_INCH = 2.54; // 2.54cm = 1 inch
	public static final int INCH_PER_FOOT = 12; // 12 inch = 1 ft
	// static 지역 heap 생성자호출 method 생성자 시작될때 final 상수 변하지 않게 선언.
	// static - 메인이 호출되기전에 메모리 확보
	public static void main(String[] args) {
		
		// 지역 변수(local variable)
		Scanner sc = new Scanner(System.in); //stack메모리 sc 주소 Scanner Heap메모리
		//변환할 cm 값을 입력받음.
		System.out.println("cm 값 입력>>"); // .객체가가지고있는
		//double cm = sc.nextDouble();
		
		double cm; // 변수 선언문(declaration) -> JVM(자바가상머신)이 메모리를 확보, 이름 붙여줌
		// double cm = sc.nextDouble() 
		cm = sc.nextDouble(); //변수에 값을 할당(assignment) - > 그메모리에 앖을 씀. 위에랑 같이 쓸경우 다른 값을 할당
		System.out.println(cm + "cm");
		
		// double inches = cm / CM_PER_INCH;
		int inches = (int) (cm / CM_PER_INCH); //casting: 강제 타입 변환 / 계산식 expression 
		System.out.println(inches + "in");
		
		int feet = inches / INCH_PER_FOOT;
		int remainer = inches % INCH_PER_FOOT;
		System.out.println(feet + " ft." + remainer + "in");
		
	}

}
