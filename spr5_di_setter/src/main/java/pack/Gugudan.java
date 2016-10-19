package pack;

public class Gugudan { //비즈니스 모델
	public int[] guguCalc(int dan){
		int[] cal = new int[9];
		for (int i = 0; i < 9; i++) {
			cal[i] = dan * (i + 1);
		}
		return cal;
	}
}
