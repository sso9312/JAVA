package oop0911;

class Korea {
	String name="대한민국";
	
	final void view() {
		System.out.println("Korea.view()...");
	}//view() end
	
	void disp() {
		System.out.println("korea.disp()..."+ name);
	}//disp() end

}//class end

class Seoul extends Korea {}//class end

class Busan extends Korea {
	String name="부산광역시";
	
	@Override //<-annotation 상속관계에서 리폼
	void disp() {
		System.out.println("Busan.disp()..."+ name);
	}
	/*
		@Override 
		void view() {} 에러. final 메소드는 더이상 오버라이드할 수 없다
	*/
	
	
}//class end
