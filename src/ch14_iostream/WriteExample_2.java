package ch14_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt"); // ������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array); // �迭�� ��� ���ڸ� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ���۸� ����
	}

}
