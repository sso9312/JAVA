package oop0907;

class School {//package 생략되어 있다
			  //School클래스 oop0907팩키지내에서만 사용가능하다
	
	//멤버변수 filed
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자함수 constructor
	//->클래스명과 동일한 함수
	//->리턴형이 없다
	//->public void School() {} 쓰지 않도록 주의!!
	public School( ) {//기본생성자 함수
					  //default constructor
					  //자동으로 생성된다
		System.out.println("School() 호출됨...");
	}//end
	
	
	//멤버함수 method
	public void calc() {
		aver=(kor+eng+mat)/3;
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	
	
	}//class end
