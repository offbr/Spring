package pack.model;

import java.util.List;
import org.springframework.dao.DataAccessException;

public interface DataInter {
	List<SangpumDto> list() throws DataAccessException;
}
