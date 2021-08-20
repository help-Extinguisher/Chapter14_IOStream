package ch14_2_streamlib;

import java.util.*;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println(" 1. ���  | 2. ��� | 3. ����");
			System.out.println("-----------------------------------");
			
			System.out.print("���� : ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
			case "1" : registerProduct(); break;
			case "2" : showProducts(); break;
			case "3" : return;
			
			}
			
		}
	}
	
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("��ǰ�� : ");
			product.setName(scanner.nextLine());
			
			System.out.print("���� : ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		} catch(Exception e) {
			System.out.println("��� ���� : " + e.getMessage());
		}
	}
	
	public void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" +
								p.getPrice() + "\t" + p.getStock());
		}
	}
	
}