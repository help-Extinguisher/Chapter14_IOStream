package ch14_2_streamlib;

import java.text.SimpleDateFormat;

// 강사님 코드의 ObjectStreamExample . Board에 연결되어있는것
//(교과서에 있는건 ObjectStreamExample_ 참조)

public class ObjectStreamExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		BoardUtil util = new BoardUtil();
				
		// 리스트 직렬화
		util.write();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board b : util.read()) {
			System.out.printf("%d\t %s\t %s\t %s\t %s\n", 
								b.getBno(), b.getTitle(), b.getContent(), b.getWriter(), sdf.format(b.getDate()));
		}
		
	}

}
