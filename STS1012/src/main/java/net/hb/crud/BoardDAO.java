package net.hb.crud;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//org.mybatis.spring.SqlSessionTemplate
@Repository
public class BoardDAO {
	
	public void boardInsert(BoardDTO dto) {
		
	};//end
	public List<BoardDTO> boardSelect() {
		List<BoardDTO> list= null;
		return list;
	};//end
	
	public BoardDTO boardDetail(int sabun) {
		BoardDTO dto = null;
		return dto;
	};//end
	
	public int boardCount() {
		return 340;
	};//end
	
	public void boardDelete(int data) {
		
	};//end
	
	public void boardEdit() {
		
	};//end
}
