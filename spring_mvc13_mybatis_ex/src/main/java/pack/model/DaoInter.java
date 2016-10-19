package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface DaoInter {
	List<CompanyDto> selectList() throws DataAccessException;
	
	List<BuserDto> buserDetail(String b_no) throws DataAccessException;
	
	List<CompanyDto> buserSearch(String b_no) throws DataAccessException;
}
