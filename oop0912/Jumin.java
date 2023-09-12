package oop0912;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Jumin {
	private String juminno; //주민번호
	
	public Jumin() {}
	public Jumin(String juminno) {
		this.juminno = juminno;
	}//end
	
	public boolean validate() {
		boolean flag = false;
		
		//문제) 주민번호가 맞다면 flag변수값을 true 대입하시오
		Integer[] CHECKKUN = {2,3,4,5,6,7,8,9,2,3,4,5};
		Integer[] save = new Integer[12];
		int hap = 0;
		int size = save.length;
		
		for(int i=0; i<size; i++) {
			//주민번호에서 한글자씩 가져와서 정수형 변환
			int num=Integer.parseInt(juminno.substring(i, i+1));
			save[i]=num * CHECKKUN[i]; //8*2
			hap=hap+save[i];
		}//for end
		
		//오류 검증 번호
		int M=(11-(hap%11))%10;
		
		//오류검증번호와 주민번호 마지막 글자와 같은지?
		if(M==Integer.parseInt(juminno.substring(12))) {
			flag=true;
		}//if end
		
		
		return flag;
		
	}//validate() end
	
	/*
	int size = juminno.length();
	int sum = 0; 
	int multi = 2; //2,3,4,5... 곱할때 쓰이는것.
	for(int i=0; i<size-1; i++) {
		if(multi > 9) {
		multi = multi - 8;
		sum = sum + multi*((int) juminno.charAt(i) - 48);
		multi = multi + 1;
		} else {
		sum = sum + multi*((int) juminno.charAt(i) - 48);
		multi = multi + 1;
		}
	}
String mn = juminno.substring(size-1,size);
	int ms = (11 - sum%11)%10;
	if(Integer.parseInt(mn) == ms) {
		flag = true;
	}*/
	
	public void disp() {
		
	
	//문)생년월일, 성별, 나이, 띠 출력하기
			/*
			    생년월일 : 1989년 12월 30일
			    성별    : 남자
			    나이    : 34 -> GregorianCalendar클래스 이용
			    띠     :    -> 태어난%12 (0원숭이 1닭 2개 ~~ 11양)
			*/
		GregorianCalendar now=new GregorianCalendar();
	      int cYear=now.get(Calendar.YEAR);//2023
	      
	      //성별코드 "1" -> 1
	      int myCode=Integer.parseInt(juminno.substring(6,7));
	      
	      int myYear=0,myMonth=0, myDate=0;
	      myYear = Integer.parseInt(juminno.substring(0, 2)); //89 태어난 년도
	      myMonth = Integer.parseInt(juminno.substring(2, 4));
	      myDate = Integer.parseInt(juminno.substring(4,6));
	      
	      switch(myCode) {
	      case 1 :
	      case 2 : myYear=1900+myYear; break;
	      case 3 : 
	      case 4 : myYear=2000+myYear; break;
	      }// switch end
	      
	      //나이 구하기
	      int myAge=cYear-myYear;
	      
	      String gender="";
	      switch(myCode%2) {
	      case 0 : gender="여자"; break;
	      case 1 : gender="남자"; break;
	      }//switch end
	      
	      String[] animal = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
	      
	      System.out.println("주민번호: "+juminno);
	      System.out.println("생년월일: "+myYear+"년"+myMonth+"월"+myDate+"일");
	      System.out.println("나이: "+myAge);
	      System.out.println("성별: "+gender);
	      System.out.println("띠: "+animal[myYear%12]);
	      
	      
	      //문제) 살아온 날수 구하기
	}//disp() end
	
}//class end
