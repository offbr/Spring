package pack.business;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pack.model.CompanyDto;
import pack.model.DaoInter;

@Service("processInterImpl")
public class ProcessInterImpl implements ProcessInter{
	@Resource(name="companyDao")
	private DaoInter daoInter;
	
	@Override
	public void dataShow() {
		List<CompanyDto> list1 = daoInter.sawonList();
		System.out.println("사번\t이름\t부서명\t입사년");
		for(CompanyDto d : list1){
			System.out.println(d.getSawon_no() + "\t" + d.getSawon_name() + "\t" + 
							d.getBuser_name() + "\t" + d.getSawon_ibsail());
		}
		
		List<CompanyDto> list2 = daoInter.buserList();
		System.out.println("부서별\t인원수");
		for(CompanyDto d : list2){
			System.out.println(d.getBuser_name() + "\t" + d.getCount()); 
		}
		
		List<CompanyDto> list3 = daoInter.maxPayList();
		System.out.println("부서별\t최대급여자");
		for(CompanyDto d : list3){
			System.out.println(d.getBuser_name() + "\t" + d.getSawon_name() + "(" + d.getSawon_pay() + ")"); 
		}
	}
}











