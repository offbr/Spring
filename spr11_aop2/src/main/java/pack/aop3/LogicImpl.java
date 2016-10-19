package pack.aop3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter {
	private ArticleInter articleInter;
	@Autowired
	public LogicImpl(ArticleInter articleInter) {
		this.articleInter = articleInter;
	}
	
	@Override
	public void selectData_process() {
		System.out.println("selectData_process 수행");
		articleInter.selectAll();
	}
}
