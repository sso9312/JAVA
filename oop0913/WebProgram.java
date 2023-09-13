package oop0913;

//웹페이지를 작성할 때 사용하는 언어
//.jsp .py .php .asp

class WebProgram {
	
	String title = "Java Program";
	
	class Language{
		String basic="JAVA, HTML, CSS, JavaScript";
		void display() {
			System.out.println("기초수업:" + basic);
		}//end
	}//inner class 
	
	class Smart{
		String basic="Objective-C, Java OOP, C#";
		void display() {
			System.out.println("기초수업:" + basic);
		}//end
	}//inner class
	
	void print() {
		Language lang=new Language();
		lang.display();
		
		Smart sm=new Smart();
		sm.display();
	}//print end

}//class end
