package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		
		
		byte[] array = {10, 20, 30, 40, 50}; // �迭�� ��Ƽ� �ѹ濡 ����������~
		
		os.write(array, 1, 3); // �迭�� 1�� �ε������� 3���� ���
		
		
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ���� ����
		
		
	}

}
