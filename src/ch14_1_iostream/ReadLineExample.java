package ch14_1_iostream;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		// ���� ��� �Է� ��Ʈ�� ���
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("language.txt").getPath()
				);
		
		BufferedReader br = new BufferedReader(reader); //BufferedReader ���� ��Ʈ�� ����
		
		while(true) {
			String data = br.readLine(); // ���� ���� ���ڿ��� �а� ����
			if(data == null) break; // ���� ���� �������� ���
			System.out.println(data);
		}
		
		br.close(); // �Է� ��Ʈ�� �ݱ�
		
	}

}
