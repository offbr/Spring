package pack;

public class ProductCalc {
	public String calcResult(String name, int su, int dan){
		int re = su * dan;
		String result = "상품명 " + name + "에 대한 금액은 " + re;
		return result;
	}
}
