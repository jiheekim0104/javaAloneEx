package ch15.q7;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> boardList = new LinkedList<Board>();
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
		return boardList;
	}

}
