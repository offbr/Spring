package pack;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("my")
public class MyProcess {
	private String part;
	
	@Value("#{dataInfo.name}") //spEL -- 동적으로 표현식을 해석 (springEL) //getter를 읽음
	private String name;
	
	//public MyProcess(String part) {
	@Autowired //맵핑
	//public MyProcess(@Value("판매부")String part) {
	public MyProcess(@Value("#{dataInfo.part}")String part) {
		System.out.println("생성자");
		this.part = part;
	}
	
	@Value("#{dataInfo.job}") //public //public은 그냥 읽어올수 있다 private는 getter가 있어야한다.
	private String job;
	
	@Value("30") //기본 String type
	private int age;
	
	@Value("1, 2, 3, 4") //배열 초기치 부여
	private int arr[];
	
	@PostConstruct //jdk 지원하는 annotation - 초기화 작업 담당
	public void hi(){
		System.out.println("생성자 수행 후 처리됨");
	}
	
	@PreDestroy //jdk 지원하는 annotation - 마무리 작업 담당
	public void bye(){
		System.out.println("마무리 콘솔에는 안찍힌다");
	}
	
	
	public void showResult(){
		System.out.println("part : " + part);
		System.out.println("name : " + name);
		System.out.println("job : " + job);
		System.out.println("age : " + age);
		System.out.println("age : " + (age + 10));
		System.out.println("arr[0] : " + arr[0]);
	}
}




















