package ch14_1_iostream;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample_2 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100]; // ���� 100�� �迭 ����
		
		while(true) {
			int readCharNum = reader.read(buffer); // �迭 ���̸�ŭ �б�
			if(readCharNum == -1) break; // ���� ���� �������� ���
			// ���� ���� ����ŭ �ݺ��ϸ鼭 �迭�� ����� ���ڸ� ���
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
				
			}
			
			
		}
		reader.close(); // �Է� ��Ʈ���� ����
	}

}
