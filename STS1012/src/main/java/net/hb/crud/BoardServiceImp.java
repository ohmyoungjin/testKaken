package net.hb.crud;

import java.util.List;

public interface BoardServiceImp {
	public void board_ServiceInser();
	public List board_ServiceSelect();
	public void board_ServiceDetail(int data);
	public int board_ServiceCount();
	public void board_ServiceDelete(int data);
	public void board_ServieceEdit();
	
		
}//interface END
