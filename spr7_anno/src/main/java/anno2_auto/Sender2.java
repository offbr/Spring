package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sender2")
public class Sender2 implements SenderInter{
	@Override
	public void show(){
		System.out.println("show 메소드 수행2");
	}
}
