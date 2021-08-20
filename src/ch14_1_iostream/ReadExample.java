package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db"); // ������ ������� test1.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� ����
		while(true) {
			int data = is.read(); // 1byte�� �б�
			if(data == -1) break; // ���� ���� �������� ���
			System.out.println(data);
		}
		is.close(); // �Է� ��Ʈ���� ����
	}
}
