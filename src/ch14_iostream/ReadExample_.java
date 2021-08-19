package ch14_iostream;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample_ {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while(true) {
			int data = reader.read(); // �� ���ھ� �б�
			if(data == -1) break; // ���� ���� �������� ���
			System.out.println((char)data); // ���ڵ� �Ѱ��� ���ϸ� ���ڷ� ����
		}
		reader.close(); // �Է� ��Ʈ���� ����
	}

}
