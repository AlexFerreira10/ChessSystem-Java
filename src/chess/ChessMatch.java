package chess;

import boardGame.Board;

//Game rules
public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		//Transforming an common board into a chess board, because the idea is work
		//with layers and the main program will see only chess board
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
