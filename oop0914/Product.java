package oop0914;

class Product extends Object {
			//extends Object 생략가능
	
	public int price;		//상품가격
	public int bonusPoint;	//마일리지
	
	public Product () {}//default constructor
	public Product(int price) {
		//this.멤버변수=지역변수
		this.price = price;
		//상품가격의 10%를 보너스 점수 책정
		this.bonusPoint=(int)(price*0.1);
	}//end
}//class end

class SmartTV extends Product {
	public SmartTV() {
		super(100);//상품가격 price 100, bonusPoint=10
	}
	@Override
	public String toString() {
		return "스마트TV";	//상품명
	}
}//class end

class Notebook extends Product {
	public Notebook() {
		super(200); 	//상품가격 price 200, bonusPoint=20
	}
	@Override
	public String toString() {
		return "노트북";	//상품명
	}
}//class end

class HandPhone extends Product {
	public HandPhone() {
		super(150); 	//상품가격 price 150, bonusPoint=15
	}
	@Override
	public String toString() {
		return "핸드폰";	//상품명
	}
}//class end






