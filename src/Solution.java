
/**
 * @author chandrakumar
 *
 */
public class Solution {

	public static void main(String[] args) {
		int K=5;
		
		Board boardObj = new Board();
		
		int[][] matrix = {{0,1,0,1},{1,0,0,1},{0,0,1,0}};
		boardObj.init(matrix);
		
		// print initialization
		boardObj.printBoard();
		
		
		Robot robot = new Robot();
		robot.face=0;
		
		BoardCell currentPos = new BoardCell(0,1,boardObj.board[0][1]);
		robot.setCurrentPos(currentPos);
		robot.move(boardObj.board, K);
		
		
		System.out.println(" ");
		
		// print final
		boardObj.printBoard();
		
		
		System.out.println(" Robot Position = "+robot.toString());
		
	}

}
