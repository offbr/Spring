package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SawonRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		SawonDto dto = new SawonDto();
		dto.setBuser_num(rs.getString("buser_num"));
		dto.setSawon_no(rs.getString("sawon_no"));
		dto.setSawon_name(rs.getString("sawon_name"));
		dto.setBuser_name(rs.getString("buser_name"));
		dto.setSawon_jik(rs.getString("sawon_jik"));
		return dto;
	}
}
