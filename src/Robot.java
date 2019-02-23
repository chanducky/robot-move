/**
 * @author chandrakumar
 *
 */
public class Robot {
	private  BoardCell currentPos;
	
	int face=0;

	public void move(int[][] board,int K){
		while(K>0){
			
			moveHelper(board);
			--K;
		}
	}
	
	private void moveHelper(int[][] board){

		
		if(currentPos.color==0){
			rotateRight();
			
			int nextPosX =currentPos.x+Direction.getDirection(face).getX();
			int nextPosY= currentPos.y+Direction.getDirection(face).getY();
			
			if(nextPosX==board.length|| nextPosY==board[0].length|| nextPosX<0 ||  nextPosY<0 ){
				//do nothing 
			}else{
				BoardCell.flipCellColor(board, currentPos);
				
				currentPos.x=nextPosX;
				currentPos.y = nextPosY;
				currentPos.color=board[nextPosX][nextPosY];
				
			}
		}else{
			rotateLeft();
			int nextPosX =currentPos.x+Direction.getDirection(face).getX();
			int nextPosY= currentPos.y+Direction.getDirection(face).getY();
			
			if(nextPosX==board.length || nextPosX<0 || nextPosY==board[0].length || nextPosY<0){
				//do nothing 
			}else{
				
				BoardCell.flipCellColor(board, currentPos);
				
				currentPos.x=nextPosX;
				currentPos.y = nextPosY;
				currentPos.color=board[nextPosX][nextPosY];
				
			}
		}
	}

	private void rotateRight(){
		this.face = (face+1)%4;
	}

	private void rotateLeft(){
		this.face = (face-1);
		if(face<1){
			this.face=(face+4)%4;
		}

	}

	public BoardCell getCurrentPos() {
		return currentPos;
	}

	public void setCurrentPos(BoardCell currentPos) {
		this.currentPos = currentPos;
	}

	@Override
	public String toString() {
		return "Robot [currentPos=" + currentPos + ", face=" + Direction.getDirection(face) + "]";
	}
	
}
