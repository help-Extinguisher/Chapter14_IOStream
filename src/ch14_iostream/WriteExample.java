package ch14_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
//	public static void main(String[] args) throws IOException {
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);	// 1byte�� ���
		os.write(c);
		
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ���� ����
		
		
	}

}
