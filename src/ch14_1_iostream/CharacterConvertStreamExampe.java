package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExampe {
	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		// FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/tes1.txt");
		Writer writer = new OutputStreamWriter(fos);
		// OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� ���� ���
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		// FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� ����
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); // OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� ���� �Է�
		reader.close();
		String data = new String(buffer, 0, readCharNum); // char �迭���� ���� ����ŭ ���ڿ��� ��ȯ
		return data;
	}

}
