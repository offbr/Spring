package pack.gogek;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.Bank;
import pack.bank.HanaBank;
import pack.bank.ShinhanBank;

@Service //비즈니스 로직
@ComponentScan("pack.bank")
@Scope("prototype")
public class Gogek {
	private Bank bank;
	
	@Autowired(required=true) 	//type에 의한 맵핑
	private ShinhanBank shinhanBank;
		
	@Resource(name="hana") 		// 객체변수명에 의한 맵핑
	private HanaBank hanaBank;
	
	public void selBank(String sel){
		if(sel.equalsIgnoreCase("shinhan")){
			bank = shinhanBank;
		}else if(sel.equalsIgnoreCase("hana")){
			bank = hanaBank;
		}
	}
	
	public void playInputMoney(int money){
		bank.inputMoney(money);
	}
	
	public void playOutputMoney(int money){
		bank.outputMoney(money);
	}
	
	private String msg;
	
	@PostConstruct
	public void init(){
		msg = "계좌잔고는 ";
	}
	
	public void showMoney(){
		//System.out.println("계좌 잔고 : " + bank.getMoney());
		System.out.println(msg + bank.getMoney());
	}
	
}





















