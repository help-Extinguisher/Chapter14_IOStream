package ch14_1_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_ {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt"); // ������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a); //
		writer.write(b); // �� ���ھ� ���		
		writer.write(c); //
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ���۸� ����
	}

}
