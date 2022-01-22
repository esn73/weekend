package edu.java.ex02;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForMain {

	public static void main(String[] args) {
		//Key Value
		// String 타입의 키와 Object 타입의 값을 저장하는 HasMap 객체를 생성.
		// Object 타입을 저장한다는 것은 모든 타입의 값들을 저장할 수 있다는 의미.
		Map<String, Object> model = new HashMap<>(); // 다형성 toString 메서드
		model.put("name", "오쌤"); // get add put
		model.put("age", 16);
		
		List<String> phones = new ArrayList<>();
		phones.add("010-0000-0000");
		phones.add("02-0000-0000");
		
		model.put("phones", phones);
		
		System.out.println(model);
		System.out.println(model.keySet()); // keySet-> key만 리턴해줌 리턴타입set 리스트와 차이점 - set은 인덱스가 없음
											// list는 같은 값을 저장가능하지만 set은 X
		for (String k : model.keySet()) {
			Object value = model.get(k);
			System.out.println(k + "=" + value);
//			System.out.println(model.get(k));
		}
		
	}
}

