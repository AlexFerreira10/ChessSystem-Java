package boardGame;

public abstract class Piece {
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
	
	public abstract boolean[][] possibleMoves();
	
	//HookMethods = funcao concreta puxando uma funcao abstrata
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		
		for(int i = 0; i < mat.length; i++ ) {
			for(int j = 0; j < mat.length; j++ ) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
