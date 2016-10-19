package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public class DataDao extends JdbcDaoSupport{	
	@Autowired
	private DataSource ds;

	@PostConstruct
	public void init() {
		setDataSource(ds);
	}
	
	
	public List<SangpumDto> getDataAll(){
		String sql = "select * from sangdata";
		return getJdbcTemplate().query(sql, new ItemRowMapper());
	}
	
	
	//내부 클래스
	class ItemRowMapper implements RowMapper{
		public Object mapRow(ResultSet rs, int row) throws SQLException{
			SangpumDto dto = new SangpumDto();
			dto.setCode(rs.getString(1));
			dto.setSang(rs.getString(2));
			dto.setSu(rs.getString(3));
			dto.setDan(rs.getString(4));
			return dto;
		}
	}
} 














 
