package ch15.q7;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> boardList = new LinkedList<Board>();
		boardList.add(new Board("力格1", "郴侩1"));
		boardList.add(new Board("力格2", "郴侩2"));
		boardList.add(new Board("力格3", "郴侩3"));
		return boardList;
	}

}
