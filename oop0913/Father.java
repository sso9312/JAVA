package oop0913;

class Father {//package생략되어 있다
			  //oop0913팩키지내에서만 사용가능하다
	//멤버변수 filed
	public String name="아버지";
	public String addr="주소";
	
	//생성자함수 constructor
	public Father() {}
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}//end
	
	

	//멤버함수 method
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}//disp() end

}//class end


class Son extends Father {
	public Son() {}
	public Son(String n, String a) {
		super.name= n;
		super.addr= a;
	}
}//class end

class Doughter extends Father{
	
	String friend="절친";
	
	public Doughter() {}
	public Doughter(String n, String a) {
		super(n, a);//부모생성자 함수 호출
	}
}//class end
