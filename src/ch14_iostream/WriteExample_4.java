package ch14_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt"); // ������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		String str = "ABCDEFG";
		
		writer.write(str, 1, 3); // �迭�� 1�� �ε������� 3���� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ���۸� ����
	}

}
