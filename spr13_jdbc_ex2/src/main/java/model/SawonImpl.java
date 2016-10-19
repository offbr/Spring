package model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SawonImpl extends JdbcDaoSupport implements SawonInter{
	@Autowired
	private SawonImpl(DataSource dataSource){
        setDataSource(dataSource);
    }
	
	@Override
	public List<SawonDto> selectAll() throws DataAccessException {
		RowMapper rowMapper =  new SawonRowMapper();
		return getJdbcTemplate().query("select buser_num, sawon_no, sawon_name, buser_name, sawon_jik from sawon inner join buser on buser_num=buser_no", rowMapper);
	}
}
