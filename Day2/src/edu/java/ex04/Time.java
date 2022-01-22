package edu.java.ex04;

public class Time { 
	// 멤버 접근 수식어(access modifier): private < (package) < protected < public
	private int hour;
	private int minute;
	private double second;
	
	// 생성자 오버로딩(overloading)
	public Time( ) {}
	
	//Time( ) {} -> package
	
	public Time(int hour, int minute , double second) {
		this.hour = hour; // this-> Heap의 확보된 메모리 공간
		this.minute = minute;
		this.second = second;
	}
	
	// 메서드
	public String toString() {
		return String.format(
				"%02d:%02d:%06.3f", 
				this.hour, this.minute, this.second);
	}
	
	public boolean equals(Object other) { //Time other 다형성
		boolean result = false;
		if(other instanceof Time) { // other가 Time 클래스의 인스턴스이면
			Time t = (Time) other; // other를 Time 타입으로 강제 변환(casting)
			result = (this.hour == t.hour) &&(this.minute == t.minute) &&(this.second == t.second);
		} 		
		
		return result;
	}
	
	public int hashCode() {
		return Integer.valueOf(this.hour).hashCode()+
			   Integer.valueOf(this.minute).hashCode()+
			  Double.valueOf(this.second).hashCode();
	}
	
	public int getHour() {
		return hour; //this.hour
	}
	
	public int getMinute() {
		return minute;
	}
	
	public double getSecond() {
		return this.second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
		
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(double second) {
		this.second = second;
	}
	
}
