package ch14_1_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_ {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt"); // 데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림을 생성
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a); //
		writer.write(b); // 한 문자씩 출력		
		writer.write(c); //
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close(); // 출력 버퍼를 닫음
	}

}
