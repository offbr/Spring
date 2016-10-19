package model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface GogekInter {
	List<GogekDto> selectAll() throws DataAccessException;
}
