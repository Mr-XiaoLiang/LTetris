package l.j.ltetris.bean;


public abstract class Bean {
	/**
	 * ������ɫ
	 */
	protected int[] color;
	/**
	 * ��������
	 */
	protected int x = 0;
	/**
	 * ��������
	 */
	protected int y = 0;
	/**
	 * ��ǰ�������ʽ״̬
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
	 * ���Ʒ���
	 * @param canvas
	 */
	public abstract int[][] draw();
	/**
	 * �Ƿ��������
	 * @param window
	 * @return
	 */
	public abstract boolean canDown(int[][] window);
	/**
	 * ��������
	 * @param x
	 * @param y
	 */
	public void setXY(int x,int y){
		this.x = x;
		this.y = y;
	};
	/**
	 * �л�����һ��״̬
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
