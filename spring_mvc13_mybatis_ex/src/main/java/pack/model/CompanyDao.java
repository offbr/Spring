package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao extends SqlSessionDaoSupport implements DaoInter{
	@Autowired
	public CompanyDao(SqlSessionFactory sqlSessionFactory) {
		setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public List<CompanyDto> selectList() throws DataAccessException {
		return getSqlSession().selectList("selectList");
	}
	
	@Override
	public List<BuserDto> buserDetail(String b_no) throws DataAccessException {
		return getSqlSession().selectList("buserDetail", b_no);
	}
	
	@Override
	public List<CompanyDto> buserSearch(String b_no) throws DataAccessException {
		return getSqlSession().selectList("buserSearch", b_no);
	}
}
