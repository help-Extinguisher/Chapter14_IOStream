package ch14_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db"); // 데이터 출발지를 test1.db로 하는 바이트 기반 파일 입력 스트림을 생성
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer); // 배열 길이만큼 읽기
			if(readByteNum == -1) break; // 파일 끝에 도달했을 경우
			
			// 읽은 바이트 수 만큼 반복하면서 배열에 저장된 바이트를 출력
		for (int i=0; i<readByteNum; i++) { 
			System.out.println(buffer[i]);
			
		}
	}
		is.close(); // 입력 스트림을 닫음
	}
}
