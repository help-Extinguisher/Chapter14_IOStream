package ch14_1_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt"); // ������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 1, 3); // �迭�� 1�� �ε������� 3���� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ���۸� ����
	}

}
