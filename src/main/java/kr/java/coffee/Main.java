package kr.java.coffee;

import kr.java.coffee.dto.Product; //패키지가 다르면 import 해야된다

public class Main {

	public static void main(String[] args) {
		System.out.println("마칠시간");
		
		Product p1 = new Product("A001");
		Product p2 = new Product("A001");
		
		System.out.println(p1);
		System.out.println(p2);
	
	
	if(p1.equlas(p2)) {
		System.out.println("같음");
	}else {
		System.out.println("다름");
	}
	//이문장은 GitHub에서 작성
	}

}
