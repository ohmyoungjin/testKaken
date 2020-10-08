package net.hb.crud;

import java.util.List;

public interface BoardDAOImp {
	public void boardInsert();
	public List boardSelect();
	public void boardDetail(int data);
	public int boardCount();
	public void boardDelete(int data);
	public void boardEdit();
	
		
}//interface END
