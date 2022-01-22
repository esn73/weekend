package edu.java.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileMain {

	public static void main(String[] args) {
		// while 반복문 
		int x = 2;		
		while (x <= 20) { // ~조건을 만족하는 동안에
			// x를 출력
			//블록안쪽에 실행하는 반복할 문장들;
			System.out.print(x + ", ");
			x += 2;
		}
		System.out.println();
		
		List<Integer> numbers = new  ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			numbers.add(i*3);
		}
		System.out.println(numbers);
		
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", "); // itr.next()  처음에 가지고 있는 원소리턴, 위치를 옮겨줌 
		}										// hasNext() + itr.next ->ResultSet은 다 함
		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("JavaScript");
		names.add("Pyton");
		System.out.println(names);
		
		Iterator<String> itr2 = names.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + ", ");
		}
		
		
	}

}
