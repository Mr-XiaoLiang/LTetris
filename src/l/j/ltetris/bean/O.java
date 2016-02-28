package l.j.ltetris.bean;

/**
 * 
 * @author ½¨
 * |**|
 * |**|
 */
public class O extends Bean {

	private int[] x0 = {0,1,0,1};
	private int[] y0 = {0,0,1,1};
	
	@Override
	public int[][] draw() {
		return new int[][]{x0,y0};
	}

	@Override
	public boolean canDown(int[][] window) {
		if(window[y+y0[0]][x+x0[0]]!=0)
			return false;
		if(window[y+y0[1]][x+x0[1]]!=0)
			return false;
		if(window[y+y0[2]][x+x0[2]]!=0)
			return false;
		if(window[y+y0[3]][x+x0[3]]!=0)
			return false;
		return true;
	}


	@Override
	public void change() {
		
	}

	public O(int color, int x, int y) {
		super(color, x, y);
	}
	
}
