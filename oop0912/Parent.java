package oop0912;

class Parent extends Object {
	int one, two;

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(int one, int two) {
		this.one = one;
		this.two = two;
	}


}//class end
	
	
class Child extends Parent {
	int three;
	public Child() {
		super(); //생략가눙
	}
	public Child(int a, int b, int c) {
		//상속받은 멤버변수(one, two)에 초기값 전달
		super(a, b);
		this.three = c;
		
		//주의) one, two멤버변수가 private속성이면 에러 발생
		//super.one=a;
		//super.two=b;
	
	}
}//class end