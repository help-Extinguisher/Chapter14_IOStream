package ch14_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db"); // ������ ������� test1.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� ����
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer); // �迭 ���̸�ŭ �б�
			if(readByteNum == -1) break; // ���� ���� �������� ���
			
			// ���� ����Ʈ �� ��ŭ �ݺ��ϸ鼭 �迭�� ����� ����Ʈ�� ���
		for (int i=0; i<readByteNum; i++) { 
			System.out.println(buffer[i]);
			
		}
	}
		is.close(); // �Է� ��Ʈ���� ����
	}
}
