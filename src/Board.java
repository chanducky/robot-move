
/**
 * @author chandrakumar
 *
 */
public class Board {
	int row;
	int col;
	
	int[][] board = null;
	
	void init(int[][] board){
		this.board=board;
	}
	
	void printBoard(){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.print(" " + board[i][j]);
			}
			System.out.println(" ");
		}
	}
	
}
