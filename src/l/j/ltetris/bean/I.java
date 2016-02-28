package l.j.ltetris.bean;

/**
 * 
 * @author 建
 * |*|
 * |*|
 * |*|
 * |*|
 */
public class I extends Bean {
	
	public I(int color, int x, int y) {
		super(color, x, y);
	}
	/**
	 * 横向
	 */
	private final static int crosswise = 1;
	/**
	 * 纵向
	 */
	private final static int lengthways = 0;
	
	/**
	 * 第一套坐标,纵向
	 */
	private int[] x1 = {0,0,0,0};
	private int[] y1 = {-1,0,1,2};
	/**
	 * 第二套坐标，横向
	 */
	private int[] x2 = {-1,0,1,2};
	private int[] y2 = {0,0,0,0};
	
	@Override
	public int[][] draw() {
		switch (type) {
		case crosswise:
			return new int[][]{x2,y2};
		case lengthways:
			return new int[][]{x1,y1};
		}
		return null;
	}

	@Override
	public boolean canDown(int[][] window) {
		switch (type) {
		case lengthways:
			if(window[y+y1[0]][x+x1[0]]!=0)
				return false;
			if(window[y+y1[1]][x+x1[1]]!=0)
				return false;
			if(window[y+y1[2]][x+x1[2]]!=0)
				return false;
			if(window[y+y1[3]][x+x1[3]]!=0)
				return false;
			break;
		case crosswise:
			if(window[y+y2[0]][x+x2[0]]!=0)
				return false;
			if(window[y+y2[1]][x+x2[1]]!=0)
				return false;
			if(window[y+y2[2]][x+x2[2]]!=0)
				return false;
			if(window[y+y2[3]][x+x2[3]]!=0)
				return false;
			break;
		default:
			break;
		}
		return true;
	}

	@Override
	public void change() {
		type++;
		type %= 2;
	}

}
