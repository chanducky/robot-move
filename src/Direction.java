
/**
 * @author chandrakumar
 *
 */
enum Direction {
	RIGHT(0,1),
	BOTTOM(1,0),
	LEFT(0,-1),
	TOP(-1,0);
	
	final private int x;
	final private int y;

	private Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static Direction getDirection(int indx){
		 if(indx==0){
			 return RIGHT;
		 }else if(indx==1){
			 return BOTTOM;
		 }
		 else if(indx==2){
			 return LEFT;
		 }else if(indx==3){
			 return TOP;
		 }
		 
		 return null;
	 }
	
}

