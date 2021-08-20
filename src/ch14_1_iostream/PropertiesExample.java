package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		
		/**
		 * [Properties] 외부설정파일 읽어오기
		 * 	'=' 또는 ':'로 연결된 형태여야 함.
		 * 	주석라인은 첫번째 문자가 '#'이어야 함.
		 * 	경로는 '/'로 해야함.
		 */
		
	
		String path = "src/input.txt";
		
		
		Properties settings = new Properties();
		
		try {
			settings.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("오류 : 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);

		String kName = settings.getProperty("kor_name");
		try {
			kName = new String(kName.getBytes("8859_1"), "EUC-KR"); // 8859-1이 문자셋 이름이라고 한당 (구글에 쳐보면 잘나옴)
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(kName);
		
		String[] data = settings.getProperty("data").split(","); // , 기준으로 스플릿가능
		System.out.println(Arrays.toString(data));
		
		settings.list(System.out);
		
		
		
		
	}

}
