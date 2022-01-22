import java.util.ArrayList;

public class ForMain {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	
	
	String[] names = {"Java", "JavaScript", "Python" };
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		}
	
	// 향상된 for구문 (enhanced for statement)
	// itreable 타입: 배열, List, Map, Set, ...
	for (String s : names) {
		System.out.println(s);
		}
	
		// 정수를 저장하는 ArrayList를 생성
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 리스트 numbers에 2, 4, 6, ..., 20을 저장
		for (int i = 1; i<10; i++) {
			numbers.add(i*2);
				
		}
		
		// 리스트 number에 저장된 값들을 한줄로 출력.
		for (int i =0; i < numbers.size(); i++) { // **배열은 length 리스트는 size
		System.out.print(numbers.get(i) + " ");
		
	}
		System.out.println();
		
		for (Integer e : numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}

