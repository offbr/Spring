package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao extends JdbcDaoSupport {
	/*	
	@Autowired
	private DataSource ds;

	@PostConstruct
	public void init() {
		setDataSource(ds);
	}
	*/	
	
	@Autowired
	public CompanyDao(DataSource ds) {
		setDataSource(ds);
	}
	
	//사원 전체 자료
	public List<SawonDto> getSawonList(){
		String sql = "select sawon_no, sawon_name, sawon_jik, IFNULL(buser_name, '무소속') as buser_name, gogek_no as count"
					+ " from sawon"
					+ " left join buser on buser_num = buser_no"
					+ " left join gogek on gogek_damsano = sawon_no group by sawon_no";
		List<SawonDto> list = getJdbcTemplate().query(sql, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int row) throws SQLException {
				SawonDto dto = new SawonDto();
				dto.setSawon_no(rs.getString("sawon_no"));
				dto.setSawon_name(rs.getString("sawon_name"));
				dto.setSawon_jik(rs.getString("sawon_jik"));
				dto.setBuser_name(rs.getString("buser_name"));
				dto.setCount(rs.getString("count"));
				return dto;
			}
		});
		return list;
	}
	
	//고객 자료
	public List<GogekDto> getGogekList(String s_no){
		String sql = "select gogek_no, gogek_name, gogek_tel,"
				+ " DATE_FORMAT(now(), '%Y') - DATE_FORMAT(SUBSTRING(gogek_jumin, 1, 6), '%Y') as gogek_age,"
				+ " case when gogek_jumin like '%-1%' then '남' when gogek_jumin like '%-2%' then '여' end as gogek_gen"
				+ " from gogek where gogek_damsano = ?";
		List<GogekDto> list = getJdbcTemplate().query(sql, new Object[]{s_no}, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int row) throws SQLException {
				GogekDto dto = new GogekDto();
				dto.setGogek_no(rs.getString("gogek_no"));
				dto.setGogek_name(rs.getString("gogek_name"));
				dto.setGogek_tel(rs.getString("gogek_tel"));
				dto.setGogek_age(rs.getString("gogek_age"));
				dto.setGogek_gen(rs.getString("gogek_gen"));
				return dto;
			}
		});
		return list;
	}
}









