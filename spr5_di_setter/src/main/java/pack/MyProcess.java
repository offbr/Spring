package pack;

public class MyProcess {
	private String name;
	private Gugudan gugudan;
	private int dan;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGugudan(Gugudan gugudan) { //객체가 넘어온다
		this.gugudan = gugudan;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public String toString() {
		int[] result = gugudan.guguCalc(dan);
		String str = "";
		for (int i = 0; i < result.length; i++) {
			str += dan + " * " + (i + 1) + " = " + result[i] + "\n";
		}
		return "작성자: " + name + "\n" + dan + "단 결과\n" + str;
	}
	
}
