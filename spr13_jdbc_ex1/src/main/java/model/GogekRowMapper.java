package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GogekRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		GogekDto dto = new GogekDto();
		dto.setGogek_no(rs.getString("gogek_no"));
		dto.setGogek_name(rs.getString("gogek_name"));
		dto.setGogek_tel(rs.getString("gogek_tel"));
		dto.setGogek_jumin(rs.getString("gogek_jumin"));
		return dto;
	}
}
