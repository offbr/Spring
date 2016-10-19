package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import other.MyInfo;
import other.OutFileInterImpl;

@Configuration
public class Config {
	@Bean
	public MessageImpl mbean(){
		MessageImpl mbean = new MessageImpl("꼴뚜기", "말미잘", 16, myinfo());
		mbean.setSpec("자바");
		mbean.setInter(outFileInterImpl());
		return mbean;
	}
	
	@Bean
	public MyInfo myinfo(){
		return new MyInfo();
	}
	
	@Bean
	public OutFileInterImpl outFileInterImpl(){
		OutFileInterImpl outFileInterImpl = new OutFileInterImpl();
		outFileInterImpl.setFilePath("c:/work/good.txt");
		return outFileInterImpl;
	}
}
