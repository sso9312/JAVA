package oop0911;

public class Test07_quiz {

	public static void main(String[] args) {
		// 문제)주민번호의 각 숫자의 합을 구하시오
		//8+9+1+2+3+0+1+2+3+4+5+6+7
		
		String jumin="8912301234567";
		
		//1)Character클래스
		//System.out.println(8);	//int
		//System.out.println('8');//char
		//System.out.println("8");//String
		int sum = 0;
		for(int i=0; i<jumin.length(); i++) {
			char ch = jumin.charAt(i); //'8'
			//'8' - > 8
			sum = sum + Character.getNumericValue(ch);
		}//for end
		
		/*
		int sum = 0;
		for(int i=0; i<jumin.length(); i++) {
			sum = sum + (int) jumin.charAt(i) - 48;
		}
		System.out.println(sum);
		*/ //이상민
		
		/*
		ch[i] = jumin.charAt(i);
		sum += Character.getNumericValue(ch[i]);*/ //김동훈
		
		System.out.println(sum);
		
		//2)Integer클래스
		int hap = 0;
		for(int i=0; i<jumin.length(); i++) {
			//"8" ->8
			hap = hap + Integer.parseInt(jumin.substring(i, i+1)); //"8"
		}//for end
		
		System.out.println(hap);
	
	}//main() end
}//class end
