package model;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class GogekImpl extends JdbcDaoSupport implements GogekInter{
	@Override
	public List<GogekDto> selectAll() throws DataAccessException {
		RowMapper rowMapper =  new GogekRowMapper();
		return getJdbcTemplate().query("select gogek_no, gogek_name, gogek_tel, gogek_jumin from gogek order by gogek_name asc", rowMapper);
	}
}
