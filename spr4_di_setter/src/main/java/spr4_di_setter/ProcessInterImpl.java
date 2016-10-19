package spr4_di_setter;

public class ProcessInterImpl implements ProcessInter{
	private int age;
	private String name;
	private ShowInter showInter;
	
	public void setShowInter(ShowInter showinter) {
		this.showInter = showinter;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void print(){
		showInter.showName(name);
		showInter.showMessage(" 나이 : " + age);
	}
}
