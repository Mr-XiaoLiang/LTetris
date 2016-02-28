package l.j.ltetris.bean;


public abstract class Bean {
	/**
	 * 方块颜色
	 */
	protected int[] color;
	/**
	 * 方块坐标
	 */
	protected int x = 0;
	/**
	 * 方块坐标
	 */
	protected int y = 0;
	/**
	 * 当前方块的样式状态
	 */
	protected int type = 0;
	
	public Bean(int color, int x, int y) {
		super();
		this.color = new int[4];
		for(int i = 0;i<this.color.length;i++){
			this.color[i] = color;
		}
		this.x = x;
		this.y = y;
	}
	
	public Bean(int[] color, int x, int y) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
	}

	/**
	 * 绘制方法
	 * @param canvas
	 */
	public abstract int[][] draw();
	/**
	 * 是否可以向下
	 * @param window
	 * @return
	 */
	public abstract boolean canDown(int[][] window);
	/**
	 * 设置坐标
	 * @param x
	 * @param y
	 */
	public void setXY(int x,int y){
		this.x = x;
		this.y = y;
	};
	/**
	 * 切换到下一个状态
	 */
	public abstract void change();

	public int[] getColor() {
		return color;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getType() {
		return type;
	}
	public void down(){
		y++;
	}
	public void leftMove(){
		x--;
	}
	public void rightMove(){
		x++;
	}
	public void up(){
		y--;
	}
}
