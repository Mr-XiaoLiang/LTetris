package l.j.ltetris.option;

import android.graphics.Color;
import android.graphics.PathEffect;

/**
 * 窗口参数类
 * @author 建
 *
 */
public class WindowOption {
	/**
	 * 行数
	 */
	public final int verticalSize;
	/**
	 * 列数
	 */
	public final int horizontalSize;
	/**
	 * 单元格边长
	 */
	public final int squareSide;
	/**
	 * 横向偏移量
	 */
	public final int offsetX;
	/**
	 * 纵向偏移量
	 */
	public final int offsetY;
	/**
	 * 宽度
	 */
	public final int width;
	/**
	 * 高度
	 */
	public final int height;
	/**
	 * 圆角比例
	 */
	public final float round;
	/**
	 * 背景图片地址
	 */
	public final String bgImgPath;
	/**
	 * 背景颜色
	 */
	public final int bgColor;
	/**
	 * 是否显示格子
	 */
	public final boolean showGrid;
	/**
	 * 虚线样式
	 */
	public final PathEffect pathEffect;
	/**
	 * 格子颜色
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
		 * 行数
		 */
		private int verticalSize;
		/**
		 * 列数
		 */
		private int horizontalSize;
		/**
		 * 横向偏移量
		 */
		private int offsetX;
		/**
		 * 纵向偏移量
		 */
		private int offsetY;
		/**
		 * 宽度
		 */
		private int width;
		/**
		 * 高度
		 */
		private int height;
		/**
		 * 单元格边长
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
		 * 圆角比例
		 */
		private float round = 0.2f;
		/**
		 * 背景图片地址
		 */
		private String bgImgPath = "";
		/**
		 * 背景颜色
		 */
		private int bgColor = Color.TRANSPARENT;
		/**
		 * 是否显示格子
		 */
		private boolean showGrid = false;
		/**
		 * 虚线样式
		 */
		private PathEffect pathEffect;
		/**
		 * 格子颜色
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
