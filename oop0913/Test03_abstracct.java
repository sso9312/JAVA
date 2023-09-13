package oop0913;

public class Test03_abstracct {

	public static void main(String[] args) {
		// 추상클래스와 다형성
		//Traval 클래스 생성해서 실습합니다~
		
		Travel tour = new TyepA();
		System.out.println(tour.trvelWhere());
		
		tour = new TyepB();
		System.out.println(tour.trvelWhere());
		
		tour = new TyepC();
		System.out.println(tour.trvelWhere());
	
	}//main() end
}//class end
