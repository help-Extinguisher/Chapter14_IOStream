package ch14_iostream;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample_ {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while(true) {
			int data = reader.read(); // 한 문자씩 읽기
			if(data == -1) break; // 파일 끝에 도달했을 경우
			System.out.println((char)data); // 디코딩 한거임 안하면 숫자로 나옴
		}
		reader.close(); // 입력 스트림을 닫음
	}

}
