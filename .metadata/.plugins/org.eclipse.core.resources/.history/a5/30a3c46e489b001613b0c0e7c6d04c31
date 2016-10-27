package com.movie.model;

import java.util.List;
import java.util.Map;

public interface BoardDaoInter {
	List<BoardDto> selectDataAll(Map<String, Integer> map);
	List<BoardDto> selectSearchData(Map<String, String> map);
	BoardDto selectPart(String b_no);		
	int totalCount(); 		
	int b_noMax();  
	int checkPass(BoardBean bean);
	boolean insertData(BoardBean bean);
	boolean updateData(BoardBean bean);
	boolean deleteData(String b_no);
}
