package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		
		
		byte[] array = {10, 20, 30}; // �迭�� ��Ƽ� �ѹ濡 ����������~
		
		os.write(array); // �迭�� ��� ����Ʈ�� ���
		
		
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ���� ����
		
		
	}

}
