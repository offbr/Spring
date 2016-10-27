package com.movie.resources;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.movie.model.BoardBean;
import com.movie.model.BoardDto;

public interface MovieAnnoInter {
	
	@Select("select * from board order by b_no desc limit #{pageChoice}, ${pageList}")
	List<BoardDto> selectDataAll(Map<String, Integer> map);
	
	@Select("select * from board where ${stype} like concat('%', #{sword}, '%') order by b_no desc limit #{pageChoice}, ${pageList}")
	List<BoardDto> selectSearchData(Map<String, String> map);
	
	@Select("select * from board where b_no=#{b_no}")
	BoardDto selectPart(String b_no);
	
	@Select("select count(*) from board") 
	int totalCount();
	
	@Select("select max(num) from board") 
	int b_noMax();
	
	@Select("select count(*) from board where b_no=#{b_no} and b_pass=#{b_pass}")
	int checkPass(BoardBean bean);
	
	@Insert("insert into board (b_no, b_name, b_pass, b_email, b_tel, b_title, b_content, b_date, b_state) valuse (?, ?, ?, ?, ?, ?, ?, ?, ?)")
	boolean insertData(BoardBean bean);
	
	@Update("update board set b_name=#{b_name}, b_pass=#{b_pass}, b_email=#{b_email}, b_tel=#{b_tel}, b_title=#{b_title}, b_content=#{b_content} where b_no=#{b_no}")
	boolean updateData(BoardBean bean);
	
	@Delete("delete from board where b_no=#{b_no}")
	boolean deleteData(String b_no);
}
