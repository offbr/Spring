package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;

@Repository
public class CompanyDao implements DaoInter{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	@Override
	public List<CompanyDto> sawonList() {
		SqlSession session = factory.openSession();
		List<CompanyDto> list = null;
		
		try {
			list = session.selectList("sawonList");
		} catch (Exception e) {
			System.out.println("sawonList err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
	@Override
	public List<CompanyDto> buserList() {
		SqlSession session = factory.openSession();
		List<CompanyDto> list = null;
		
		try {
			list = session.selectList("buserList");
		} catch (Exception e) {
			System.out.println("buserList err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
	@Override
	public List<CompanyDto> maxPayList() {
		SqlSession session = factory.openSession();
		List<CompanyDto> list = null;
		
		try {
			list = session.selectList("maxPayList");
		} catch (Exception e) {
			System.out.println("maxPayList err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
}







