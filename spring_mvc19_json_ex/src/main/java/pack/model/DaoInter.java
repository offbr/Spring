package pack.model;

import java.util.List;
import java.util.Map;

public interface DaoInter {
	int login(Map<String, String> map);
	List<GogekDto> gogekSearch(Map<String, String> map);
	List<BuserDto> buserSearch(Map<String, String> map);
	List<BuserDto> gogekList(Map<String, String> map);
}
