
public class Car {
	int model;	// 필드
	int speed;
	
	void forward() { // 동작 ==> 메소드 (함수)
		int num; 	// 로컬변수, 스택변수, 임시변수, 블럭변수
		System.out.println("전진...");	
	}
	void backward() {
		System.out.println("후진...");
	}
	
	public static void main(String[] args) {
		int num;	// 로컬변수, 스택변수, 임시변수, 블럭변수
		
		Car c1 = new Car();		// 객체 생성
		c1.forward();
		c1.backward();
		
		Car c2 = c1;
		
		c1 = null;
	}

}
