package oop0915;

import java.io.File;

public class Test04_File {

	public static void main(String[] args) {
		// File 클래스
		//->파일과 관련된 정보를 알 수 있다
		//->파일명, 파일크기, 확장명, 파일타입 ~~
		
		try {
			//예외 발생이 예상되는 코드 작성
			
			//경로명 + 파일명
			
			//경로명으로 \기호를 사용하려면 \\기호를 2번씩 사용함
			//String pathName = "D:\\java202307\\학습모듈";
			
			//경로명으로 / 기호도 사용가능하다
			String pathName = "D:/java202307/학습모듈/LM2001020224_화면설계.pdf";
			
			//File클래스에 파일담기
			File file = new File(pathName);
			
			if(file.exists()) {
				System.out.println("파일 있어요~~");
				
				long filesize = file.length();
				System.out.println("파일크기 : " + filesize);
				System.out.println("파일크기 : " + filesize/1024 + "KB");
				System.out.println("파일크기 : " + filesize/1024/1024 + "MB");
				
				String filename=file.getName();
				System.out.println("파일명:" +filename);
				
				//문) 파일명과 확장명을 분리해서 출력하시오
				//	 파일명 : 20230720_frontend
				//	 확장명 : pdf
				int lastdot=filename.lastIndexOf("."); //마지막 . 의 위치
				String name=filename.substring(0, lastdot);
				String ext=filename.substring(lastdot+1);
				System.out.println("파일명"+name);
				System.out.println("확장명"+ext);
			
				/*
				//파일삭제
				//->실제 파일이 삭제되니 복사본 남겨 놓으시기 바랍니다
				if(file.delete()) {
					System.out.println(filename+"파일이 삭제 되었씁니다~");
				}else {
					System.out.println(filename+"파일 삭제 실패!!");
				}//if end
				*/
			
				}else {
					System.out.println("파일 없어요!!");
				}//if end
				

		}catch (Exception e) {
			//예외가 발생되면 처리할 코드를 작성
			e.printStackTrace();
		}//end
		
		System.out.println("END");
		
	}//main() end
}//class end
