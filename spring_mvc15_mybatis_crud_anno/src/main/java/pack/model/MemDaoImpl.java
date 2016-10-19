package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.MemBean;
import pack.resource.MemAnnoInter;

@Repository
public class MemDaoImpl implements MemDaoInter{
	@Autowired
	private MemAnnoInter memAnnoInter;
	
	//전체자료
	@Override
	public List<MemDto> getDataAll() {
		return memAnnoInter.selectDataAll();
	}
	
	//부분자료
	@Override
	public MemDto selectPart(String num) {
		return memAnnoInter.selectPart(num);
	}
	
	@Override
	public boolean insertData(MemBean bean) {
		try {
			memAnnoInter.insertData(bean);
			return true;
		} catch (Exception e) {
			System.out.println("insertData err : " + e);
		}
		return false;
	}
	
	@Override
	public boolean updateData(MemBean bean) {
		try {
			memAnnoInter.updateData(bean);
			return true;
		} catch (Exception e) {
			System.out.println("updateData err : " + e);
		}
		return false;
	}
	
	@Override
	public boolean deleteData(String num) {
		boolean re = memAnnoInter.deleteData(num);
		if(re) return true;
		else return false;
	}
}









