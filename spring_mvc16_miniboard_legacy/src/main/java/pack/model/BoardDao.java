package pack.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.BoardBean;

@Repository
public class BoardDao {
	private DataSource ds;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	@Autowired
	public BoardDao(DataSource dataSource) {
		try {
			this.ds = dataSource;			
		} catch (Exception e) {
			System.out.println("DB Connection err : " + e);
		}
	}
	
	//전체보기
	public List<BoardDto> list(){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		
		try {
			String sql = "select * from springboard order by num desc";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				BoardDto dto = new BoardDto();
				dto.setNum(rs.getInt("num"));
				dto.setAuthor(rs.getString("author"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setBwrite(rs.getString("bwrite"));
				dto.setReadcnt(rs.getInt("readcnt"));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("list err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//글쓰기
	public boolean writeDate(BoardBean bean){
		boolean b = false;
		try {
				String sql = "insert into springboard(author, title, content) value(?, ?, ?)";
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bean.getAuthor());
				pstmt.setString(2, bean.getTitle());
				pstmt.setString(3, bean.getContent());
				int re = pstmt.executeUpdate();
				if(re > 0) b = true;
		} catch (Exception e) {
			System.out.println("writeDate err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
	//검색
	public List<BoardDto> search(String name, String value){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		
		try {
			conn = ds.getConnection();
			String sql = "select * from springboard where " + name + " like ? order by num desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + value + "%");
			rs = pstmt.executeQuery();
			while(rs.next()){
				BoardDto dto = new BoardDto();
				dto.setNum(rs.getInt("num"));
				dto.setAuthor(rs.getString("author"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setBwrite(rs.getString("bwrite"));
				dto.setReadcnt(rs.getInt("readcnt"));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("search err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//상세보기
	public BoardDto detail(String num){
		BoardDto boardDto = new BoardDto();
		try {
			String sql = "select * from springboard where num = ? order by num desc";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()){
				boardDto.setNum(rs.getInt("num"));
				boardDto.setAuthor(rs.getString("author"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setBwrite(rs.getString("bwrite"));
				boardDto.setReadcnt(rs.getInt("readcnt"));
			}
		} catch (Exception e) {
			System.out.println("detail err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return boardDto;
	}
	
	//조회수 증가
	public boolean updateReadcnt(String num){
		boolean b = false;
		try {
				String sql = "update springboard set readcnt=readcnt+1 where num = ?";
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, num);
				if(pstmt.executeUpdate() > 0) b = true;
		} catch (Exception e) {
			System.out.println("updateDate err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
	
	//업데이트
	public boolean updateDate(BoardBean bean){
		boolean b = false;
		try {
				String sql = "update springboard set author=?, title=?, content=? where num = ?";
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bean.getAuthor());
				pstmt.setString(2, bean.getTitle());
				pstmt.setString(3, bean.getContent());
				pstmt.setInt(4, bean.getNum());
				if(pstmt.executeUpdate() > 0) b = true;
		} catch (Exception e) {
			System.out.println("updateDate err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
	//삭제
	public boolean deleteDate(String num){
		boolean b = false;
		try {
				String sql = "delete from springboard where num = ?";
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, num);
				if(pstmt.executeUpdate() > 0) b = true;
		} catch (Exception e) {
			System.out.println("writeDate err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
}


















