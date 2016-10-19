package business;

import org.springframework.stereotype.Service;

import model.GogekDto;
import model.GogekInter;

@Service
public class BusinessImpl implements BusinessInter{
	private GogekInter gogekinter; 
	
	public void setGogekinter(GogekInter gogekinter) {
		this.gogekinter = gogekinter;
	}
	
	@Override
	public void gogekList() {
		for(GogekDto d : gogekinter.selectAll()){
			if(d.getGogek_jumin().substring(7, 8).equals("1")){
				System.out.println(d.getGogek_no() + "\t" + d.getGogek_name() + "\t" + d.getGogek_tel());
			}
		}
	}	
}
