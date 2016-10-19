package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component //객체를 생성
@Service  //객체를 생성 ("senderProcess") //비즈니스로직은 Service / 그외 Component 를 쓴다 
public class SenderProcess {
	//@Autowired //type을 통한 맵핑 : 현재 등록된 빈 중에서 Sender class type 객체를 찾아 맵핑  //setter가 필요없다
	@Autowired(required=true) //true가 기본값 (반드시 있어야한다)//false는 있으면 적용 없으면 x
	@Qualifier("sender2") //동일한 객체에 대한 두 개 이상의 객체명으 구분하고자 할 경우  /다형성을 구사했을때 타입지정
	//private Sender sender;
	private SenderInter senderInter;
	
	/*
	@Autowired //method 이름은 중요하지 않다 (메소드엔 잘 쓰지 않음)
	//public void setSender(Sender sender) {
	public void mbc(Sender sender) {
		this.sender = sender;
	}
	*/
	
	public SenderInter getSender() {
		return senderInter;
	}
	
	public void dispData(){
		senderInter.show();
	}
}















