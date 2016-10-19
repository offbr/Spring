package pack.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.BoardBean;
import pack.resource.BoardAnnoInter;

@Repository
public class BoardDaoImpl implements BoardDaoInter{
	@Autowired
	private BoardAnnoInter inter;
	
	//전체자료
	@Override
	public List<BoardDto> selectDataAll(Map<String, Integer> map) {
		return inter.selectDataAll(map);
	}
	
	//선택자료
	@Override
	public BoardDto selectPart(String num) {
		return inter.selectPart(num);
	}
	
	//검색
	@Override
	public List<BoardDto> selectSearchData(BoardBean bean) {
		return inter.selectSearchData(bean);
	}
	
	//전체 레코드 수
	@Override
	public int totalList() {
		return inter.totalList();
	}
	
	//글 맥스값
	@Override
	public int numList() {
		return inter.numList();
	}
	
	//조회수증가
	@Override
	public void readcntCount(String num) {
		inter.readcntCount(num);
	}
	
	//패스확인
	@Override
	public int checkPass(BoardBean bean) {
		return inter.checkPass(bean);
	}
	
	//등록
	@Override
	public boolean insertData(BoardBean bean) {
		return inter.insertData(bean);
	}
	
	//수정
	@Override
	public boolean updateData(BoardBean bean) {
		return inter.updateData(bean);
	}
	
	//삭제
	@Override
	public boolean deleteData(String num) {
		return inter.deleteData(num);
	}
	
	//답글 onum갱신
	@Override
	public boolean updateOnum(BoardBean bean) {
		boolean b=inter.updateOnum(bean);
		System.out.println(b);
		return b;
	}
	
	//답글
	@Override
	public boolean insertReply(BoardBean bean) {
		return inter.insertReply(bean);
	}
	
	
	@Override
	public boolean updateReply(Map<String, Integer> map) {
		//System.out.println(map.size() + " " + map.get("onum"));
		return inter.updateReply(map);
	}
	
}
