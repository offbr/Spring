package pack;

import java.util.Scanner;

public class ProductProcess {
	private Product product;
	private String name;
	private int su, dan;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSu(int su) {
		this.su = su;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void inputProduct(){
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 : ");
		this.name = sc.next();
		System.out.println("수량 : ");
		this.su = sc.nextInt();
		System.out.println("단가 : ");
		this.dan = sc.nextInt();
		*/
		product.productDetail(name, su, dan);
	}
}
