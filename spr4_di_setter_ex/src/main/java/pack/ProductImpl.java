package pack;

public class ProductImpl implements Product {
	private ProductCalc calc;
	
	public ProductImpl(ProductCalc calc) {
		this.calc = calc;
	}
	
	@Override
	public void productDetail(String name, int su, int dan) {
		System.out.println("상품명 : " + name + ", 수량 : " + su + ", 단가 : " + dan);
		System.out.println(calc.calcResult(name, su, dan));
	}
}
