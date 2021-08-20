package ch14_1_iostream;

import java.io.*;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = // �⺻ ��Ʈ�� ����
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = // ���� ���� ��Ʈ�� ����
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos); // FileInputStream, FileOutputStream�� �̿��� ���� �ð� ����
		System.out.println("���۸� ������� �ʾ����� :\t" + nonBufferTime + "us");
		
		long bufferTime = copy(bis, bos); // BufferedInputStream, BufferedOutputStream�� �̿��� ���� �ð� ����
		System.out.println("���۸� ������� �� : \t\t" + bufferTime + "us");
		
		 fis.close();
		 fos.close();
		 bis.close();
		 bos.close();
		
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // ���� �ð� ����
		
		// [���� ����] ���� ���Ͽ��� ���� 1byte�� Ÿ�� ���Ϸ� �ٷ� ���
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		os.flush();
		long end = System.nanoTime(); // �� �ð� ����
		return (end-start); // ���翡 �ɸ��ð� ����
	}

}