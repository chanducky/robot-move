
/**
 * @author chandrakumar
 *
 */
public class BoardCell {
	int x;
	int y;
	int color;
	
	public static void flipCellColor(int[][] board,BoardCell cell){
		if(cell.color==0){
			board[cell.x][cell.y] = 1;
		}else{
			board[cell.x][cell.y] = 0;
		}
	}
	
	BoardCell() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	BoardCell(int x, int y, int color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		if(color==0||color==1){
			this.color = color;	
		}else{
			throw new IllegalArgumentException("Wrong cell color value "+color);
		}
		
	}

	@Override
	public String toString() {
		return "BoardCell [x=" + x + ", y=" + y + ", color=" + color + "]";
	}


	
}
