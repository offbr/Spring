package pack.resource;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pack.controller.BoardBean;
import pack.model.BoardDto;

public interface BoardAnnoInter {
	
	@Select("select * from board order by gnum desc, onum asc limit #{pageChoice}, ${pageList}")
	List<BoardDto> selectDataAll(Map<String, Integer> map);
	
	@Select("select * from board where num=#{num}")
	BoardDto selectPart(String num);
	
	//검색
	@Select("select * from board where ${stype} like concat('%', #{sword}, '%') order by gnum desc, onum asc limit #{pageChoice}, ${pageList}")
	List<BoardDto> selectSearchData(BoardBean bean);
		
	//전체레코드 수
	@Select("select count(*) from board") 
	int totalList();
	
	//글 맥스값
	@Select("select max(num) from board") 
	int numList();
	
	//조회수 증가
	@Select("update board set readcnt=readcnt + 1 where num=#{num}")
	void readcntCount(String num);
	
	//수정 및 삭제시 패스 확인
	@Select("select count(*) from board where num=#{num} and pass=#{pass}")
	int checkPass(BoardBean bean);
	
	//새글
	@Insert("insert into board values(#{num}, #{name}, #{pass}, #{mail}, #{title}, #{cont}, #{bip}, now(), 0, #{gnum}, 0, 0)")
	boolean insertData(BoardBean bean);
	
	@Update("update board set name=#{name}, pass=#{pass}, mail=#{mail}, title=#{title}, cont=#{cont} where num=#{num}")
	boolean updateData(BoardBean bean);
	
	@Delete("delete from board where num=#{num}")
	boolean deleteData(String num);
	
	//답글
	@Insert("insert into board values(#{num}, #{name}, #{pass}, #{mail}, #{title}, #{cont}, #{bip}, now(), 0, #{gnum}, #{onum}, #{nested})")
	boolean insertReply(BoardBean bean);

	//답글 onum 갱신
	//같은 그룹의 레코드는 모두 작업에 참여 - 같은 그릅의 onum 값 변경
	//댓글의 onum은 이미 db에 있는 onum 보다 크거나 같은 값을 변경
	@Update("update board set onum=onum + 1 where onum >= #{onum} and gnum=#{gnum}")
	boolean updateReply(Map<String, Integer> map);
	
	@Update("update board set onum=onum + 1 where onum >=#{onum} and gnum=#{gnum}")
	boolean updateOnum(BoardBean bean);
	
	
}
