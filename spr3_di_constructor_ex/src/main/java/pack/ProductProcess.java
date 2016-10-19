package pack;

import java.util.Scanner;

public class ProductProcess {
	private Product product;
	
	public ProductProcess(Product product) {
		this.product = product;
	}
	
	public void inputProduct(){
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 : ");
		String name = sc.next();
		System.out.println("수량 : ");
		int su = sc.nextInt();
		System.out.println("단가 : ");
		int dan = sc.nextInt();
		product.productDetail(name, su, dan);
	}
}
