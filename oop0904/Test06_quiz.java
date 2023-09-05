package oop0904;

public class Test06_quiz {

	public static void main(String[] args) {
		//연습문제
		//참조 : 지폐갯수 구하는 문제
		/*
			1년 : 365.2422일
			출력결과 : 365일 5시간 48분 46초 
		
			1분 : 60초
			1시간 : 60분 * 60초 = 3600초
			1일 : 24시간 * 3600초 = 86400초
			1년 : 365.2422일 * 86400초 = 31,556,926.08
		 */
		
		double year=365.2422;
		
		int total=(int)(year*86400); //31,556,926
		System.out.println(total);
		
		int day=total/86400;
		System.out.println(day+"일"); //365
		
		total=total%86400;
		int hour=total/3600;
		System.out.println(hour+"시간"); //5
		
		total=total%3600;
		int minute=total/60;
		System.out.println(minute+"분"); //48
		
		int second=total%60;
		System.out.println(second+"초"); //46

	}//main() end
}//class end
