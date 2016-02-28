package l.j.ltetris.bean;

/**
 * 
 * @author 建
 * |** |
 * | **|
 */
public class Z extends Bean {

	/**
	 * 初始状态
	 */
	private final static int type0 = 0;
	/**
	 * 顺时针转向90°
	 */
	private final static int type1 = 1;

	private int[] x0 = {-1,0,0,1};
	private int[] y0 = {0,0,1,1};
	private int[] x1 = {0,0,-1,-1};
	private int[] y1 = {-1,0,0,1};
	
	@Override
	public int[][] draw() {
		switch (type) {
		case type0:
			return new int[][]{x0,y0};
		case type1:
			return new int[][]{x1,y1};
		}
		return null;
	}

	@Override
	public boolean canDown(int[][] window) {
		switch (type) {
		case type0:
			if(window[y+y0[0]][x+x0[0]]!=0)
				return false;
			if(window[y+y0[1]][x+x0[1]]!=0)
				return false;
			if(window[y+y0[2]][x+x0[2]]!=0)
				return false;
			if(window[y+y0[3]][x+x0[3]]!=0)
				return false;
			break;
		case type1:
			if(window[y+y1[0]][x+x1[0]]!=0)
				return false;
			if(window[y+y1[1]][x+x1[1]]!=0)
				return false;
			if(window[y+y1[2]][x+x1[2]]!=0)
				return false;
			if(window[y+y1[3]][x+x1[3]]!=0)
				return false;
			break;
		}
		return true;
	}

	@Override
	public void change() {
		type++;
		type%=2;
		
	}

	public Z(int color, int x, int y) {
		super(color, x, y);
	}

}
