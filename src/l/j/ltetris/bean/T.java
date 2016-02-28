package l.j.ltetris.bean;

/**
 * 
 * @author 建
 * |***|
 * | * |
 */
public class T extends Bean {

	/**
	 * 初始状态
	 */
	private final static int type0 = 0;
	/**
	 * 顺时针转向90°
	 */
	private final static int type1 = 1;
	/**
	 * 顺时针转向180°
	 */
	private final static int type2 = 2;
	/**
	 * 顺时针转向270°
	 */
	private final static int type3 = 3;
	
	private int[] x0 = {-1,0,1,0};
	private int[] y0 = {0,0,0,1};
	private int[] x1 = {0,0,0,-1};
	private int[] y1 = {-1,0,1,0};
	private int[] x2 = {1,0,-1,0};
	private int[] y2 = {0,0,0,-1};
	private int[] x3 = {0,0,0,1};
	private int[] y3 = {1,0,-1,0};

	@Override
	public int[][] draw() {
		switch (type) {
		case type0:
			return new int[][]{x0,y0};
		case type1:
			return new int[][]{x1,y1};
		case type2:
			return new int[][]{x2,y2};
		case type3:
			return new int[][]{x3,y3};
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
		case type2:
			if(window[y+y2[0]][x+x2[0]]!=0)
				return false;
			if(window[y+y2[1]][x+x2[1]]!=0)
				return false;
			if(window[y+y2[2]][x+x2[2]]!=0)
				return false;
			if(window[y+y2[3]][x+x2[3]]!=0)
				return false;
			break;
		case type3:
			if(window[y+y3[0]][x+x3[0]]!=0)
				return false;
			if(window[y+y3[1]][x+x3[1]]!=0)
				return false;
			if(window[y+y3[2]][x+x3[2]]!=0)
				return false;
			if(window[y+y3[3]][x+x3[3]]!=0)
				return false;
			break;
		}
		return true;
	}


	@Override
	public void change() {
		type++;
		type%=4;
	}

	public T(int color, int x, int y) {
		super(color, x, y);
	}

}
