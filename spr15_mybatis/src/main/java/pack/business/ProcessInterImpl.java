package pack.business;

import java.util.List;

import pack.model.DaoInter;
import pack.model.ProductDto;

public class ProcessInterImpl implements ProcessInter{
	private DaoInter daoInter;
	
	public ProcessInterImpl(DaoInter daoInter) {
		this.daoInter = daoInter;
	}
	
	@Override
	public void dataShow() {
		List<ProductDto> list = daoInter.selectDataAll();
		System.out.println("코드\t상품\t수량\t단가");
		for(ProductDto d : list){
			System.out.println(d.getCode() + "\t" + d.getSang() + "\t" + d.getSu() + "\t" + d.getDan());
		}
	}
}

