package oop0913;

abstract class Travel {				//추상메소드
	void view() {}					//일반메소드
	abstract String trvelWhere();	//추상메소드

}//class end

class TyepA extends Travel {
	@Override
	String trvelWhere() {
		return "제주도 올레길";
	}
}//class end

class TyepB extends Travel {
	@Override
	String trvelWhere() {
		return "여의도 벚꽃 축제";
	}
}//class end

class TyepC extends Travel {
	@Override
	String trvelWhere() {
		return "지리산 둘레길";
	}
}//class end
