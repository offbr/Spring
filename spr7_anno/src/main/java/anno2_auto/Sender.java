package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component //xml을 거치지 않고 객체를 만든다
@Component("sender")
@Scope("singleton") // @Scope("prototype")  //기본 싱글톤
public class Sender implements SenderInter{
	@Override
	public void show(){
		System.out.println("show 메소드 수행");
	}
}
