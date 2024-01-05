package boardGame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece (Board board) {
		this.board = board;
		//Position = null, because don't want to specific start in specific locale
	}
	//Board doesn't have the set mothod, because it cannot be modific
	protected Board getBoard() {
		return board;
	}
	
	
}
