package l.j.ltetris.option;

import android.graphics.Color;
import android.graphics.PathEffect;

/**
 * ���ڲ�����
 * @author ��
 *
 */
public class WindowOption {
	/**
	 * ����
	 */
	public final int verticalSize;
	/**
	 * ����
	 */
	public final int horizontalSize;
	/**
	 * ��Ԫ��߳�
	 */
	public final int squareSide;
	/**
	 * ����ƫ����
	 */
	public final int offsetX;
	/**
	 * ����ƫ����
	 */
	public final int offsetY;
	/**
	 * ���
	 */
	public final int width;
	/**
	 * �߶�
	 */
	public final int height;
	/**
	 * Բ�Ǳ���
	 */
	public final float round;
	/**
	 * ����ͼƬ��ַ
	 */
	public final String bgImgPath;
	/**
	 * ������ɫ
	 */
	public final int bgColor;
	/**
	 * �Ƿ���ʾ����
	 */
	public final boolean showGrid;
	/**
	 * ������ʽ
	 */
	public final PathEffect pathEffect;
	/**
	 * ������ɫ
	 */
	public final int gridColor;
	public WindowOption(Build b) {
		super();
		this.bgColor = b.getBgColor();
		this.bgImgPath = b.getBgImgPath();
		this.gridColor = b.getGridColor();
		this.height = b.getHeight();
		this.horizontalSize = b.getHorizontalSize();
		this.offsetX = b.getOffsetX();
		this.offsetY = b.getOffsetY();
		this.pathEffect = b.getPathEffect();
		this.round = b.getRound();
		this.showGrid = b.isShowGrid();
		this.squareSide = b.getSquareSide();
		this.verticalSize = b.getVerticalSize();
		this.width = b.getWidth();
	}
	
	public static class Build{
		/**
		 * ����
		 */
		private int verticalSize;
		/**
		 * ����
		 */
		private int horizontalSize;
		/**
		 * ����ƫ����
		 */
		private int offsetX;
		/**
		 * ����ƫ����
		 */
		private int offsetY;
		/**
		 * ���
		 */
		private int width;
		/**
		 * �߶�
		 */
		private int height;
		/**
		 * ��Ԫ��߳�
		 */
		private int squareSide;
		public Build(int verticalSize, int horizontalSize, int offsetX,
				int offsetY, int width, int height) {
			super();
			this.verticalSize = verticalSize;
			this.horizontalSize = horizontalSize;
			this.width = width;
			this.height = height;
			this.squareSide = Math.min(width/horizontalSize, height/verticalSize);
			this.offsetX = offsetX+(width/2-squareSide*horizontalSize/2);
			this.offsetY = offsetY+(height/2-squareSide*verticalSize/2);
		}
		/**
		 * Բ�Ǳ���
		 */
		private float round = 0.2f;
		/**
		 * ����ͼƬ��ַ
		 */
		private String bgImgPath = "";
		/**
		 * ������ɫ
		 */
		private int bgColor = Color.TRANSPARENT;
		/**
		 * �Ƿ���ʾ����
		 */
		private boolean showGrid = false;
		/**
		 * ������ʽ
		 */
		private PathEffect pathEffect;
		/**
		 * ������ɫ
		 */
		private int gridColor = Color.GRAY;
		public void setRound(float round) {
			this.round = round;
		}
		public void setBgImgPath(String bgImgPath) {
			this.bgImgPath = bgImgPath;
		}
		public void setBgColor(int bgColor) {
			this.bgColor = bgColor;
		}
		public void setShowGrid(boolean showGrid) {
			this.showGrid = showGrid;
		}
		public void setPathEffect(PathEffect pathEffect) {
			this.pathEffect = pathEffect;
		}
		public void setGridColor(int gridColor) {
			this.gridColor = gridColor;
		}
		public int getVerticalSize() {
			return verticalSize;
		}
		public int getHorizontalSize() {
			return horizontalSize;
		}
		public int getOffsetX() {
			return offsetX;
		}
		public int getOffsetY() {
			return offsetY;
		}
		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}
		public int getSquareSide() {
			return squareSide;
		}
		public float getRound() {
			return round;
		}
		public String getBgImgPath() {
			return bgImgPath;
		}
		public int getBgColor() {
			return bgColor;
		}
		public boolean isShowGrid() {
			return showGrid;
		}
		public PathEffect getPathEffect() {
			return pathEffect;
		}
		public int getGridColor() {
			return gridColor;
		} 
		
	}
	
}
